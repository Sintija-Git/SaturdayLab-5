package Lab5;
import java.util.Scanner;
/**
2D Arrays Problems
Compute the average of the rainfall values stored each day for 4 weeks
 RainfallAvgApp
 -- prompts the user to input the rainfall values for 4 weeks
 -- calculates the average of the rainfall
 -- displays the values from the rainfall 2D array
 */
public class RainFallAvgApp {

	public static void main(String[] args) {
		//local variables
		int [][] rainfall = new int [4][7];
		
		//input 
		Scanner sc = new Scanner(System.in);

		//ask user to input data 

		for (int row = 0; row< rainfall.length; row++) {
			for (int col =0; col< rainfall[row].length; col ++) {
				System.out.print ("enter value for week:" + (row+1) + "day" + (col+1) + ":");
				
				//read the value entered by user and save it in 2D	[]
				rainfall [row][col] = sc. nextInt();
			}
		} //end for

		//processing - calculate the sum of all elements of the []
		//how many elements the [] contains
		int sum = 0;// the sum
		int counter = 0; //the num of elements in 2d []
		double average;
		
		for (int row = 0; row < rainfall.length; row++) {
			for (int col = 0; col < rainfall[row].length; col++) {
				//add the current element from the [] rainfall to the sum
				sum = sum + rainfall [row][col];
				
				counter ++; // another element has been added to the sum, so +1
				
			}
		} //end for
		
		//compute the average of all the elements in the []
		average = sum/counter;
		
		//output
		System.out.println ();
		System.out.println ("Average " + average);
		System.out.println ("_________________");
		
		//output the sD [] - the data that user has entered
		System.out.print ("The rainfall values are: ");
		for (int row = 0; row < rainfall.length; row++) {
			for (int col = 0; col < rainfall[row].length; col++) {
		System.out.print(rainfall[row][col] + " ");
		
			}
			System.out.println ();
			} // end for
		
	} //end main

} //end class
