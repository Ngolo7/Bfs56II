import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = 0;  // Variable to store day number
        boolean validInput = false;  // Flag to track valid input

        // Loop until valid input is provided
        while (!validInput) {
            System.out.print("Enter a day number (1-7): ");
            day = scanner.nextInt();  // Read the day number

            if (day >= 1 && day <= 7) {  // Check if the input is in the valid range
                validInput = true;  // Valid input, exit the loop
            } else {
                System.out.println("Invalid day number! Please enter a number between 1 and 7.");
            }
        }

        // Determine the corresponding day of the week
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        }

        scanner.close();  // Close the scanner
    }
}
