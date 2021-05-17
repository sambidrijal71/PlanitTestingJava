package com.planit.testing.assessment;

import java.util.Scanner;

public class FoodOrderingSystem {

	public static void main(String[] args) {
		System.out.println(
				"\t\t\tWelcome to food ordering system:\n\n 1. Burger\t\t 2. Pepperoni Pizza\t 3. Pasta\t\t 4. Noodles\t "
						+ "5. Parmi\n 6. Fish n Chips\t 7. Steak\t\t 8. Garlic Bread\t 9. Icecream\t 10. Coke\n");
		System.out.println("Please select your option as food name:");
		Scanner input = new Scanner(System.in);
		String choice = input.nextLine().toLowerCase();
		switch (choice) {// switch case to choose among the options
		case "burger":
			System.out.println("Wild Burger Joint, " + choice + ", $15");
			break;
		case "pepperoni pizza":
			System.out.println("Awesome Pizza Place, " + choice + ", $20");
			break;
		case "pasta":
			System.out.println("Amazing Pasta Palace, " + choice + ", $22");
			break;
		case "noodles":
			System.out.println("PNUT Noodles, " + choice + ", $15");
			break;
		case "parmi":
			System.out.println("Awesome Parmi House, " + choice + ", $18");
			break;
		case "fish n chips":
			System.out.println("Just Fish N Chips, " + choice + ", $14");
			break;
		case "steak":
			System.out.println("My Steak House, " + choice + ", $25");
			break;
		case "garlic bread":
			System.out.println("Bread And Butter Palace, " + choice + ", $08");
			break;
		case "icecream":
			System.out.println("Kwality Icecream, " + choice + ", $06");
			break;
		case "coke":
			System.out.println("Soft Drinks Center, " + choice + ", $03");
			break;
		default:
			System.out.println("Invalid option please try again");
		}
		input.close();

	}

}
