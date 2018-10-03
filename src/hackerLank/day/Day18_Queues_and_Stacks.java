package hackerLank.day;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Day18_Queues_and_Stacks {

	static class Solution {

		Deque<Character> stack = new ArrayDeque<>(); // Stack
		
		LinkedList<Character> queue = new LinkedList<>(); // Queue
		
		public void pushCharacter(char c) {
			stack.push(c);
		}

		public void enqueueCharacter(char c) {
			queue.add(c);
		}

		public Character dequeueCharacter() {
			return stack.pop();
		}

		public Character popCharacter() {
			return queue.poll();
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("=");
		String input = scan.nextLine();
		scan.close();
		
		// Convert input String to an array of characters:
		char[] s = input.toCharArray();
		
		// Create a Solution object:
		Solution p = new Solution();
		
		// Enqueue/Push all chars to their respective data structures:
		for (char c : s) {
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}
		
		boolean isPalindrome = true;
		
		for (int i = 0; i < s.length/2; i++) {
			
			if (p.popCharacter() != p.dequeueCharacter()) {
				isPalindrome = false;
				break;
			}
		}
		
		System.out.println("The word, " + input + ", is" + ( (!isPalindrome) ? " not a palindrome." : " a palindrome." ));
	}

}
