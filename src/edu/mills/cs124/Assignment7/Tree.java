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
	
	// The tree class as a whole only has one instance variable, 
	// a reference to the root node (if there is one)
	private TreeNode root;
	
	// Constructor
	public Tree() {
		root = null;
	}
	
	// Use this method to give the tree a root node.
	// It will return a reference to the root node created.
	public TreeNode addRoot(E data) {
		root = new TreeNode(data);
		return root;
	}
	
	// Use this method to add a new child node below an existing node.
	// It will return a reference to the new node created.
	public TreeNode addChild(TreeNode node, E data) {
		TreeNode added = new TreeNode(data);
		node.addChild(added);
		return added;
	}
	
	
	
	// The next few methods are what we did in class, just moved
	// inside the Tree class.
	
	// Determines the depth of a given node
	public int depth(TreeNode node) {
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
	
	public int numSiblings(TreeNode node) {
		// TO DO:
		// Return the number of siblings the given node has
		
		
		return 42; // placeholder
	}
	
	public String allSiblings(TreeNode node) {
		// TO DO:
		// Return a string containing all elements from the given node's siblings,
		// separated by commas.
		
		
		return null; // placeholder
	}
	
	public void display() {
		// TO DO:
		// Display all elements in the tree in **level order**:
		//  First print the root, then any children of the root,
		//    then any grandchildren of the root, etc.
		// Hint: There is a standard algorithm that works for this, using a queue
		// 1) Begin by placing the root node into the queue
		// 2) While the queue is not empty, repeat these steps:
		//    (a) Dequeue a node from the queue. Print it's element
		//    (b) Enqueue all the node's children
		
		
	}
	
	public boolean contains(E target) {
		// TO DO:
		// Search all elements of the tree and return true/false
		//  to indicate whether the target value is found in the tree.
		// Hint: Think recursively!
		
		
		return false; // placeholder
	}
	
	public int numExternalNodes() {
		// TO DO:
		// Return the number of external nodes in the whole tree
		// Hint: Think recursively!
		
		
		return 42; // placeholder
	}
	
	

}
