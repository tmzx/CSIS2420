package Week4;


/*
 * SelectionSort.java - Example of selection sort algorithm.
 * @author: @professorgordon
 * @url: http://johngordon.io/javaadvancedsorting.php
 * @license: Creative Commons. No Warranty. No Liability.
 * @disclaimer: This code file is intended strictly for
 *              academic purposes. It is NOT intended for
 *              use in production systems.
 */


/*
 * Computer: 2015 MacBook Pro, 2.2 GHz Quad-Core i7, 16 GB RAM
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SelectionSort 
{

	public static void main(String[] args) throws IOException 
	{
		System.out.println("Selection Sort");

		String dataFile = "AccountNumbers.csv";
		BufferedReader reader = new BufferedReader(new FileReader(dataFile));
		int numLines = 0;
		BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";

        // Count the number of lines in the data file
        System.out.print("Counting lines in the data file ... ");
		while (reader.readLine() != null) numLines++;
		reader.close();
		System.out.println(numLines);
		int[] accounts = new int[numLines];

    	// Get data set from file and load array with values
    	System.out.println("Building array from the data file ...");
        br = new BufferedReader(new FileReader(dataFile));
    	for (int i = 0; i < numLines; i++)
    	{
    		line = br.readLine();
			String[] account = line.split(csvSplitBy);
    		accounts[i] = Integer.valueOf(account[0]);
    	}

    	// Conduct sort
    	if (numLines <= 25)
    	{
            System.out.println("\nArray Before Sort:");  
            for(int account : accounts)
            {  
                System.out.print(account + " ");  
            }  
            System.out.println();  
    	}
    	else
    	{
            System.out.println("\nStarting Sort ...");  
    	}

        selectionSort(accounts);  
        
    	if (numLines <= 25)
    	{
            System.out.println("\nArray After Sort:");  
            for(int account : accounts)
            {  
                System.out.print(account + " ");  
            }  
    	}
    	else
    	{
    		System.out.println("\n... Sort Complete.");  
    	}
    	
    	//Edit
    	double estimate = (double)timeEstimate(accounts);
    	double second = estimate / 1000000000;
    	System.out.printf("\n\nTime Estimation: %,.0f nanoseconds [%f seconds]",estimate,second); 
    	
        // Clean up
        br.close();
		accounts = null;
		
		

	}

	private static void selectionSort(int[] array2Sort) 
	{
	    for (int i = 0; i < array2Sort.length - 1; i++)  
	    {  
	        int index = i;  
	        for (int j = i + 1; j < array2Sort.length; j++)
	        {  
	            if (array2Sort[j] < array2Sort[index])
	            {  
	                index = j;  
	            }  
	        }  
	        int smallerNumber = array2Sort[index];   
	        array2Sort[index] = array2Sort[i];  
	        array2Sort[i] = smallerNumber;  
	    } 
	}
	
	//Edit
	private static long timeEstimate(int[] array2Sort) 
	{
		long start = System.nanoTime();
	    for (int i = 0; i < array2Sort.length - 1; i++)  
	    {  
	        int index = i;  
	        for (int j = i + 1; j < array2Sort.length; j++)
	        {  
	            if (array2Sort[j] < array2Sort[index])
	            {  
	                index = j;  
	            }  
	        }  
	        int smallerNumber = array2Sort[index];   
	        array2Sort[index] = array2Sort[i];  
	        array2Sort[i] = smallerNumber;  
	    } 
	    long end = System.nanoTime();
	    long duration = end - start;
	   return duration;
	}

}
