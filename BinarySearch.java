package Week3;

import java.util.*;



public class BinarySearch {
	
	/*
	 * My computer Specifications: Macbook Pro
	 * Processor: 2.2 GHz Quad-Core Intel Core i7
	 * Memory: 16 GB 1600 MHz DDR3
	 * Graphics: 1536 MB
	 */

	public static void main(String[] args) {
		
		int min = 1;
		int max = 10;
		int numElement = 10000000;
		
		//formula
		long memoryEstimate = (4 * numElement) + 24 + 8;
		
		//Generating random number
		Random random = new Random();
		
		int dataArray [] = new int[numElement];
		
		for(int i = 0; i < dataArray.length; i++) {
			dataArray[i] = (random.nextInt(max - min) + 1) + min;
		}
		
		int SearchValue = 921111;
		
		System.out.println("The comparision was " + Comparison(dataArray, SearchValue));
		       
	}
	
	static int Comparison (int dataArray [], int SearchValue) {
		Arrays.sort(dataArray);
		
		int count = 0;
		int low = 0;
		int high = dataArray.length - 1;
		
		while(low <= high) {
			int mid = low + (high - low) / 2;
			if(dataArray[mid] != SearchValue) {
				count++;
			}
			
			if(dataArray[mid] < SearchValue) {
				low = mid + 1;
			} else {
				high = mid -1;
			}
			
			
		}
		
		return count;
	}
   

}
