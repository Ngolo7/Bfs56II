package AssignmentThree.Src;

import static AssignmentThree.Utilities.utils.InputNumber;

public class StrongNumber {

    public static void main(String[] args) {
        // Input a single number to check if it is a Strong number
        int number = InputNumber();

        // Check if the number is a Strong number
        if (isStrongNumber(number)) {
            System.out.println(number + " is a Strong number.");
        } else {
            System.out.println(number + " is not a Strong number.");
        }
    }

    // Method to check if a given number is a Strong number
    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;

        // Loop to find the factorial of each digit and sum them
        while (number > 0) {
            int digit = number % 10;  // Extract the last digit
            sum += factorial(digit);  // Add the factorial of the digit to the sum
            number /= 10;  // Remove the last digit
        }

        // Check if the sum of the factorial of digits is equal to the original number
        return sum == originalNumber;
    }

    // Method to calculate the factorial of a given digit
    public static int factorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }
}
