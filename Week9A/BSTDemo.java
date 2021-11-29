package Week9A;


import java.util.Random;
import java.util.Scanner;

/*
 * BSTDemo.java - Class to demonstrate a binary search tree.
 * 
 * @author: @professorgordon
 * @url: http://johngordon.io/javaadvancedtrees.php
 * @license: Creative Commons. No Warranty. No Liability.
 * @disclaimer: This code file is intended strictly for
 *              academic purposes. It is NOT intended for
 *              use in production systems.
 *
 **/

public class BSTDemo 
{
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		
		 
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter Number of Nodes you want to insert into Tree: ");
		int noOfNodes = scr.nextInt();
		
		
		Random rand = new Random();
		// Inserting elements into an Array
		for (int i = 0; i < noOfNodes; i++) {
			
			bst.insertIterative(rand.nextInt(noOfNodes)); 
			
		}	
		
		System.out.println("Time Consumed for preOrderTraverse: " + preOrderCounter(bst.root) + " Nano Seconds");
		System.out.println("Time Consumed for preOrderTraverse: " + inOrderCounter(bst.root) + " Nano Seconds");
		System.out.println("Time Consumed for preOrderTraverse: " + postOrderCounter(bst.root) + " Nano Seconds");
	}
	
	public static long preOrderCounter(BSTNode n)
	{  
		long start = System.nanoTime();
		if (n == null)
		{  
			return 0; 
		}  
		else
		{  
			if(n.left!= null)
			{
				preOrderCounter(n.left);  
			}
			if(n.right!= null)
			{
				preOrderCounter(n.right);  
			}
				
		} 
		long end = System.nanoTime();
		return end-start;
		
	}  
	
	
	public static long inOrderCounter(BSTNode n)
	{  
		long start = System.nanoTime();
		if(n == null)
		{  
			
			return 0; 
		}  
		else
		{  
			if(n.left!= null)
			{
				inOrderCounter(n.left);  
			}
			if(n.right!= null)
			{
				inOrderCounter(n.right);  
			}
		}  
		long end = System.nanoTime();
		return end-start;
	}  
	
	public static long postOrderCounter(BSTNode n)
	{  
		long start = System.nanoTime();
		if(n == null)
		{   
			return 1;  
		}  
		else
		{  
			if(n.left!= null)
			{
				postOrderCounter(n.left);  
			}
			if(n.right!= null)
			{
				postOrderCounter(n.right);  
			} 
		}  
		long end = System.nanoTime();
		return end - start;
	}
}

