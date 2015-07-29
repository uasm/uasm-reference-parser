package de.uni.ulm.uasm.parsers;

import org.codehaus.jparsec.Token;
import org.codehaus.jparsec.functors.Map;

public interface MapperProvider {
	Map<Token, UASMNode> getIdentifierMapper();
	Map<Token, UASMNode> getKeywordMapper();
	Map<Token, UASMNode> getOperatorMapper();
	Map<UASMNode, UASMNode> getMapper(String nonTerminal);
	Map<Object[], UASMNode> getArrayMapper(String nonTerminal);
}
