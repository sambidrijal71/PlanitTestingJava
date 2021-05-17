package com.planit.testing.assessment;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String result = "";
		System.out.println("Enter a string to reverse it");
		Scanner input = new Scanner(System.in);
		String string = input.nextLine().replaceAll(" ", "-").toLowerCase();// getting an input string from a user and
																			// replacing any space with "-"
		char character[] = string.toCharArray();
		for (int i = character.length - 1; i >= 0; i--) {
			result += character[i]; // storing reversed character into string as final output
		}
		input.close();
		System.out.println("Reversed output of the string is: " + result);
	}

}
