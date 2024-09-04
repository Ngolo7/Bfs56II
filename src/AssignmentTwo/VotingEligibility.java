import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter your age: ");
                int age = sc.nextInt();

                // Check voting eligibility
                if (age >= 18) {
                    System.out.println("You are eligible to vote.");
                } else {
                    System.out.println("You are not eligible to vote.");
                }

                validInput = true;  // If input is valid, exit the loop
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid integer for age.");
                sc.nextLine();  // Clear the invalid input from the scanner buffer
            }
        }

        sc.close();  // Close the scanner
    }
}
