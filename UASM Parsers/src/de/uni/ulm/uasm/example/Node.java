package de.uni.ulm.uasm.example;

import java.util.LinkedList;

/**
 * A simple node implementation
 * @author Michael Stegmaier
 *
 */
public class Node {
	private Node parent;
	private final LinkedList<Node> children = new LinkedList<Node>();
	private final String nonTerminal;
	private final String token;
	private final int position;
	
	public Node(String nonTerminal, int position) {
		this(nonTerminal, null, position);
	}
	
	public Node(String nonTerminal, String token, int position) {
		if (nonTerminal == null)
			throw new IllegalArgumentException("A non-terminal must not be null.");
		this.nonTerminal = nonTerminal;
		this.token = token;
		this.position = position;
	}
	
	public void addChild(Node child) {
		if (child == null)
			throw new IllegalArgumentException("A child must not be null.");
		child.parent = this;
		children.add(child);
	}
	
	public Node getParent() {
		return parent;
	}
	
	public int getPosition() {
		return position;
	}
	
	public String getToken() {
		return token;
	}
	
	public LinkedList<Node> getChildren() {
		return children;
	}
	
	@Override
	public String toString() {
		return nonTerminal + (token != null ? ": " + token : "");
	}
}
