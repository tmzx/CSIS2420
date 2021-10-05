import java.text.NumberFormat;
import java.util.Scanner;

public class Week2Part1 {
	
	//Main method
	public static void main(String [] args ) {
		
		//Setting up parameters
		int min;
		int max;
		int total = 0;
	
		Scanner sc = new Scanner(System.in); //Scanner to input user number
		System.out.print("Please Enter Minimum Value: ");
		min = sc.nextInt(); //Get user input for minimum value
		
		System.out.print("Pleae Enter Maximum Value: ");
		max = sc.nextInt(); //Get user input for maximum value
		
		//Writing a loop to sum all user input numbers from minimum to max
		for( int i = min; i <= max; i++ ) {
			 total = total + i;
		}
		
		//Printing total value of the minimum and maximum with separated with comma.
		System.out.printf("The total value of min and max is %,d ", total);
		
		
		//Line Break
		System.out.print("\n \n");
		
		//Two dimensional array
		int [] [] gameScores = {
				
								{44,63,45,23,76,45},
								{76,23,56,98,33,24},
								{23,71,92,39,45,44},
								{70,20,46,64,77,29},
								{83,45,99,20,10,21},
								{86,34,92,34,88,11}
		};
		
		System.out.println("Total Scores : ");
		
		int Row0 = 0, Row1 = 0, Row2 = 0,Row3 = 0,Row4 = 0,Row5 = 0; 
		
		//Nested loop
		for (int i = 0; i < gameScores.length; i++) {
			for (int j = 0; j<gameScores[i].length; j++) {
				if (i == 0 )
					Row0 = Row0 + gameScores[i][j];
				else if (i == 1)
					Row1 = Row1 + gameScores[i][j];
				else if (i == 2)
					Row2 = Row2 + gameScores[i][j];
				else if (i == 3)
					Row3 = Row3 + gameScores[i][j];
				else if (i == 4)
					Row4 = Row4 + gameScores[i][j];
				else if(i == 5)
					Row5 = Row5 + gameScores[i][j];	
			}
		}
		 
		 //Row-value into an Array
		 int[] sumOfgameScores = {Row0, Row1, Row2, Row3, Row4, Row5};
		 int highScore = sumOfgameScores[0];
		 
		 //Printing all elements of an array
		 for(int i = 0; i < sumOfgameScores.length; i++) {
			 System.out.printf("Row %d: %d\n", i, sumOfgameScores[i]); 
			 
			 //Finding highest score in an array by Iterative Way.
			 if (sumOfgameScores[i] > highScore)
				 highScore = sumOfgameScores[i];
		  }
		 
		 //Printing the Highest Score
		 System.out.println("High Score: " + highScore);
		 
		
		 }
		
	}
	
