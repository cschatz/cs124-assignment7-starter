package edu.mills.cs124.Assignment7;

public class BinaryTree<E> {

	
	// The binary tree class as a whole only has one instance variable, 
	// a reference to the root node (if there is one)
	private BinaryTreeNode<E> root;
		

	// Use this method to give the tree a root node.
	// It will return a reference to the root node created.
	public BinaryTreeNode<E> addRoot(E e) {
		root = new BinaryTreeNode<E>(e);
		return root;
	}
	
	// Use these two method to add a new child node below an existing node.
	// It will return a reference to the new node created.
	public BinaryTreeNode<E> addLeftChild(BinaryTreeNode<E> node, E data) {
		BinaryTreeNode<E> added = new BinaryTreeNode<E>(data);
		node.addLeftChild(added);
		return added;
	}
	public BinaryTreeNode<E> addRightChild(BinaryTreeNode<E> node, E data) {
		BinaryTreeNode<E> added = new BinaryTreeNode<E>(data);
		node.addRightChild(added);
		return added;
	}
		
	
	
	// Determines the depth of a given node
	public int depth(BinaryTreeNode<E> node) {
		// TO DO:
		// Implement this method
		
		
		return 42; // placeholder	
	}
	
	// Determines the height of a tree(or subtree) below a given node
	public int height(BinaryTreeNode<E> node) {
		// TO DO:
		// Implement this method
		
		
		return 42; // placeholder
	}
	
	public boolean contains(E target) {
		// TO DO:
		// Search all elements of the tree and return true/false
		//  to indicate whether the target value is found in the tree.
		// Hint: Think recursively!
		
		
		return false; // placeholder
	}
	
	public void remove(E target) {
		// TO DO:
		// Find and remove the any occurrence of the target element
		// in the tree, if there is any. 
		// You may assume there there is at most one matching node.
		// Hint: Draw pictures.
		

	}
	
	public void displayPreOrder() {
		// TO DO:
		// Print out the elements in the tree using pre-order traversal.
		
	}
	
	public void displayInOrder() {
		// TO DO:
		// Print out the elements in the tree using in-order traversal.
		
	}
	
	public void displayPostOrder() {
		// TO DO:
		// Print out the elements in the tree using post-order traversal.
	
	}
}
