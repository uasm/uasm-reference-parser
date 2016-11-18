package uasm2asmeta.maps;

import java.util.List;

import org.apache.log4j.Logger;

class AsmetaBodyMap extends AsmetaCompoundStructMap {

	static Logger logger = Logger.getLogger(AsmetaBodyMap.class);

	// Body ::= Definition* ('exec' IdRule)?

	@Override
	public StringBuffer map(Object[] from) {
		List<Object> result = flat(from);
		logger.debug("body - mapping " + result.toString());
		StringBuffer body = new StringBuffer("definitions :\n");
		for (Object f : result) {
			if (f == null)
				continue;
			//logger.debug(f.getClass().getName() + "  " + f.toString());
			body.append(f.toString()).append('\n');
		}
		return body;
	}


}
