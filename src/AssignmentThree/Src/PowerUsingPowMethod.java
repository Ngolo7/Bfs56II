package AssignmentThree.Src;

import java.util.Scanner;

import static AssignmentThree.Utilities.utils.InputNumber;

public class PowerUsingPowMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base:");
        int base = sc.nextInt();
        System.out.println("Enter the exponent:");
        int exponent = sc.nextInt();

        // Handle specific edge cases
        if (base == 0 && exponent == 0) {
            System.out.println("0^0 is mathematically undefined.");
        } else if (exponent < 0) {
            System.out.println("Negative exponents result in fractions. The result might not be an integer.");
        } else {
            // Calculate power using pow() method inside a for loop
            double result = 1;
            for (int i = 1; i <= exponent; i++) {
                result = Math.pow(base, i);  // Using pow() method inside a for loop
                System.out.println(base + "^" + i + " = " + result);
            }

            // Display the final result
            System.out.println("Final result: " + base + "^" + exponent + " = " + Math.pow(base, exponent));
        }
    }
}
