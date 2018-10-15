package aaronarthur.Ch4Assignment;

import java.util.Arrays;
import java.util.Scanner;

// Aaron Arthur 10/18 Sorts 3 numbers from smallest to largest

public class SortIntetersArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Initialize variables
		
		int num1;
		int num2;
		int num3;
		
		System.out.println("Welcome to the number sorter! ");
		
		System.out.println("Enter a whole number: ");
		num1 = input.nextInt();
		
		System.out.println("Enter another whole number: ");
		num2 = input.nextInt();
		
		System.out.println("Enter a final whole number: ");
		num3 = input.nextInt();
		
		int[] array1 = {num1, num2, num3};
		
		Arrays.sort(array1);
		
		System.out.printf("Sorted numbers: %s", Arrays.toString(array1));

	}

}
