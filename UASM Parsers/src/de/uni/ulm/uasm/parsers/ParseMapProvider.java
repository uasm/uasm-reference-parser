package de.uni.ulm.uasm.parsers;

import org.codehaus.jparsec.Token;
import org.codehaus.jparsec.functors.Binary;
import org.codehaus.jparsec.functors.Map;
import org.codehaus.jparsec.functors.Unary;

/**
 * A class implementing this interface provides parse maps (instances of {@code org.codehaus.jparsec.functors.Map}) for all non-terminals and operators of the UASM language.
 * @author Michael Stegmaier
 *
 * @param <N> the node class
 */
public interface ParseMapProvider<N> {
	Map<Token, N> getIdentifierMap();
	Map<Token, N> getKeywordMap();
	Map<Token, N> getOperatorMap();
	Map<Token, N> getStringMap();
	Map<Token, N> getCharMap();
	Map<Token, N> getNumberMap();
	Map<N, N> getNodeMap(String nonTerminal);
	Binary<N> getBinaryOperatorMap(String operator);
	Unary<N> getUnaryOperatorMap(String operator);
	Map<Object[], N> getArrayMap(String nonTerminal);
}
