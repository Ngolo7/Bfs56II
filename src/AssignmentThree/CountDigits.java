package AssignmentThree;
import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int count = countDigits(number);
        System.out.println("Number of digits: " + count);

        // Close the scanner
        scanner.close();
    }

    public static int countDigits(int number) {
        // Take the absolute value to handle negative numbers
        number = Math.abs(number);

        // If number is 0, return 1 since it has one digit
        if (number == 0) {
            return 1;
        }

        int count = 0;
        for (int temp = number; temp > 0; temp /= 10) {
            count++;
        }

        return count;
    }
}
