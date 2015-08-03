package de.uni.ulm.uasm.example;

import org.codehaus.jparsec.Parser;
import org.codehaus.jparsec.Token;
import org.codehaus.jparsec.functors.Binary;
import org.codehaus.jparsec.functors.Map;
import org.codehaus.jparsec.functors.Unary;

import de.uni.ulm.uasm.parsers.MapperProvider;
import de.uni.ulm.uasm.parsers.UASMNode;
import de.uni.ulm.uasm.parsers.UASMParsers;

public class UASMExample {
	private static boolean flat;
	
	public static void main(String[] args) {
		UASMParsers.initialize(new MapperProvider() {
			
			@Override
			public Map<Token, UASMNode> getOperatorMapper() {
				return new OperatorMapper();
			}
			
			@Override
			public Map<UASMNode, UASMNode> getMapper(String nonTerminal) {
				return new NodeMapper(nonTerminal);
			}
			
			@Override
			public Map<Token, UASMNode> getKeywordMapper() {
				return new KeywordMapper();
			}
			
			@Override
			public Map<Token, UASMNode> getIdentifierMapper() {
				return new IdentifierMapper();
			}

			@Override
			public Map<Object[], UASMNode> getArrayMapper(String nonTerminal) {
				return new ArrayMapper(nonTerminal);
			}
			
			public Map<Token, UASMNode> getCharMapper() {
				return new CharMapper();
			}

			@Override
			public Map<Token, UASMNode> getStringMapper() {
				return new StringMapper();
			}

			@Override
			public Map<Token, UASMNode> getNumberMapper() {
				return new NumberMapper();
			}
			
			@Override
			public Binary<UASMNode> getBinaryOperatorMapper(String operator) {
				return new BinaryOperatorMapper(operator);
			}
			
			@Override
			public Unary<UASMNode> getUnaryOperatorMapper(String operator) {
				return new UnaryOperatorMapper(operator);
			}
		});
		Parser<UASMNode> parser = UASMParsers.getInstance().getRootParser();
		String spec = "asm example\n"+
				"controlled counter -> Integer initially 0\n"+
				"controlled a -> Integer initially counter\n"+
				"rule r_Main(blubb) =\n"+
				     "par\n"+
				         "counter := counter +1\n"+
				     "if counter >= 10 then\n"+
				      "a := (a+1)*2\n"+
				 "endpar\n";
		printTree((Node)parser.parse(spec));
		flat = true;
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
	
	public static final class IdentifierMapper implements Map<Token, UASMNode> {
		@Override
		public UASMNode map(Token from) {
			return new Node("ID", from.toString());
		}
	}
	
	public static final class KeywordMapper implements Map<Token, UASMNode> {
		@Override
		public UASMNode map(Token from) {
			return new Node("Keyword", from.toString());
		}
	}
	
	public static final class OperatorMapper implements Map<Token, UASMNode> {
		@Override
		public UASMNode map(Token from) {
			return new Node("Operator", from.toString());
		}
	}
	
	public static final class BinaryOperatorMapper implements Binary<UASMNode> {
		private String operator;
		
		public BinaryOperatorMapper(String operator) {
			this.operator = operator;
		}
		
		@Override
		public UASMNode map(UASMNode a, UASMNode b) {
			Node node = new Node("BinaryOperator", operator);
			node.addChild((Node)a);
			node.addChild((Node)b);
			return node;
		}
	};
	
	public static final class UnaryOperatorMapper implements Unary<UASMNode> {
		private String operator;
		
		public UnaryOperatorMapper(String operator) {
			this.operator = operator;
		}

		@Override
		public UASMNode map(UASMNode from) {
			Node node = new Node("UnaryOperator", operator);
			node.addChild((Node)from);
			return node;
		}
	};
	
	public static final class StringMapper implements Map<Token, UASMNode> {
		@Override
		public UASMNode map(Token from) {
			return new Node("String", from.toString());
		}
	}
	
	public static final class CharMapper implements Map<Token, UASMNode> {
		@Override
		public UASMNode map(Token from) {
			return new Node("Char", from.toString());
		}
	}
	
	public static final class NumberMapper implements Map<Token, UASMNode> {
		@Override
		public UASMNode map(Token from) {
			return new Node("Number", from.toString());
		}
	}
	
	public static final class NodeMapper implements Map<UASMNode, UASMNode> {
		private final String nonTerminal;
		
		public NodeMapper(String nonTerminal) {
			this.nonTerminal = nonTerminal;
		}
		
		@Override
		public UASMNode map(UASMNode from) {
			if (flat)
				return from;
			Node node = new Node(nonTerminal, null);
			node.addChild((Node)from);
			return node;
		}
	}
	
	public static final class ArrayMapper implements Map<Object[], UASMNode> {
		private final String nonTerminal;
		
		public ArrayMapper(String nonTerminal) {
			this.nonTerminal = nonTerminal;
		}

		@Override
		public UASMNode map(Object[] from) {
			return addChildren(new Node(nonTerminal, null), from);
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
