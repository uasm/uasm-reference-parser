package uasm2asmeta.maps;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.codehaus.jparsec.Token;
import org.codehaus.jparsec.functors.Binary;
import org.codehaus.jparsec.functors.Map;
import org.codehaus.jparsec.functors.Unary;

import asmeta.AsmetaFactory;
import asmeta.structure.StructureFactory;
import de.uni.ulm.uasm.example.Node;
import de.uni.ulm.uasm.parsers.ParseMapProvider;
import de.uni.ulm.uasm.parsers.UASMParsers;

/**
 * builds the right mapper for the parts of the asmeta returna an Object so I
 * can return everything I need
 */
public class AsmetaMapProvider implements ParseMapProvider<Object> {

	static Logger logger = Logger.getLogger(AsmetaMapProvider.class);

	private static StructureFactory structurePack;

	public AsmetaMapProvider() {
		// get the asmetafactory instance
		AsmetaFactory asmPk = AsmetaFactory.eINSTANCE;

		// defPack = asmPk.getDefinitions();
		// termsPack = asmPk.getTerms();
		// rulesPack = asmPk.getTransitionRules();
		structurePack = asmPk.getStructure();
		// domainsFactory = defPack.getDomains();
	}

	@Override
	public Map<Token, Object> getOperatorMap() {
		return new OperatorMap();
	}

	@Override
	public Map<Object, Object> getNodeMap(String nonTerminal) {
		// return the flattening node
		return new Map<Object, Object>() {
			@Override
			public Object map(Object arg0) {
				return arg0;
			}

		};
	}

	@Override
	public Map<Token, Object> getKeywordMap() {
		return new KeywordMap();
	}

	@Override
	public Map<Token, Object> getIdentifierMap() {
		return new IdentifierMap();
	}

	@Override
	public Map<Object[], Object> getArrayMap(String nonTerminal) {
		switch (nonTerminal) {
		case UASMParsers.ASM:
			return new AsmetaMachineMap(structurePack);
		case UASMParsers.HEADER:
			return new AsmetaHeaderMap(structurePack);
		case UASMParsers.BODY:
			return new AsmetaBodyMap(structurePack);
		case UASMParsers.DEFINITION:
		case UASMParsers.DOMAIN_DEFINITION:
		case UASMParsers.FUNCTION_DEFINITION:
		case UASMParsers.CONTROLLED_FUNCTION:
			return new AsmetaDefinitionMap(structurePack,nonTerminal);

		}
		return new NodeWithChildrenMap(nonTerminal);

	}

	@Override
	public Map<Token, Object> getCharMap() {
		return new CharMap();
	}

	@Override
	public Map<Token, Object> getStringMap() {
		return new StringMap();
	}

	@Override
	public Map<Token, Object> getNumberMap() {
		return new NumberMap();
	}

	@Override
	public Binary<Object> getBinaryOperatorMap(String operator) {
		return new BinaryOperatorMap(operator);
	}

	@Override
	public Unary<Object> getUnaryOperatorMap(String operator) {
		return new UnaryOperatorMap(operator);
	}

	private static class ToStringMap implements Map<Token, Object> {
		@Override
		public Object map(Token from) {
			return new String(from.toString() + "[" + from.index() + "]");

		}
	}

	public static class ID {

		public String id;

		public ID(String string, int index) {
			id = string;
		}

		@Override
		public String toString() {
			return id + "(ID)";
		}
	}

	private static final class IdentifierMap implements Map<Token, Object> {
		@Override
		public Object map(Token from) {
			return new ID(from.toString(), from.index());

		}
	}

	private static final class KeywordMap extends ToStringMap {
	}

	private static final class OperatorMap extends ToStringMap {
	}

	private static final class BinaryOperatorMap implements Binary<Object> {
		private String operator;

		private BinaryOperatorMap(String operator) {
			this.operator = operator;
		}

		@Override
		public Object map(Object a, Object b) {
			return new String(a.toString() + operator + b.toString());
		}
	};

	private static final class UnaryOperatorMap implements Unary<Object> {
		private String operator;

		private UnaryOperatorMap(String operator) {
			this.operator = operator;
		}

		@Override
		public Object map(Object from) {
			return new String(operator + from.toString());
		}
	};

	private static final class StringMap extends ToStringMap {
	}

	private static final class CharMap extends ToStringMap {
	}

	private static final class NumberMap extends ToStringMap {
	}

	public static final class NodeMap implements Map<Object, Object> {
		private final String nonTerminal;

		public NodeMap(String nonTerminal) {
			this.nonTerminal = nonTerminal;
		}

		@Override
		public Node map(Object from) {
			logger.debug("mapping " + from.toString() + " to generic node");
			if (from instanceof Node) {
				Node node = new Node(nonTerminal, ((Node) from).getPosition());
				node.addChild((Node) from);
				return node;
			} else {
				return new Node(from.toString(), 0);
			}
		}
	}

	public static final class NodeWithChildrenMap implements Map<Object[], Object> {
		private final String nonTerminal;

		public NodeWithChildrenMap(String nonTerminal) {
			this.nonTerminal = nonTerminal;
		}

		@Override
		public Node map(Object[] from) {
			logger.debug("mapping " + Arrays.toString(from) + " to generic NodeWithChildrenMap");
			return addChildren(new Node(nonTerminal, getPosition(from)), from);
		}

		private static int getPosition(Object[] children) {
			for (Object child : children) {
				if (child instanceof Node)
					return ((Node) child).getPosition();
				if (child instanceof Object[]) {
					int pos = getPosition((Object[]) child);
					if (pos >= 0)
						return pos;
				}
			}
			return -1;
		}

		private Node addChildren(Node parent, Object[] children) {
			for (Object child : children) {
				if (child instanceof Node)
					parent.addChild((Node) child);
				else if (child instanceof Object[])
					addChildren(parent, (Object[]) child);
			}
			return parent;
		}
	}

}
