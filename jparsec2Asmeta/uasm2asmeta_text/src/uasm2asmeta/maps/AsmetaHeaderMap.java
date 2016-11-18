package uasm2asmeta.maps;

class AsmetaHeaderMap extends AsmetaCompoundStructMap {

	
	AsmetaHeaderMap() {
		super();
	}

	@Override
	public StringBuffer map(Object[] from) {
		//
		return appendFlat(from);
	}

	
	

}
