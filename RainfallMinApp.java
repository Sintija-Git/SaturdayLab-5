package Lab5;
import java.util.Scanner;
public class RainfallMinApp {

	public static void main(String[] args) {
		double rainfall [][];
		rainfall = new double [4][7];
		double min;
		
		Scanner sc = new Scanner (System.in);
		
		//user input
		System.out.println("Number of weeks: "); //this will be outer loops input
		int weeks = sc.nextInt();
		
		System.out.println("Number of days in a week: "); //this will be inner loops input
		int days = sc.nextInt();
		
		
		//for loop for user to be able to give the value for each day separately
		rainfall = new double [weeks][days]; //changing variables from already provided [4][7] to users input instead
		for (int row = 0; row < rainfall.length; row++) {
			for (int col = 0; col < rainfall[row].length; col++) {
				System.out.print("Enter rainfall value for weeks " + (row+1) + " day " + (col+1) + " : ");
				rainfall [row][col] = sc.nextDouble();
				
				System.out.println ();
			}
		}
				
		//method for computing min	
			min = rainfall [0][0];	
				for (int row = 0; row < rainfall.length; row++) {
					for (int col = 0; col < rainfall[row].length; col++) {
				
						if (min > rainfall[row][col]) { //if to compare current min with default one
						min = rainfall [row][col]; //if current is lower, uppdate min
						} //end if
				}
				} //end for
				
				//output for presenting min
				System.out.println("Min is: " + min); 

	} //end main

} //end class
