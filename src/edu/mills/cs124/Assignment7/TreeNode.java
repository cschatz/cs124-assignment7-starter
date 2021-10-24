package edu.mills.cs124.Assignment7;

import java.util.ArrayList;

public class TreeNode<E> {
	E element;
	TreeNode<E> parent;
	ArrayList< TreeNode<E> > children;
	
	// constructor
	public TreeNode(E element) {
		this.element = element;
		this.children = new ArrayList< TreeNode<E> >();
	}
	
	public TreeNode(E element, TreeNode<E> parent) {
		this.element = element;
		this.children = new ArrayList< TreeNode<E> >();
		parent.addChild(this);
	}
	
	public void addChild(TreeNode<E> node) {
		children.add(node);
		node.parent = this; 
		// * Meaning of "this": the current object being acted on
		// * "this" is set to the object on the left side
		//    of the dot(.) when a method call happens
	}
	
	public boolean isExternal() {
		// is this node a leaf?
		return (children.isEmpty());
	}
	
	public boolean isInternal() {
		return (!isExternal());
	}
}