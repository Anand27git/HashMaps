package com.BridgeLabz.binarysearchtree;

/*******
 * 
 * @author ANAND purpose: simple BinaryTree
 * @param <K>
 */
public class MyBinaryTree<K extends Comparable<K>> {

	private MyBinaryNode<K> root;

	public void add(K key) {
		this.root = addRecursively(root, key);
	}

	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
		if (current == null)
			return new MyBinaryNode<>(key);
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0)
			return current;
		if (compareResult < 0) {
			current.left = addRecursively(current.left, key);
		} else {
			current.right = addRecursively(current.right, key);
		}
		return current;
	}

	// getting size of the binary tree nodes
	public int getSize() {
		return this.getSizeRecursive(root);
	}

	// computation of size
	public int getSizeRecursive(MyBinaryNode<K> current) {
		return current == null ? 0 : 1 + this.getSizeRecursive(current.left) + this.getSizeRecursive(current.right);
	}

	public boolean search(K key) {
		return searchNodeInMyBinaryTree(root, key);
	}
	// search computation
	public boolean searchNodeInMyBinaryTree(MyBinaryNode<K> root, K key) {
		if (root == null)
			return false;
		if (root.key.compareTo(key) == 0)
			return true;
		else if (root.key.compareTo(key) > 0)
			return searchNodeInMyBinaryTree(root.left, key);
		else
			return searchNodeInMyBinaryTree(root.right, key);
	}

}
