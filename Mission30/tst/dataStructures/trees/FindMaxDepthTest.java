package dataStructures.trees;

import dataStructures.trees.FindMaxDepth;
import dataStructures.trees.data.Tree;

public class FindMaxDepthTest {
@test
void testHappyCase() {
	Tree root = new Tree(1);
	root.left = new Tree(2);
	root.right = new Tree(3);
	
	 FindMaxDepth.findMaxDepthInABinaryTree(root);
	
}
}
