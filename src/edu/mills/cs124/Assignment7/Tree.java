package edu.mills.cs124.Assignment7;

public class Tree<E> {
	
	// The tree class as a whole only has one instance variable, 
	// a reference to the root node (if there is one)
	private TreeNode<E> root;
	
	// Constructor
	public Tree() {
		root = null;
	}
	
	// Use this method to give the tree a root node.
	// It will return a reference to the root node created.
	public TreeNode<E> addRoot(E data) {
		root = new TreeNode<E>(data);
		return root;
	}
	
	// Use this method to add a new child node below an existing node.
	// It will return a reference to the new node created.
	public TreeNode<E> addChild(TreeNode<E> node, E data) {
		TreeNode<E> added = new TreeNode<E>(data);
		node.addChild(added);
		return added;
	}
	
	// The next few methods are what we did in class, just moved
	// inside the Tree class.
	
	// Determines the depth of a given node
	public int depth(TreeNode<E> node) {
		// count steps up to get the root
		TreeNode<E> current = node;
		int count = 0;
		while (current != root) {
			count += 1;
			current = current.parent;
		}
		return count;
	}
	
	// Determines the height of a tree(or subtree) below a given node
	public int height(TreeNode<E> node) {
		// Base case
		if (node == null) {
			return -1;
		}

		// Recursive step
		int h = 0;
		for (TreeNode<E> subtreeRoot : node.children) {
			int subtreeHeight = height(subtreeRoot) + 1;
			if (subtreeHeight > h) {
				h = subtreeHeight;
			}
		}
		return h;
	}
	
	public int numSiblings(TreeNode<E> node) {
		// TO DO:
		// Return the number of siblings the given node has
		
		
		return 42; // placeholder
	}
	
	public String allSiblings(TreeNode<E> node) {
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
