package AssignmentThree;

import java.util.Scanner;
import static AssignmentThree.Utilities.utils.InputNumber;

public class ArmstrongNumber {

    public static void main(String[] args) {

        int number = InputNumber();


        // Print the result
        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    // Method to check if a given number is Armstrong
    public static boolean isArmstrongNumber(int number) {
        // Find the number of digits
        int originalNumber = number;
        int numDigits = 0;

        // Calculate the number of digits
        // If number is 0, return 1 since it has one digit
        if (number == 0) {
           numDigits = 1;
        }
        for (int temp = number; temp > 0; temp /= 10) {
            numDigits++;
        }
        System.out.println("Number of digits: " + numDigits);

        // Calculate the sum of the digits raised to the power of the number of digits
        int sum = 0;
        for (int temp = number; temp > 0; temp /= 10) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, numDigits);
        }

        // Check if the sum of the digits raised to the power equals the original number
        return sum == originalNumber;
    }
}
