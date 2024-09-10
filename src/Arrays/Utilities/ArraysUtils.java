package Arrays.Utilities;

import java.util.Scanner;

public class ArraysUtils {

    private static Scanner scanner = new Scanner(System.in);

    // Method to take input for array elements
    public static int[] inputArray() {
        // Prompting user to input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declaring the array with the user-defined size
        int[] array = new int[size];

        // Taking input for array elements
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        return array; // return the filled array
    }
}
