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

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HashTableDriver {
	
	public static HashTableMethods hashtable = new HashTableMethods();
	
	
	public static void main(String[] args) {
		
		 ArrayList<String> data = new ArrayList<String>();
		 ArrayList<Integer> customerId = new ArrayList<Integer>();
				 
		String path = "src/Week11/HashingDemoDataFile.csv";
		String line ="";
		String[] valuesArray = {};
	
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			while ((line = br.readLine()) != null) {
	
				 valuesArray = line.split(",");
				 hashtable.appendNode((hashtable.hashIt(valuesArray[1])), (Integer.parseInt(valuesArray[0])), (valuesArray[1]));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			
			
	 }
		
		
		//hashtable.displayHashArray();
	  
	
	Scanner scr = new Scanner(System.in);
		System.out.print("Type last Name which you want to search: ");
		String find = scr.nextLine();
     HashNode searchNode = hashtable.search(find);
     System.out.println("Found: ["+searchNode.lastName+"] --> ["+searchNode.customerID+"]");
     hashtable.timeCounter(find);
     
     
	
	}
	
}
