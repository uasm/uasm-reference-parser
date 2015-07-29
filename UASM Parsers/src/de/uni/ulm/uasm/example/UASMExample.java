package de.uni.ulm.uasm.example;

import org.codehaus.jparsec.Parser;
import org.codehaus.jparsec.Token;
import org.codehaus.jparsec.functors.Map;

import de.uni.ulm.uasm.parsers.MapperProvider;
import de.uni.ulm.uasm.parsers.UASMNode;
import de.uni.ulm.uasm.parsers.UASMParsers;

public class UASMExample {
	public static void main(String[] args) {
		UASMParsers.initialize(new MapperProvider() {
			
			@Override
			public Map<Token, UASMNode> getOperatorMapper() {
				return new OperatorMapper();
			}
			
			@Override
			public Map<UASMNode, UASMNode> getMapper(String name) {
				// TODO Auto-generated method stub
				return null;
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
				// TODO Auto-generated method stub
				return null;
			}
		});
		Parser<UASMNode> parser = UASMParsers.getInstance().getRootParser();
	}
	
	public static final class IdentifierMapper implements Map<Token, de.uni.ulm.uasm.parsers.UASMNode> {
		public UASMNode map(Token v)
		{
			return null;
		}
	}
	
	public static final class KeywordMapper implements Map<Token, de.uni.ulm.uasm.parsers.UASMNode> {
		@Override
		public UASMNode map(Token from) {
			return null;
		}
	}
	
	public static final class OperatorMapper implements Map<Token, de.uni.ulm.uasm.parsers.UASMNode> {
		@Override
		public UASMNode map(Token from) {
			return null;
		}
	}
}
