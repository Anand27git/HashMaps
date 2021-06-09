package com.BridgeLabz.hashMap;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

/********
 * 
 * @author ANAND
 * purpose: using TestCase to test the Frequency of words in Given Sentence
 * 
 */
public class MyHashMapTest {
	
	//UC -1 checking the frequency of the word 
	@Test
  	public void givenSentence_whenAddedToList_shouldReturnWordFrequency() 
	{
      	String sentence = "To be or not to be";
      	MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
      	String[] words = sentence.toLowerCase().split(" ");
      	for(String word : words) 
      	{
          		Integer value = myHashMap.get(word);
          		if (value == null) 
          		{
              		value = 1;
          		} else 
          		{
              		value = value + 1;
          		}
          		myHashMap.add(word, value);
      	}
      	int frequency = myHashMap.get("to");
      	System.out.println(myHashMap);
      	Assert.assertEquals(2, frequency);
	}
}
