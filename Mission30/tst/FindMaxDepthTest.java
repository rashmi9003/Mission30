import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dataStructures.trees.FindMaxDepth;
import dataStructures.trees.data.Tree;
import dataStructures.trees.util.TreeUtil;


public class FindMaxDepthTest {
	FindMaxDepth fmd;
	@Before
	public void setUp() throws Exception {
		fmd = new FindMaxDepth();
	}

	@Test
	public void testHappyCase() throws Exception {
		int[] inorder = {4,2,1,3};
		int[] preorder = {1,2,4,3};
		Tree root = TreeUtil.buildTree(inorder, preorder);
		assertEquals(3,fmd.findMaxDepthInABinaryTree(root));
	}
	@Test
	public void testRightSkewedTree() throws Exception {
		int[] inorder = {1,2,3,4};
		int[] preorder = {1,2,3,4};
		Tree root = TreeUtil.buildTree(inorder, preorder);
		assertEquals(4,fmd.findMaxDepthInABinaryTree(root));
	}
	@Test
	public void testLeftSkewedTree() throws Exception {
		int[] inorder = {4,3,2,1};
		int[] preorder = {1,2,3,4};
		Tree root = TreeUtil.buildTree(inorder, preorder);
		assertEquals(4,fmd.findMaxDepthInABinaryTree(root));
	}
}
