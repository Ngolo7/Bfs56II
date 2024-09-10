package AssignmentThree.Loops;

import static AssignmentThree.Utilities.utils.InputNumber;

public class PalindromeCheck {

    public static void main(String[] args) {
        int number = InputNumber();
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int number) {
        int reversed = 0, originalNumber = number;

        // Reverse the number using a for loop
        for (int n = number; n> 0; n = n/10) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
        }

        // Check if original number and reversed number are the same
        return originalNumber == reversed;
    }
}
