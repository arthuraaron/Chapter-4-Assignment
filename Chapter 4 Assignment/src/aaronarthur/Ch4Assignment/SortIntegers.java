package aaronarthur.Ch4Assignment;

// Aaron Arthur 10/18 Sorts 3 Integers

import java.util.Scanner;

public class SortIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Initialize variables
		
		int num1;
		int num2;
		int num3;
		
		int big = 0;
		int medium = 0;
		int small = 0;
		
		
		// Get user input
		
		System.out.println("Welcome to the number sorter! ");
		
		System.out.println("Enter a whole number: ");
		num1 = input.nextInt();
		
		System.out.println("Enter another whole number: ");
		num2 = input.nextInt();
		
		System.out.println("Enter a final whole number: ");
		num3 = input.nextInt();
		
		
		// Assign the value for num1
		if (num1 > num2 & num1 > num3) {
			big = num1;
		}
		else if (num1 < num2 & num1 < num3) {
			small = num1;
		}
		else {
			medium = num1;
		}
		
		// Assign the value for num2
		if (num2 > num1 & num2 > num3) {
			big = num2;
		}
		else if (num2 < num1 & num2 < num3) {
			small = num2;
		}
		else {
			medium = num2;
		}
		
		// Assign the value for num3
		if (num3 > num1 & num3 > num2) {
			big = num3;
		}
		else if (num3 < num1 & num3 < num2) {
			small = num3;
		}
		else {
			medium = num3;
		}
		
		// Cases with same numbers
		
		
		// Print the numbers in increasing order
		System.out.println("The smallest number is: " + small);
		System.out.println("The middle number is: " + medium);
		System.out.println("The largest number is: " + big);
		
	}

}
