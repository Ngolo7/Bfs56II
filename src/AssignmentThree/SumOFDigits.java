package AssignmentThree;


import java.util.Scanner;

public class SumOFDigits {
    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();


            // Print the result
            System.out.println("Sum of the digits: " + sumDigits(number));
        // Close the scanner
        scanner.close();

    }
    public static int sumDigits(int number) {
        // Take the absolute value to handle negative numbers
        number = Math.abs(number);

        // If number is 0, return 0 since the sum of its digits is 0
        if (number == 0) {
            return 0;
        }

        int sum = 0;

        // Use a for loop to sum the digits
        for (int temp = number; temp > 0; temp /= 10) {
            sum += temp % 10;  // Extract the last digit and add it to sum
        }

        return sum;
    }
}
