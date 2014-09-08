package Problem2;

import java.util.Scanner;

/*
 * Author: Param (Shaleen)
 * 
 * The Program attempts to solve the following problem:
 *Given a string remove the consecutive dulicate characters from it keeping the original order.

Input: String (from System.in console input stream)
Output: Remove all consecutive duplicate letters
Eg.

Input: Mississippi
Output: Misisipi
*/

public class MainLine {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sc = new Scanner(System.in);
		
		String input = sc.nextLine().trim();
		
		RemoveDuplicateCharacters r = new RemoveDuplicateCharacters();
		
		String output = r.removeDuplicateConsecutiveEntries(input);
		
		System.out.println("The string after removing duplicate entries is: "+output);
		
	}

}
