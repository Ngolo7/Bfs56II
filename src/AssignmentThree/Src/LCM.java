package AssignmentThree.Src;

import java.util.Scanner;

import static AssignmentThree.Src.GCD.findGCD;

public class LCM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();

        int gcd = findGCD(a, b);  // Calculate GCD of the two numbers
        int lcm = (a * b) / gcd;  // Calculate LCM using the relationship between GCD and LCM
        System.out.println("GCD of " + a + " and " + b + " is " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is " + lcm);
    }


}
