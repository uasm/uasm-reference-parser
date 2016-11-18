package uasm2asmeta.maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import asmeta.structure.Body;
import asmeta.structure.StructureFactory;

class AsmetaBodyMap extends AsmetaCompondStructMap {

	static Logger logger = Logger.getLogger(AsmetaBodyMap.class);

	// Body ::= Definition* ('exec' IdRule)?
	AsmetaBodyMap(StructureFactory structurePack) {
		super(structurePack);
	}

	@Override
	public Body map(Object[] from) {
		List<Object> result = new ArrayList<>();
		flat(from, result);
		logger.debug("body - mapping " + result.toString());
		Body body = structurePack.createBody();
		for (Object f : result) {
			if (f == null)
				continue;
			System.out.println(f.getClass().getName() + "  " + f.toString());
		}
		return body;
	}


}
