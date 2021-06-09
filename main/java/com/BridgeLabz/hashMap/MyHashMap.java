package com.BridgeLabz.hashMap;
/**********
 * 
 * @author ANAND
 * purpose:  Hashmap for find the Freqeuncy of given words in sentence
 * @param <T>
 * @param <V>
 */
public class MyHashMap<T, V> {
	LinkedList<T> myLinkList;

	public MyHashMap() {
		this.myLinkList = new LinkedList<>();
	}

	public V get(T key) {
		MyMapNode<T, V> myMapNode = (MyMapNode<T, V>) this.myLinkList.search(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}
	//add method
	public void add(T key, V value) {
		MyMapNode<T, V> myMapNode = (MyMapNode<T, V>) this.myLinkList.search(key);
		if (myMapNode == null) {
			myMapNode = new MyMapNode<>(key, value);
			this.myLinkList.append(myMapNode);
		} else {
			myMapNode.setValue(value);
		}

	}

	@Override
	public String toString() {
		return "MyHashMap [myLinkList=" + myLinkList + "]";
	}
}
