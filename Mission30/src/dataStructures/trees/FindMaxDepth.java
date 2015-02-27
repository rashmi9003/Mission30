package dataStructures.trees;


import dataStructures.trees.data.Tree;

public class FindMaxDepth {
	public static int findMaxDepthInABinaryTree(Tree root) {
		if(root == null) {
			return 0;
		}
		return Math.max(findMaxDepthInABinaryTree(root.left), findMaxDepthInABinaryTree(root.right)) + 1;
	}
}
