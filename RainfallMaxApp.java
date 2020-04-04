package Lab5;
import java.util.Scanner;

public class RainfallMaxApp {

	public static void main(String[] args) {
		
		double rainfall [][]; //declare 2D [] to store the value pr by user
		rainfall = new double [4][7]; //here we made a size for 4 weeks and 7 days
		
		
		Scanner sc = new Scanner (System.in);  //declare scanner
		
		System.out.println ("Number of weeks: ");
		int weeks = sc.nextInt();
		
		System.out.println ("Number of days per week: ");
		int days = sc.nextInt();
		
		//create 2D array with as many rows as weeks and col as days
		rainfall = new double [weeks][days];
		for(int row = 0; row < rainfall.length; row++) {
			for (int col = 0; col < rainfall[row].length; col++) {

				System.out.println ("enter rainfall value for weeks: " + (row+1) + "day" + (col+1) + ":");
				
				rainfall[row][col]= sc.nextDouble();
					

			}
			} //end for
		//processing
		//cal max value in the array
		double max;
		max = rainfall [0][0];
		
		// traverse 2D [] using outer and inner loop
		for (int row = 0; row < rainfall.length; row++) {
			//retrieve the current row, located at the i given by the value of the variable row
			double r[] = rainfall[row];
			
			//traverse all the elements of the current row (col)
			for (int col = 0; col <r.length; col++) {
				
				//if the value of the max variable is lower than current element, then we update the max with that element	
				if (max < rainfall [row][col]) { //if a new max value has been found,
					max = rainfall [row][col]; //its gonna replace the previous value of the max 
				} //end if
			} //end inner loop
		} //end for
		
		//output
		System.out.println ("max is " + max);

	} //end main
} //end class
