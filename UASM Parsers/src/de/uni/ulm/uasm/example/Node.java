package de.uni.ulm.uasm.example;

import java.util.LinkedList;

import de.uni.ulm.uasm.parsers.UASMNode;

public class Node implements UASMNode {
	private Node parent;
	private LinkedList<Node> children = new LinkedList<Node>();
	private String nonTerminal;
	private String token;
	
	public Node(String nonTerminal, String token) {
		this.nonTerminal = nonTerminal;
		this.token = token;
	}
	
	public void addChild(Node child) {
		child.parent = this;
		children.add(child);
	}
	
	public Node getParent() {
		return parent;
	}
	
	public LinkedList<Node> getChildren() {
		return children;
	}
	
	@Override
	public String toString() {
		return nonTerminal + (token != null ? ": " + token : "");
	}
}
