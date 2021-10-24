package edu.mills.cs124.Assignment7;

public class BinaryTreeNode<E> {
	E element;
	BinaryTreeNode<E> parent;
	BinaryTreeNode<E> left;
	BinaryTreeNode<E> right;
	
	// constructor
	public BinaryTreeNode(E element) {
		this.element = element;
		this.left = null;
		this.right = null;
	}
	
	public void addLeftChild(BinaryTreeNode<E> node) throws IllegalArgumentException {
		if (this.left != null) 
			throw new IllegalArgumentException("Attempt to add a left child when one already exist");
		this.left = node;
		node.parent = this;
	}
	
	public void addRightChild(BinaryTreeNode<E> node) throws IllegalArgumentException {
		if (this.right != null) 
			throw new IllegalArgumentException("Attempt to add a right child when one already exist");
		this.right = node;
		node.parent = this;
	}
	
	public boolean isExternal() {
		// TO DO:
		// Return true/false depending on whether this is an external (leaf) node
		
		
		return false; // placeholder	
	}
	
	public boolean isInternal() {
		// TO DO:
		// Return true/false depending on whether this is an internal (non-leaf) node

		return false; // placeholder	
	}
	
}
