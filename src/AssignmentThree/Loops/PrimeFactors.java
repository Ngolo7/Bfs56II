package AssignmentThree.Loops;

import static AssignmentThree.Utilities.utils.InputNumber;

public class PrimeFactors {

    public static void main(String[] args) {
        int number = InputNumber();

        // Print prime factors of the input number
        System.out.println("Prime factors of " + number + ": ");
        findPrimeFactors(number);  // Find and print all prime factors
    }

    // Method to find and print all prime factors
    public static void findPrimeFactors(int number) {
        // Print the number of 2s that divide the number
        while (number % 2 == 0) {
            System.out.print(2 + " ");
            number /= 2;
        }

        // For odd factors, check from 3 onwards
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }

        //If the remaining number is a prime number greater than 2, print it
        if (number > 2) {
            System.out.print(number);
        }
        System.out.println();  // Move to the next line after printing all factors
    }
}
