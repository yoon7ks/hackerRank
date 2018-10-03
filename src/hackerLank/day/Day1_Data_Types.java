package hackerLank.day;

import java.util.Scanner;

public class Day1_Data_Types {

	
	public static void main(String[] args) {
		
		int i = 4;
		double d = 4.0;
		String s = "Hacker Rank ";
		
		Scanner scan = new Scanner(System.in);
		
		/* Declare second integer, double, and String variables. */
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        /* Print the sum of both integer variables on a new line. */
        /* Print the sum of the double variables on a new line. */
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
		
		int getInt = scan.nextInt();
		double getDouble = scan.nextDouble();
		String getStr = scan.next() + scan.nextLine();
		
		scan.close();
		
		i += getInt;
		d += getDouble;
		s += getStr;
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(s);
		
	}
}
