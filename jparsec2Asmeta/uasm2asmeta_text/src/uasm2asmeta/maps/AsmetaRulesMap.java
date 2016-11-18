package uasm2asmeta.maps;

import java.util.List;

import org.apache.log4j.Logger;
import org.codehaus.jparsec.functors.Map;

import de.uni.ulm.uasm.parsers.UASMParsers;

public class AsmetaRulesMap implements Map<Object[], Object> {

	static Logger logger = Logger.getLogger(AsmetaRulesMap.class);
	String ruleType;

	AsmetaRulesMap(String nonTerminal) {
		super();
		logger.debug("creating rule mapper for " + nonTerminal);
		ruleType = nonTerminal;
	}

	// this for DEFINITION
	@Override
	public Object map(Object[] from) {
		List<Object> subnodes = AsmetaStructureMap.flat(from);
		StringBuffer result = new StringBuffer();
		switch (ruleType) {
		case UASMParsers.PAR_BLOCK_RULE:
			result.append("par\n");
			// removethe keywords
			subnodes.remove(0);
			subnodes.remove(subnodes.size()-1);
			for (Object f : subnodes) {
				result.append("\t" + f.toString() + '\n');
			}
			result.append("endpar\n");
			return result;
		default:
			break;
		}
		result = new StringBuffer("[" +ruleType +"]");
		for (Object f : subnodes) {
			if (f == null)
				continue;
			result.append(f.toString() + '\n');
			logger.debug("what subnodes???" + f.getClass().getName() + " - " + f.toString());
		}
		return result;
	}
}

