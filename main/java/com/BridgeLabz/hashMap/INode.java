package com.BridgeLabz.hashMap;

/******
 * 
 * @author ANAND
 * purpose:Using interface INode
 * 
 * @param <T>
 */
public interface INode<T> {

	public T getKey();
	
	public void setKey(T key);
	
	public INode getNext();
	
	public void setNext(INode next);
	
	
	
}
