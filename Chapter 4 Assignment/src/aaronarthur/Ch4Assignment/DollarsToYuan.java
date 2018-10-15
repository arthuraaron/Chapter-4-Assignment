package aaronarthur.Ch4Assignment;

// Aaron Arthur 10/18 Converts dollars to yuan and vice versa

import java.util.Scanner;

public class DollarsToYuan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Get user input
		System.out.print("Welcome the the RMB and Dollars converter! \n0: USD to RMB \n1: RMB to USD \nEnter a value: ");
		int direction = input.nextInt();
		
		// If statement for direction of conversion
		if (direction == 0) {
			// Selection of conversion rate and amount of USD
			System.out.print("You have selected USD to RMB. \nEnter the exchange rate from USD to RMB (Default is 6.81): ");
			double exchangeRate = input.nextDouble();
			System.out.println("Enter the amount of USD: ");
			double dollars = input.nextDouble();
			
			// Calculations
			double yuan = dollars * exchangeRate;
			System.out.println("$" + dollars + " is " + yuan + " Yuan. ");
			
			
		}
		else if (direction == 1) {
			// Selection of conversion rate and amount of Yuan
			System.out.print("You have selected RMB to USD. \nEnter the exchange rate from USD to RMB (Default is 6.81): ");
			double exchangeRate = input.nextDouble();
			System.out.println("Enter the RMB amount: ");
			double yuan = input.nextDouble();
			
			// Do calculations
			double dollars = yuan / exchangeRate;
			dollars = (int) (dollars * 100);
			dollars /= 100;
			System.out.println(yuan + " Yuan is $" + dollars + ". ");
			
		}
		else {
			System.out.println("You have entered an invalid number. ");
		}

	}

}
