package AssignmentThree.Src;

import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();

        // Call the method to find GCD
        int gcd = findGCD(a, b);


        System.out.println("HCF (GCD) of " + a + " and " + b + " is " + gcd);
    }

    // Method to find GCD and print common divisors
    public static int findGCD(int a, int b) {
        int gcd = 1;

        // Display common divisors of both numbers
        System.out.println("Common divisors of " + a + " and " + b + ": ");
        for (int i = 1; i <= Math.min(a, b); i++) {  // Iterate up to the smaller number
            if (a % i == 0 && b % i == 0) {
                System.out.print(i + " ");
                gcd = i;  // Update GCD
            }
        }
        System.out.println();

        return gcd;
    }
}
