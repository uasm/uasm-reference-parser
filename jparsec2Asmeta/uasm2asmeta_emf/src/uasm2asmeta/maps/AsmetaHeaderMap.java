package uasm2asmeta.maps;
import asmeta.structure.Header;
import asmeta.structure.StructureFactory;

class AsmetaHeaderMap extends AsmetaCompondStructMap {

	
	AsmetaHeaderMap(StructureFactory structurePack) {
		super(structurePack);
	}

	@Override
	public Header map(Object[] from) {
		Header header = structurePack.createHeader();
		return header;
	}
	
	

}
