package hackerLank.day;

import java.util.Scanner;

public class Day2_Operators {
	// Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
    	double tip = (meal_cost * ((float)(tip_percent * 0.01)));
    	double tax = (meal_cost * ((double)(tax_percent * 0.01)));

    	double totalCost = meal_cost + tip + tax;
    	
    	System.out.println(Math.round(totalCost));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
