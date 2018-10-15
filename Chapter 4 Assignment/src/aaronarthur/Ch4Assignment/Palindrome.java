package aaronarthur.Ch4Assignment;

import java.util.Scanner;

// Aaron Arthur 10/18 Determines if a 3 number integer is a palindrome

public class Palindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Ask user for number
		System.out.print("Welcome to the palindrome program. \nEnter a 3 digit number: ");
		int number = input.nextInt();
		
		// Break number up into digits
		int num1 = number / 100;
		int num2 = (number % 100) / 10;
		int num3 = number % 10;

		// Check if the number is a palindrome
		if (num1 == num3) {
			System.out.println(number + " is a palindrome. ");
		}
		else {
			System.out.println(number + " is not a palindrome. ");
		}
		
		
	}

}
