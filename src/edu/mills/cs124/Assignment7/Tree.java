package edu.mills.cs124.Assignment7;
import java.util.ArrayList;

public class Tree<E> {
	
	// A private class used for the node objects in the tree
	private class TreeNode {
		E element;
		TreeNode parent;
		ArrayList< TreeNode > children;
		
		// constructor
		public TreeNode(E element) {
			this.element = element;
			this.children = new ArrayList< TreeNode >();
		}
		
		public TreeNode(E element, TreeNode parent) {
			this.element = element;
			this.children = new ArrayList< TreeNode >();
			parent.addChild(this);
		}
		
		public void addChild(TreeNode node) {
			children.add(node);
			node.parent = this; 
			// meaning of "this": the current object being acted on
			// "this" is set to the object on the left side
			//  of the dot(.) when a method call happens
		}
		
		public boolean isExternal() {
			// is this node a leaf?
			return (children.isEmpty());
		}
		
		public boolean isInternal() {
			return (!isExternal());
		}
	}
	
	// The tree class as a whole only has one instance variable, 
	// a reference to the root node (if there is one)
	private TreeNode root;
	
	// The next few methods are what we did in class, just moved
	// inside the Tree class.
	
	// Determines the depth of a given node
	public int depthOfNode(TreeNode node) {
		// count steps up to get the root
		TreeNode current = node;
		int count = 0;
		while (current.parent != null) {
			count += 1;
			current = current.parent;
		}
		return count;
	}
	
	// Determines the height of a tree(or subtree) below a given node
	public int height(TreeNode node) {
		// Base case
		if (node == null) {
			return -1;
		}

		// Recursive step
		int h = 0;
		for (TreeNode subtreeRoot : node.children) {
			int subtreeHeight = height(subtreeRoot) + 1;
			if (subtreeHeight > h) {
				h = subtreeHeight;
			}
		}
		return h;
	}
	
	
	

}
