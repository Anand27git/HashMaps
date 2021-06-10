package com.BridgeLabz.binarysearchtree;

/************
 * 
 * @author ANAND
 * purpose:creating Binary Node
 *
 * @param <K>
 */

public class MyBinaryNode<K extends Comparable<K>> {
	//variables
	K key;
	MyBinaryNode<K> left;
	MyBinaryNode<K> right;
  //constructor
	public MyBinaryNode(K key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}
}
