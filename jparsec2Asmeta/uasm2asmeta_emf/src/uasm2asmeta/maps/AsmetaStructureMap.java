package uasm2asmeta.maps;

import java.util.HashMap;

import org.codehaus.jparsec.functors.Map;

import asmeta.definitions.domains.Domain;
import asmeta.structure.StructureFactory;

public class AsmetaStructureMap {

	protected StructureFactory structurePack;

	// the declared domains. It associates domain names to the corresponding
	// object.Its tuples are of kind(String,Domain)
	protected HashMap<String, Domain> declared_Dom = new HashMap<String, Domain>();

	public AsmetaStructureMap(StructureFactory structurePack) {
		this.structurePack = structurePack;
	}
}
