package uasm2asmeta.maps;

import java.util.List;

import org.codehaus.jparsec.functors.Map;
import org.eclipse.emf.ecore.EObject;

import asmeta.structure.StructureFactory;

abstract class AsmetaCompondStructMap extends AsmetaStructureMap implements Map<Object[], Object> {

	AsmetaCompondStructMap(StructureFactory structurePack) {
		super(structurePack);
	}

	protected static <T> T find(Object[] from, Class<T> clazz) {
		for (Object f : from) {
			if (clazz.isInstance(f))
				return (T) f;
		}
		throw new RuntimeException("class " + clazz + " not found");
	}

	protected static <T> T findAndNull(Object[] from, Class<T> clazz) {
		for (int i = 0; i < from.length; i++) {
			Object f = from[i];
			if (f == null)
				continue;
			if (clazz.isInstance(f)) {
				T toReturn = (T) f;
				from[i] = null;
				return toReturn;
			}
		}
		throw new RuntimeException("class " + clazz + " not found");
	}

	protected void flat(Object[] from, List<Object> dest) {
		for (Object f : from) {
			if (f instanceof Object[]) {
				flat((Object[]) f, dest);
			} else {
				dest.add(f);
			}
		}
	}

}