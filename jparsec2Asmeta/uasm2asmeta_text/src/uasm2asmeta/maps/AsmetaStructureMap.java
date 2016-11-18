package uasm2asmeta.maps;

import java.util.ArrayList;
import java.util.List;

public abstract class AsmetaStructureMap {

	protected static <T> T findAndRemove(Class<T> clazz, List<Object> from) {
		for (int i = 0; i < from.size(); i++) {
			Object f = from.get(i);
			if (clazz.isInstance(f)) {
				T toReturn = (T) f;
				from.remove(i);
				return toReturn;
			}
		}
		throw new RuntimeException("class " + clazz + " not found");
	}

	protected static List<Object> flat(Object... from) {
		List<Object> result = new ArrayList<>();	
		for (Object f : from) {
			if (f instanceof Object[]) {
				result.addAll(flat((Object[]) f));
			} else {
				result.add(f);
			}
		}
		return result;
	}

	protected static StringBuffer appendFlat(Object[] from) {
		StringBuffer result = new StringBuffer();
		for (Object f : from) {
			if (f == null)
				continue;
			if (f instanceof Object[]) {
				result.append(appendFlat((Object[]) f));
			} else {
				result.append(f.toString()).append('\n');
			}
		}
		return result;
	}

	protected StringBuffer appendSingleFlat(Object[] from) {
		StringBuffer result = new StringBuffer();
		if (from.length == 1 && from[0] instanceof Object[]) {
			return appendFlat((Object[]) from[0]);
		} else {
			for (Object f : from) {
				if (f == null)
					continue;
				result.append(f.toString()).append('\n');
			}
			return result;
		}
	}

	protected static char newline = '\n';

	protected static void appendAndIndent(StringBuffer target, String tobeadded) {
		String[] lines = tobeadded.split("\n");
		for (String l:lines) {
			target.append('\t').append(l).append(newline);
		}
	}

}
