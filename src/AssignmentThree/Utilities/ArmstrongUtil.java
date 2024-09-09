package AssignmentThree.Utilities;

public class ArmstrongUtil {

    // Method to check if a given number is Armstrong
    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int numDigits = countDigits(number);  // Get the number of digits

        // Calculate the sum of the digits raised to the power of the number of digits
        int sum = 0;
        for (int temp = number; temp > 0; temp /= 10) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, numDigits);  // Raise digit to the power of numDigits
        }

        // Return true if the sum is equal to the original number
        return sum == originalNumber;
    }

    // Method to count the number of digits in a number
    public static int countDigits(int number) {
        if (number == 0) {
            return 1;  // Special case for 0, since it has one digit
        }

        int numDigits = 0;
        while (number > 0) {
            number /= 10;
            numDigits++;
        }
        return numDigits;
    }
}
