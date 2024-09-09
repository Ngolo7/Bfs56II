package AssignmentThree.Src;

import java.util.Scanner;

public class PowerWithoutPowMethodRange {

    public static void main(String[] args) {
        // Input base and exponent from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base:");
        int base = sc.nextInt();
        System.out.println("Enter the exponent:");
        int exponent = sc.nextInt();


        // Calculate power using for loop
        long result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        // Output the result
        System.out.println("The result of " + base + " raised to the power of " + exponent + " is " + result);
    }
}
