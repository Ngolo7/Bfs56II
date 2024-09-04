import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = 0;  // Variable to store valid input
        boolean validInput = false;  // Flag to check if input is valid

        // Loop until valid input is provided
        while (!validInput) {
            try {
                System.out.print("Enter temperature in Celsius: ");
                celsius = scanner.nextDouble();  // Try to read the input
                validInput = true;  // If input is valid, set flag to true to exit loop
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next();  // Clear invalid input from the scanner buffer
            }
        }

        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + " Celsius = " + fahrenheit + " Fahrenheit");

        scanner.close();  // Close the scanner
    }
}
