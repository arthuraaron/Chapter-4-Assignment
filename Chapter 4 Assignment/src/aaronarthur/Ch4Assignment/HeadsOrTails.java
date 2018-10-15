package aaronarthur.Ch4Assignment;

// Aaron Arthur 10/18 Lets the user guess the result of a coin flip

import java.util.Scanner;

public class HeadsOrTails {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Initialize variables
		int result;
		int guess;
		
		// Ask user for guess
		System.out.println("Welcome to the coin flip guesser. ");
		System.out.print("Will the coin land on heads or tails? \n(0: Heads, 1: Tails): ");
		guess = input.nextInt();
		
		// Determine result
		result = (int) (Math.random() * 2);

		// See if the user guessed correctly
		if (guess == result) {
			System.out.println("Congrats, you guessed correctly. ");
		}
		else {
			System.out.println("Sorry, you guessed incorrectly. ");
		}
		
	}

}
