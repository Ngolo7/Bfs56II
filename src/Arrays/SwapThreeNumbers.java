package Arrays;

import java.util.Scanner;

public class SwapThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();

        System.out.print("Enter third number (c): ");
        int c = scanner.nextInt();

        System.out.println("Before Swap:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        // Swapping the numbers using a temporary variable
        int temp = a;
        a = b;
        b = c;
        c = temp;

        System.out.println("After Swap:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }
}
