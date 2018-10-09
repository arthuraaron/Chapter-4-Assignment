package aaronarthur.Ch4Assignment;

// Aaron Arthur 10/18 Find the day of the week in x amount of days

import java.util.Scanner;

public class FindFutureDates {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Initialize variables
		int currentDay;
		int howManyDays;
		int futureDay;
		
		// Get user input
		
		System.out.println("What is the current day of the week? (Sunday is 0, Monday is 1, Saturday is 6): ");
		currentDay = input.nextInt();
		
		System.out.println("Enter the amount of days it is until another date: ");
		howManyDays = input.nextInt();
		
		// Do calculations
		
		futureDay = (currentDay + howManyDays) % 7;
		
		// Output the day of the week of future day
		
		if (futureDay == 0) {
			System.out.println("The day of the week on the future day is: Sunday. ");
		}
		else if (futureDay == 1) {
			System.out.println("The day of the week on the future day is: Monday. ");
		}
		else if (futureDay == 2) {
			System.out.println("The day of the week on the future day is: Tuesday. ");
		}
		else if (futureDay == 3) {
			System.out.println("The day of the week on the future day is: Wednesday. ");
		}
		else if (futureDay == 4) {
			System.out.println("The day of the week on the future day is: Thursday. ");
		}
		else if (futureDay == 5) {
			System.out.println("The day of the week on the future day is: Friday. ");
		}
		else if (futureDay == 6) {
			System.out.println("The day of the week on the future day is: Saturday. ");
		}
		else {
			System.out.println("Program is broken. ");
		}
		
	}

}
