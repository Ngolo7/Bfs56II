package AssignmentThree.Src;

import static AssignmentThree.Utilities.utils.InputNumber;

public class PerfectNumber {

    public static void main(String[] args) {
        int number = InputNumber();

        if (isPerfectNumber(number)) {
            System.out.println(number + " is a Perfect number.");
        } else {
            System.out.println(number + " is not a Perfect number.");
        }
    }

    // Method to check if a given number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int sum = 0;

        // Loop to find the divisors and calculate their sum
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;  // Add the divisor to the sum
            }
        }

        // Check if the sum of divisors is equal to the number
        return sum == number;
    }
}
