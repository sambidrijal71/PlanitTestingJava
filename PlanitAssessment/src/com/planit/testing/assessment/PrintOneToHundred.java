package com.planit.testing.assessment;

public class PrintOneToHundred {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {// iterate 1 to 100
			if (i % 3 == 0 && i % 5 == 0) // check if remainder equals to zero
				System.out.print("PlanitTesting ");
			else if (i % 3 == 0)
				System.out.print("Planit ");
			else if (i % 5 == 0)
				System.out.print("Testing ");
			else
				System.out.print(i + " ");// print all remaining numbers
		}
	}

}
