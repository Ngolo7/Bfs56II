package AssignmentTwo;

import java.util.Scanner;

public class DivisionBasedOnMarks {
    public static void main(String[] args) {
        Scanner sch = new Scanner(System.in);
        float marks = 0;
        boolean validInput = false;

        // Loop until valid input is provided
        while (!validInput) {
            try {
                System.out.println("Enter obtained marks in percentage:");
                marks = sch.nextFloat();
                if (marks < 0 || marks > 100) {  // Validate percentage range
                    throw new Exception("Marks should be between 0 and 100.");
                }
                validInput = true;  // Valid input received, exit the loop
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid percentage. " + e.getMessage());
                sch.nextLine();  // Clear invalid input
            }
        }

        // Determine division based on marks
        if (marks >= 60) {
            System.out.println("You got in the First Division");
        } else if (marks >= 45 && marks < 60) {
            System.out.println("You got in the Second Division");
        } else if (marks >= 30 && marks < 45) {
            System.out.println("You got in the Third Division");
        } else {
            System.out.println("You have failed! Try again.");
        }

        sch.close();  // Close the scanner
    }
}
