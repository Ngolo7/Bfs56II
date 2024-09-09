package AssignmentThree.Src;

import static AssignmentThree.Utilities.utils.InputNumber;

public class FibonacciSeriesLoop {

    public static void main(String[] args) {
        int n = InputNumber();
        System.out.println("Fibonacci series up to " + n + ":");
        printFibonacci(n);
    }

    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b); // Print first two Fibonacci numbers

        // Loop to generate Fibonacci numbers
        for (int i = 3; i <= n; i++) {
            int next = a + b; // 0+1 = 1
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }
}
