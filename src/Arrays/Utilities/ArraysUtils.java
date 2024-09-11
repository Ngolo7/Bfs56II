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

        return array;
    }
    // Method to find the maximum and minimum values of the array
    public static int[] MaxMin(int[] array) {
        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Maximum value of the array: " + max);
        System.out.println("Minimum value of the array: " + min);
        return new int[]{max, min};
    }
}
