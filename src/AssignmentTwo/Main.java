package AssignmentTwo;

import java.util.Random; // Import Random class to generate random numbers

public class Main{
    public static void main(String[] args) {
        Random random = new Random(); // Create a Random object

        // Task 1: Find maximum between two random numbers
        int num1 = random.nextInt(100); // Generate a random number between 0 and 99
        int num2 = random.nextInt(100); // Generate a random number between 0 and 99
        System.out.println("Random numbers for task 1: " + num1 + ", " + num2);
        if (num1 > num2) {
            System.out.println("Task 1: Maximum of two numbers is: " + num1);
        } else {
            System.out.println("Task 1: Maximum of two numbers is: " + num2);
        }

        // Task 2: Find maximum among three random numbers
        int num3 = random.nextInt(100); // Generate a third random number
        System.out.println("Random numbers for task 2: " + num1 + ", " + num2 + ", " + num3);
        if (num1 > num2 && num1 > num3) {
            System.out.println("Task 2: Maximum of three numbers is: " + num1);
        } else if (num2 > num3) {
            System.out.println("Task 2: Maximum of three numbers is: " + num2);
        } else {
            System.out.println("Task 2: Maximum of three numbers is: " + num3);
        }

        // Task 3: Check if a random number is divisible by 3
        int num4 = random.nextInt(100); // Generate a new random number for divisibility check
        System.out.println("Random number for task 3: " + num4);
        if (num4 % 3 == 0) {
            System.out.println("Task 3: " + num4 + " is divisible by 3.");
        } else {
            System.out.println("Task 3: " + num4 + " is not divisible by 3.");
        }

        // Task 4: Check if a random number is divisible by 5
        System.out.println("Random number for task 4: " + num4); // Reuse num4
        if (num4 % 5 == 0) {
            System.out.println("Task 4: " + num4 + " is divisible by 5.");
        } else {
            System.out.println("Task 4: " + num4 + " is not divisible by 5.");
        }

        // Task 5: Check if a random number is divisible by 11
        System.out.println("Random number for task 5: " + num4); // Reuse num4
        if (num4 % 11 == 0) {
            System.out.println("Task 5: " + num4 + " is divisible by 11.");
        } else {
            System.out.println("Task 5: " + num4 + " is not divisible by 11.");
        }

        // Task 6: Check if a random number is even or odd
        System.out.println("Random number for task 6: " + num4); // Reuse num4
        if (num4 % 2 == 0) {
            System.out.println("Task 6: " + num4 + " is even.");
        } else {
            System.out.println("Task 6: " + num4 + " is odd.");
        }

        // Task 7: Check if a random year is a leap year or not
        int year = random.nextInt(2025); // Generate a random year between 0 and 2024
        System.out.println("Random year for task 7: " + year);
        if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
            System.out.println("Task 7: " + year + " is a leap year.");
        } else {
            System.out.println("Task 7: " + year + " is not a leap year.");
        }
    }
}
