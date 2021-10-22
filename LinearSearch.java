package Week3;

import java.util.Random;

public class LinearSearch {
	
	public static void main(String[] args) {
		
		/*
		 * My computer Specifications: Macbook Pro
		 * Processor: 2.2 GHz Quad-Core Intel Core i7
		 * Memory: 16 GB 1600 MHz DDR3
		 * Graphics: 1536 MB
		 */

		//Memory consumption calculation
		int min = 1;
		int max = 10;
		int numElement = 10000000;
		
		//Adding formula to determine current memory consumption
		long memoryEstimate = (4 * numElement) + 24 + 8;
		
		//Generating random number
		Random random = new Random();
		
		
		int dataArray [] = new int[numElement];
		
		//Loop to go through all the array
		for(int i =0; i < dataArray.length; i++) {
			dataArray[i] = (random.nextInt(max - min) + 1) + min;
		}
		
		//Assigning search value
		int SearchValue = 921111;
		System.out.println("The Comparison Made Was " + Comparison(dataArray, SearchValue));
		
	}
	
	static int Comparison(int [] dataArray, int SearchValue) {
		int count = 0;
		
		for(int i = 0; i < dataArray.length; i++) {
			if(dataArray[i] != SearchValue) {
				count++;
			}else {
				break;
			}
				
		}
		return count;
	}
}
