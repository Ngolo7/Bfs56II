import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;  // To track whether the input is valid
        double fahrenheit = 0;

        while (!validInput) {  // Loop until valid input is provided
            try {
                System.out.print("Enter temperature in Fahrenheit: ");
                fahrenheit = scanner.nextDouble();  // Attempt to read user input
                validInput = true;  // Input is valid, exit the loop
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next();  // Clear the invalid input
            }
        }

        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " Fahrenheit = " + celsius + " Celsius");

        scanner.close();
    }
}
