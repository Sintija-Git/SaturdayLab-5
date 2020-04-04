package Lab5;
import java.util.Scanner;
public class ArrayApp {

	public static void main(String[] args) {
		// declare 2D variable array
		
			int arr [][] = new int [][] {{1,2,3},{4,5,6},{7,8,9,}}; 
			
			/*
		
		 	c
		 	o
		 	l
		row	1 2 3
			4 5 6
			7 8 9
		 
		 
			 */

			System.out.println(arr[2] [2]); //first array counts the rows from [0] and columns
			
			for( int row = 0; row <arr.length; row++) {
				for (int col = 0; col <arr[row].length; col++ ) {
					System.out.print (arr [row][col] + " ");
					
				}
				System.out.println ();
				
			}
			
			Scanner input = new Scanner (System.in);
			ArrayDemo myArray = new ArrayDemo();
			
			myArray.setNums(arr);
			for (int row = 0; row < arr.length; row ++) {
				for (int col = 0; col < arr[row].length; col ++) {
					System.out.println ("Please enter the number: ");
					int num = input.nextInt ();
					myArray.SetArrayNumber(row, col, num);
				}//
			}//
			
			//output
			for (int row = 0; row < arr.length; row ++) {
				for (int col = 0; col < arr[row].length; col ++) {
					System.out.print (arr [row] [col] + " ");
					
				}
				System.out.println ();
			}
	} //end main

}
