PlanitTestingJava repository contains programs developed using Java. 

1. Java program that prints the numbers from 1 to 100. For every multiple of three, the program prints "Planit" instead of the number, and for the multiples of five, the program prints "Testing". For the numbers which are multiples of both three and five are printed "PlanitTesting".
      In this program, a for loop is used to loop between 1 to 100 and every number from the loop is modulated by 3, 5, and 3 or 5, and the results are printed accordingly.
       Output: 1 2 Planit 4 Testing Planit 7 8 Planit Testing 11 Planit 13 14 PlanitTesting 16 17 Planit 19 Testing Planit 22 23 Planit Testing 26 Planit 28 29 PlanitTesting 31 32 Planit 34 Testing Planit 37 38 Planit Testing 41 Planit 43 44 PlanitTesting 46 47 Planit 49 Testing Planit 52 53 Planit Testing 56 Planit 58 59 PlanitTesting 61 62 Planit 64 Testing Planit 67 68 Planit Testing 71 Planit 73 74 PlanitTesting 76 77 Planit 79 Testing Planit 82 83 Planit Testing 86 Planit 88 89 PlanitTesting 91 92 Planit 94 Testing Planit 97 98 Planit
     
 2. Java program to find the character that has the highest number of occurrences within a certain string, ignoring case. If there is more than one character with equal highest occurrences, it returns the character that appeared first within the string.
      In this program, a string is scanned as user input, changed to lower case, and is converted to an array of characters. We use two different for loops and compare each character and fetch the highest occurring character.
       Sample Input: "Character"
       Sample Output: c 
    
  3. Java program that reverses a string and replaces any spaces with hyphens (-)
      In this program, a string is scanned as user input, changed to lower case, and replaced all spaces with '-'. The manipulated string is then converted to an array of characters. Using for loop, the reverse of the string is achieved.
       Sample Input: "reverse order"
       Sample Output: "redro-esrever"
      
  4. Java program as a food ordering system where the user inputs the food name into the food order and then the order gets passed to the appropriate restaurant on a list and the restaurant prints the receipt on stdout.
      In this program, a food ordering system is developed where the user inputs the food name into the food order as a string. The string is then used in the switch case to return the appropriate message for the user.
       Sample Input: “pepperoni pizza”
       Sample Output: "Awesome pizza place, pepperoni pizza, $20”
