package AssignmentTwo;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;

        // Loop to ensure the user enters a valid four-digit year
        do {
            System.out.print("Enter a 4-digit year: ");
            year = scanner.nextInt();
            if (year < 1000 || year > 9999) {
                System.out.println("Invalid input. Please enter a four-digit year.");
            }
        }
        while (year < 1000 || year > 9999);  // Repeat until a valid year is entered

        // Check if the year is a leap year
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}
