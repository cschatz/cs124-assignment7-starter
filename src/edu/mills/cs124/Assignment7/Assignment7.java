package edu.mills.cs124.Assignment7;

public class Assignment7 {

	public static void main(String[] args) {
		// Example: Building a tree
		Tree<String> mytree = new Tree<String>();
		TreeNode<String> myroot = mytree.addRoot("Belinda");
		TreeNode<String> alicia = mytree.addChild(myroot, "Alicia");
		TreeNode<String> cindy = mytree.addChild(myroot, "Cindy");
		TreeNode<String> destiny = mytree.addChild(cindy, "Destiny");
		// Destiny is the grandhild of the root, so depths should report 2
		System.out.println(mytree.depth(destiny));
		// This should display everyone in the tree
		mytree.display();
		
		// Example: Building a binary tree
		BinaryTree<Integer> numbertree = new BinaryTree<Integer>();
		BinaryTreeNode<Integer> numroot = numbertree.addRoot(4);
		BinaryTreeNode<Integer> leftOfRoot = numbertree.addLeftChild(numroot, 2);
		BinaryTreeNode<Integer> rightOfRoot = numbertree.addRightChild(numroot, 6);
		numbertree.addLeftChild(leftOfRoot, 1);
		numbertree.addRightChild(leftOfRoot, 3);
		numbertree.addLeftChild(rightOfRoot, 5);
		numbertree.addRightChild(rightOfRoot, 7);
		/** The tree now looks like:
		 * 
		 *                4
		 *              /   \
		 *             /     \
		 *            2       6
		 *           / \     / \
		 *          1   3   5   7
		 */
		// This should show all numbers from the tree in order
		numbertree.displayInOrder();
		
		
	}
	

}
