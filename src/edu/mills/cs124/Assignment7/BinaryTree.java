package edu.mills.cs124.Assignment7;

import java.util.ArrayList;

import edu.mills.cs124.Assignment7.Tree.TreeNode;

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
		
	// Determines the depth of a given node
	public int depth(BinaryTreeNode node) {
		// TO DO:
		// Implement this method
		
		
		return 42; // placeholder	
	}
	
	// Determines the height of a tree(or subtree) below a given node
	public int height(TreeNode node) {
		// TO DO:
		// Implement this method
		
		
		
	}
	
}
