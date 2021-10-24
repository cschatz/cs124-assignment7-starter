package edu.mills.cs124.Assignment7;

import java.util.ArrayList;

public class BinaryTree<E> {
	
	private class BinaryTreeNode {
		E element;
		BinaryTreeNode parent;
		BinaryTreeNode left;
		BinaryTreeNode right;
		
		// constructor
		public BinaryTreeNode(E element) {
			this.element = element;
			this.left = null;
			this.right = null;
		}
		
		public void addLeftChild(BinaryTreeNode node) throws IllegalArgumentException {
			if (this.left != null) 
				throw new IllegalArgumentException("Attempt to add a left child when one already exist");
			this.left = node;
			node.parent = this;
		}
		
		public void addRightChild(BinaryTreeNode node) throws IllegalArgumentException {
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
	
	// The binary tree class as a whole only has one instance variable, 
	// a reference to the root node (if there is one)
	private BinaryTreeNode root;
		

	// Use this method to give the tree a root node.
	// It will return a reference to the root node created.
	public BinaryTreeNode addRoot(E e) {
		root = new BinaryTreeNode(e);
		return root;
	}
	
	// Use these two method to add a new child node below an existing node.
	// It will return a reference to the new node created.
	public BinaryTreeNode addLeftChild(BinaryTreeNode node, E data) {
		BinaryTreeNode added = new BinaryTreeNode(data);
		node.addLeftChild(added);
		return added;
	}
	public BinaryTreeNode addRightChild(BinaryTreeNode node, E data) {
		BinaryTreeNode added = new BinaryTreeNode(data);
		node.addRightChild(added);
		return added;
	}
		
	
	
	// Determines the depth of a given node
	public int depth(BinaryTreeNode node) {
		// TO DO:
		// Implement this method
		
		
		return 42; // placeholder	
	}
	
	// Determines the height of a tree(or subtree) below a given node
	public int height(BinaryTreeNode node) {
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
