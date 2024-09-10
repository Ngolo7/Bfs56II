package AssignmentThree.Loops;

import java.util.Scanner;
public class PowerWithoutPowMethod {

    public static void main(String[] args) {
        // Input base and exponent from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base:");
        int base = sc.nextInt();
        System.out.println("Enter the exponent:");
        int exponent = sc.nextInt();



        // Display the result
        System.out.println(base + "^" + exponent + " = " + power(base, exponent));
    }

    // Method to calculate power without using pow() method
    public static long power(int base, int exponent) {
        long result = 1;

        // Multiply the base with itself 'exponent' times
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        return result;
    }
}
