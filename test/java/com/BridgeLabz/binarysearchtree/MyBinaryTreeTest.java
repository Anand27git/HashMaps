package com.BridgeLabz.binarysearchtree;

import org.junit.Test;
import org.junit.Assert;

/***********
 * 
 * @author ANAND
 *  purpose:test case of Binary tree
 *
 */


public class MyBinaryTreeTest {
	
	//UC -1 testing the code of simple binaryTree of 3 nodes
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

	// UC -2 testing the code of binaryTree of 13 nodes
	@Test
	public void GivenNumbersWhenAddedToBSTShouldReturnSizeofgivenNodes() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(22);
		myBinaryTree.add(40);
		myBinaryTree.add(60);
		myBinaryTree.add(95);
		myBinaryTree.add(11);
		myBinaryTree.add(65);
		myBinaryTree.add(3);
		myBinaryTree.add(16);
		myBinaryTree.add(63);
		myBinaryTree.add(67);
		int size = myBinaryTree.getSize();
		Assert.assertEquals(13, size);
		System.out.println(size);
	}

	// UC -3 test case of search node of Binary Tree
	@Test
	public void GivenNumbersWhenAddedToBSTShouldReturnSizeandSearch() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(22);
		myBinaryTree.add(40);
		myBinaryTree.add(60);
		myBinaryTree.add(95);
		myBinaryTree.add(11);
		myBinaryTree.add(65);
		myBinaryTree.add(3);
		myBinaryTree.add(16);
		myBinaryTree.add(63);
		myBinaryTree.add(67);
		int size = myBinaryTree.getSize();
		Assert.assertEquals(true, myBinaryTree.search(40));
		System.out.println(size);
	}
}
