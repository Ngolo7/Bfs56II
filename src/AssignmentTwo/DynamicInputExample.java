package AssignmentTwo;

import java.util.Scanner;
public class DynamicInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner object for input

        // Get input from the user as a string first
        System.out.print("Enter a value (either integer or string): ");
        String userInput = scanner.nextLine();  // Read the input as a string
        char ch = userInput.charAt(4);
        System.out.println("The 5th character is: " + ch);

        // Try to determine if the input is an integer or a string
        try {
            // Try to parse the input as an integer
            int number = Integer.parseInt(userInput);
            System.out.println("You entered an integer: " + number);
        } catch (NumberFormatException e) {
            // If parsing fails, treat the input as a string
            System.out.println("You entered a string: " + userInput);
        }

        scanner.close();  // Close the scanner
    }
}


