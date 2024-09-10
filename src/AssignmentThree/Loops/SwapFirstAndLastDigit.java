package AssignmentThree.Loops;

import static AssignmentThree.Utilities.utils.InputNumber;

public class SwapFirstAndLastDigit {

    public static void main(String[] args) {

        int x = InputNumber();
        System.out.println(swapDigits(x));
    }

    static int swapDigits(int x) {
        System.out.print(x + " -> ");
        int sign = Integer.signum(x);
        x *= sign;  // Handle negative number

        int last = x % 10;
        int n = x / 10;
        int s = 0;  // Sum for middle digits

        // Loop to handle middle digits and adjust first digit
        for (int p = 1; n > 10; n /= 10, last *= 10, p *= 10) {
            s += p * (n % 10);  // Add middle digits to s
        }

        // Restore the sign and return the swapped number
        return sign * (10 * (last + s) + n);  // Swap first and last digits
    }
}
