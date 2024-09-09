package AssignmentThree.Utilities;

import java.util.Scanner;

public class utils {
    private static Scanner sc = new Scanner(System.in);

    // Method to input a number
    public static int InputNumber() {
        System.out.print("Enter the number: ");
        return sc.nextInt();  // Don't close the Scanner here, as it will be reused.
    }
}
