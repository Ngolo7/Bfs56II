import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = 0;  // Variable to store the month number
        boolean validInput = false;  // Flag to track valid input

        // Loop until valid input is provided
        while (!validInput) {
            System.out.print("Enter month number (1-12): ");
            month = scanner.nextInt();

            if (month >= 1 && month <= 12) {
                validInput = true;
            } else {
                System.out.println("Invalid month number! Please enter a number between 1 and 12.");
            }
        }

        // Determine the number of days in the month
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("31 days");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 days");
        } else if (month == 2) {
            System.out.println("28 or 29 days (leap year)");
        }

        scanner.close();  // Close the scanner
    }
}
