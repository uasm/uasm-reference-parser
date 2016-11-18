package uasm2asmeta.maps;

import java.util.List;

import org.apache.log4j.Logger;

import de.uni.ulm.uasm.parsers.UASMParsers;
import uasm2asmeta.maps.AsmetaMapProvider.ID;

public class AsmetaDefinitionMap extends AsmetaCompoundStructMap {

	static Logger logger = Logger.getLogger(AsmetaDefinitionMap.class);
	String defType;

	AsmetaDefinitionMap(String nonTerminal) {
		super();
		logger.debug("creating definition mapper for " + nonTerminal);
		defType = nonTerminal;
	}

	// this for DEFINITION
	@Override
	public Object map(Object[] from) {
		StringBuffer result = new StringBuffer();
		List<Object> subnodes = flat(from);
		//logger.debug("definition - mapping " + subnodes.toString().replaceAll("\n", ",") + " [" + from.getClass().getSimpleName() + "]");
		switch (defType) {
		case UASMParsers.CONTROLLED_FUNCTION:
			// id of the function
			String func_name = findAndRemove(ID.class, subnodes).id;
			// id of the domain
			String dom_name = findAndRemove(ID.class, subnodes).id;
			return result.append(amsetkeyword(defType) + " " + func_name + " : " + dom_name + '\n');
		case UASMParsers.RULE_DEFINITION:
			StringBuffer sb = new StringBuffer("rule ");
			subnodes.remove(0);// remove keyword
			sb.append(findAndRemove(ID.class, subnodes).id);
			sb.append(subnodes);
			return sb;			
		}
		logger.debug("definition - mapping " + subnodes.toString());
		for (Object f : subnodes) {
			if (f == null)
				continue;
			result.append(f.toString() + '\n');
			logger.debug("what subnodes???" + f.getClass().getName() + " - " + f.toString());
		}
		return "DEFINITION";
	}

	// transòate to asmeta
	private String amsetkeyword(String def) {
		switch (def) {
		case UASMParsers.CONTROLLED_FUNCTION:
			return "controlled";
		default:
			return def;
		}
	}
}
