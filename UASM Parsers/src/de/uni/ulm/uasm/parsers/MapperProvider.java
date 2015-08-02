package de.uni.ulm.uasm.parsers;

import org.codehaus.jparsec.Token;
import org.codehaus.jparsec.functors.Binary;
import org.codehaus.jparsec.functors.Map;
import org.codehaus.jparsec.functors.Unary;

public interface MapperProvider {
	Map<Token, UASMNode> getIdentifierMapper();
	Map<Token, UASMNode> getKeywordMapper();
	Map<Token, UASMNode> getOperatorMapper();
	Map<Token, UASMNode> getStringMapper();
	Map<Token, UASMNode> getNumberMapper();
	Map<UASMNode, UASMNode> getMapper(String nonTerminal);
	Binary<UASMNode> getBinaryOperatorMapper(String operator);
	Unary<UASMNode> getUnaryOperatorMapper(String operator);
	Map<Object[], UASMNode> getArrayMapper(String nonTerminal);
}
