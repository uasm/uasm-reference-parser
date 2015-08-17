package de.uni.ulm.uasm.example;

import org.codehaus.jparsec.Parser;
import org.codehaus.jparsec.Token;
import org.codehaus.jparsec.functors.Binary;
import org.codehaus.jparsec.functors.Map;
import org.codehaus.jparsec.functors.Unary;

import de.uni.ulm.uasm.parsers.ParseMapProvider;
import de.uni.ulm.uasm.parsers.UASMParsers;

/**
 * An example for the use of the UASM Parsers
 * 
 * @author Michael Stegmaier
 *
 */
public class UASMExample {
	private static boolean flat;
	private static UASMParsers<Node> parsers;
	
	public static void main(String[] args) {
		parsers = new UASMParsers<Node>(new ParseMapProvider<Node>() {
			
			@Override
			public Map<Token, Node> getOperatorMap() {
				return new OperatorMap();
			}
			
			@Override
			public Map<Node, Node> getNodeMap(String nonTerminal) {
				return new NodeMap(nonTerminal);
			}
			
			@Override
			public Map<Token, Node> getKeywordMap() {
				return new KeywordMap();
			}
			
			@Override
			public Map<Token, Node> getIdentifierMap() {
				return new IdentifierMap();
			}

			@Override
			public Map<Object[], Node> getArrayMap(String nonTerminal) {
				return new NodeWithChildrenMap(nonTerminal);
			}
			
			public Map<Token, Node> getCharMap() {
				return new CharMap();
			}

			@Override
			public Map<Token, Node> getStringMap() {
				return new StringMap();
			}

			@Override
			public Map<Token, Node> getNumberMap() {
				return new NumberMap();
			}
			
			@Override
			public Binary<Node> getBinaryOperatorMap(String operator) {
				return new BinaryOperatorMap(operator);
			}
			
			@Override
			public Unary<Node> getUnaryOperatorMap(String operator) {
				return new UnaryOperatorMap(operator);
			}
		});
		Parser<Node> parser = parsers.getRootParser();
		String spec = "asm example\n"+
				"controlled counter -> Integer initially 0\n"+
				"controlled a -> Integer initially counter\n"+
				"rule r_Main(blubb) =\n"+
				     "par\n"+
				         "counter := counter +1\n"+
				     "if counter >= 10 then\n"+
				      "a := (a+1)*2\n"+
				 "endpar\n";
		System.out.println("Regular Tree:");
		printTree((Node)parser.parse(spec));
		flat = true;
		System.out.println("\nFlattened Tree:");
		printTree((Node)parser.parse(spec));
	}
	
	public static void printTree(Node root) {
		printTree(root, 0);
	}
	
	public static void printTree(Node node, int indentation) {
		for (int i = 0; i < indentation; i++)
			System.out.print("  ");
		System.out.println(node);
		for (Node child : node.getChildren())
			printTree(child, indentation + 1);
	}
	
	public static final class IdentifierMap implements Map<Token, Node> {
		@Override
		public Node map(Token from) {
			return new Node("ID", from.toString(), from.index());
		}
	}
	
	public static final class KeywordMap implements Map<Token, Node> {
		@Override
		public Node map(Token from) {
			return new Node("Keyword", from.toString(), from.index());
		}
	}
	
	public static final class OperatorMap implements Map<Token, Node> {
		@Override
		public Node map(Token from) {
			return new Node("Operator", from.toString(), from.index());
		}
	}
	
	public static final class BinaryOperatorMap implements Binary<Node> {
		private String operator;
		
		public BinaryOperatorMap(String operator) {
			this.operator = operator;
		}
		
		@Override
		public Node map(Node a, Node b) {
			Node node = new Node("BinaryOperator", operator, a.getPosition());
			node.addChild(a);
			node.addChild(b);
			return node;
		}
	};
	
	public static final class UnaryOperatorMap implements Unary<Node> {
		private String operator;
		
		public UnaryOperatorMap(String operator) {
			this.operator = operator;
		}

		@Override
		public Node map(Node from) {
			Node node = new Node("UnaryOperator", operator, from.getPosition());
			node.addChild((Node)from);
			return node;
		}
	};
	
	public static final class StringMap implements Map<Token, Node> {
		@Override
		public Node map(Token from) {
			return new Node("String", from.toString(), from.index());
		}
	}
	
	public static final class CharMap implements Map<Token, Node> {
		@Override
		public Node map(Token from) {
			return new Node("Char", from.toString(), from.index());
		}
	}
	
	public static final class NumberMap implements Map<Token, Node> {
		@Override
		public Node map(Token from) {
			return new Node("Number", from.toString(), from.index());
		}
	}
	
	public static final class NodeMap implements Map<Node, Node> {
		private final String nonTerminal;
		
		public NodeMap(String nonTerminal) {
			this.nonTerminal = nonTerminal;
		}
		
		@Override
		public Node map(Node from) {
			if (flat)
				return from;
			Node node = new Node(nonTerminal, from.getPosition());
			node.addChild((Node)from);
			return node;
		}
	}
	
	public static final class NodeWithChildrenMap implements Map<Object[], Node> {
		private final String nonTerminal;
		
		public NodeWithChildrenMap(String nonTerminal) {
			this.nonTerminal = nonTerminal;
		}

		@Override
		public Node map(Object[] from) {
			return addChildren(new Node(nonTerminal, getPosition(from)), from);
		}
		
		private static int getPosition(Object[] children) {
			for (Object child : children) {
				if (child instanceof Node)
					return ((Node)child).getPosition();
				if (child instanceof Object[]) {
					int pos = getPosition((Object[])child);
					if (pos >= 0)
						return pos;
				}
			}
			return -1;
		}
		
		private Node addChildren(Node parent, Object[] children) {
			for (Object child : children) {
				if (child instanceof Node)
					parent.addChild((Node)child);
				else if (child instanceof Object[])
					addChildren(parent, (Object[])child);
			}
			return parent;
		}
	}
}
