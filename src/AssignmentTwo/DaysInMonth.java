package AssignmentTwo;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = 0;
        int year = 0;  // Variable to store the year number
        boolean validInput = false;

        // Loop until valid input for month is provided
        while (!validInput) {
            System.out.print("Enter month number (1-12): ");
            month = scanner.nextInt();

            if (month >= 1 && month <= 12) {
                validInput = true;
            } else {
                System.out.println("Invalid month number! Please enter a number between 1 and 12.");
            }
        }

        // Ask for the year to check for leap year
        System.out.print("Enter year: ");
        year = scanner.nextInt();

        // Check if the year is a leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeapYear) {
            System.out.println("Leap year");
        }
        else
            System.out.println("Not a leap year");

        // Determine the number of days in the month using if-else
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("31 days");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 days");
        } else if (month == 2) {
            if (isLeapYear) {
                System.out.println("29 days");
            } else {
                System.out.println("28 days");
            }
        }

        scanner.close();  // Close the scanner
    }
}
