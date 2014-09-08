package Problem1;

import java.util.Scanner;

/*
 * Author: Param (Shaleen)
 * 
 * The Program attempts to solve the following problem:
 * Given a string remove the dulicate characters from it keeping the original order.

Input: String (from System.in console input stream)
Output: Remove all duplicate letters
Eg.

Input: Mississippi
Output: Misp
 */

public class MainLine {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sc = new Scanner(System.in);
		
		String input = sc.nextLine().trim();
		
		RemoveDuplicateCharacters r = new RemoveDuplicateCharacters();
		
		String output = r.removeDuplicateEntries(input);
		
		System.out.println("The string after removing duplicate entries is: "+output);
		
	}

}
