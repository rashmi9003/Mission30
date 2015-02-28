package dataStructures.trees.util;

import dataStructures.trees.data.Tree;

public class TreeUtil {

	private static int prestrt = 0;

	public static Tree buildTree(int[] inorder, int[] preorder)
			throws Exception {
		prestrt = 0;
		return buildTreeFromInAndPreOrderTraversal(inorder, preorder, 0,
				inorder.length - 1);
	}

	private static Tree buildTreeFromInAndPreOrderTraversal(int[] inorder,
			int[] preorder, int instrt, int inend) throws Exception {
		if (prestrt >= preorder.length || instrt > inend || instrt < 0
				|| inend >= inorder.length)
			return null;
		Tree root = new Tree(preorder[prestrt++]);
		int rootInInorder = find(inorder, root.getData(), instrt, inend);
		if (rootInInorder == -1) {
			throw new Exception(
					"Invalid inorder and preorder traversal for a tree. Cannot build a tree.");
		}
		root.left = buildTreeFromInAndPreOrderTraversal(inorder, preorder,
				instrt, rootInInorder - 1);
		root.right = buildTreeFromInAndPreOrderTraversal(inorder, preorder,
				rootInInorder + 1, inend);
		return root;
	}

	private static int find(int[] arr, int value, int strt, int end) {
		for (int i = strt; i <= end; i++) {
			if (value == arr[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void printTree(Tree root) {
		if (root != null) {
			System.out.println(root.getData());

			printTree(root.left);
			printTree(root.right);
		}
	}
}
