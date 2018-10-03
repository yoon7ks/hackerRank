package hackerLank.day;

import java.util.Scanner;

public class Day17_More_Exceptions {

	static class Calculator {

		public int power(int n, int p) throws Exception {
			
			if (n < 0 || p < 0) {
				throw new Exception("n and p should be non-negative");
			} else if (p == 0) {
				return 1;
			} else {
				return n * power(n, p - 1);
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("=>");
		int t = in.nextInt();
		
		while (t-- > 0) {
			System.out.print("n=");
			int n = in.nextInt();
			
			System.out.print("p=");
			int p = in.nextInt();
			
			Calculator myCalculator = new Calculator();
			
			try {
				int ans = myCalculator.power(n, p);
				System.out.println("result=" + ans);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		in.close();
	}

}
