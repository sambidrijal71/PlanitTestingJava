package com.planit.testing.assessment;

import java.util.Scanner;

public class HighestOccuranceChar {

	public static void main(String[] args) {
		int i, j, count = 0, maxcount = 0;
		char result = 0;
		System.out.println("Enter a string to find maximum occuring character");
		Scanner input = new Scanner(System.in);
		String string = input.nextLine().toLowerCase(); // getting string input from user and converting it to lower
														// case
		char ch[] = string.toCharArray();
		for (i = 0; i < ch.length; i++) {
			count = 0; // initializing count to zero to reset for every new iterations
			for (j = 0; j < ch.length; j++) {
				if (ch[i] == ch[j]) { // comparing two characters of same string
					count++;
				}
				if (maxcount < count) {
					maxcount = count;
					result = ch[i];
				}
			}
		}
		System.out.print("Maximum occuring character in a string is: " + result);

	}

}
