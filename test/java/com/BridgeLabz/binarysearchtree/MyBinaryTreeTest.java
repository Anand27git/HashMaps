package com.BridgeLabz.binarysearchtree;

import org.junit.Test;
import org.junit.Assert;
/***********
 * 
 * @author ANAND
 * purpose:test case of Binary tree 
 *
 */

//UC -1 testing the code of simple binaryTree of 3 nodes
public class MyBinaryTreeTest {

	@Test
	public void GivenNumbersWhenAddedToBSTShouldReturnSize() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		int size = myBinaryTree.getSize();
		Assert.assertEquals(3, size);
		System.out.println(size);
	}

}
