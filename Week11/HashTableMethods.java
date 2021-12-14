/*
 * JavaAPIHashTableDemo.java - Class to demonstrate hash 
 * 								tables using the Java API.
 * @author: @professorgordon
 * @url: http://johngordon.io/javaadvancedHashing.php
 * @license: Creative Commons. No Warranty. No Liability.
 * @disclaimer: This code file is intended strictly for
 *              academic purposes. It is NOT intended for
 *              use in production systems.
 */


package Week11;

public class HashTableMethods {

	/*
		hashArray[0] -> Barnes 
		hashArray[1] -> Andrews -> Mathison -> Jones
		hashArray[2] -> Yates   -> Carlson
	*/
	
	
    // Number of index in the array
	public static HashNode[] hashArray = new HashNode[4500];
	static HashNode foundNode = null;

	
	public static int hashIt(String data)
	{
		int asciiTotal = 0;
		for (int n = 0; n < data.length(); n++)
		{
			char c = data.charAt(n);
			asciiTotal = asciiTotal + (int)c;
		}
		return asciiTotal % hashArray.length;
	}
	
	
	public static void appendNode(int arrayIndex, int customerID, String name)
	{
		if (hashArray[arrayIndex] == null)
		{
			hashArray[arrayIndex] = new HashNode(customerID, name);
		}
		else
		{
			HashNode current = hashArray[arrayIndex];
			while (current.next != null)
			{
				current = current.next;
			}
			current.next = new HashNode(customerID, name);
		}
	}
	

	//Searches nodes
	public static HashNode search(String name) {
		
		int hashIndex = hashIt(name);
		HashNode arrayValue = hashArray[hashIndex];
		while(arrayValue != null) {
			if ((arrayValue.lastName).equalsIgnoreCase(name)) {
				foundNode = arrayValue;
			}
			arrayValue = arrayValue.next;
			
		}
			
		return foundNode;
		
	}
	
	
	 //Time counter for searching a node in the HashTable
	 
public static void timeCounter(String name) {
		
		int hashIndex = hashIt(name);
		HashNode arrayValue = hashArray[hashIndex];
		
		long start = System.nanoTime();
		while(arrayValue != null) {
			if ((arrayValue.lastName).equalsIgnoreCase(name)) {
				foundNode = arrayValue;
			}
			arrayValue = arrayValue.next;
			
		}
		long end = System.nanoTime();
			double time = (double)end - start;
		System.out.printf("Time took to search a Node: %.0f nanoseconds\n",time);
		
	}
	
	public static void displayHashArray()
	{
		for (int i = 0; i < hashArray.length; i++)
		{
			System.out.printf("hashArray[%d]", i);
			if (hashArray[i] != null)
			{
				HashNode current = hashArray[i];
				System.out.printf(" -> [%d][%s]", current.customerID, current.lastName);
				while (current.next != null)
				{
					current = current.next;
					System.out.printf(" -> [%d][%s]", current.customerID, current.lastName);
				}
			}
			System.out.println();;
		}
	}
	
	
}