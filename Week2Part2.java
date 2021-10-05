import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Week2Part2 {
	
	public static void main(String[] args) throws Exception {
		
		//Applying try and catch to read the file
		try {
			
		//Adding file
		File file = new File("/Users/Mnex/eclipse-workspace/Week2Part1/src/Week2Part2.txt"); 
		
		//Adding file reader
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		//Creating String variable
		String s;
		
		//setting counter to 0
		int counter = 0;
		
		Float sum = 0f;
		
		//Write while loop to go through each number of the file
		while((s = br.readLine()) != null) {
			counter++;
			
			//Casting String to float value
			Float fl = Float.parseFloat(s);
			
			sum = sum + fl;
		}
		
		br.close();
		
		//Finding out average value
		float avg = sum / counter;
		
		//Printing Rows, Total numbers and Average number in the file
		System.out.printf("Numbers of Rows in the file: %d\n", counter);
		System.out.printf("Total of all of the number: %.2f\n", sum);
		System.out.printf("The average number in the file: %.2f", avg);
		
		} catch(Exception ex) {
			return;
		}
	
	}

}
