package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SwapThreeArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the arrays: ");
        int size = scanner.nextInt();

        int[] array1 = new int[size];
        int[] array2 = new int[size];
        int[] array3 = new int[size];

        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < size; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < size; i++) {
            array2[i] = scanner.nextInt();
        }

        System.out.println("Enter elements for the third array:");
        for (int i = 0; i < size; i++) {
            array3[i] = scanner.nextInt();
        }

        // Print arrays before swapping
        System.out.println("Arrays before swapping:");
        System.out.println("First array: " + Arrays.toString(array1));
        System.out.println("Second array: " + Arrays.toString(array2));
        System.out.println("Third array: " + Arrays.toString(array3));

        // Swap the elements of the three arrays using a temporary variable
        for (int i = 0; i < size; i++) {
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = array3[i];
            array3[i] = temp;
        }

        // Print arrays after swapping
        System.out.println("---------------------------------");
        System.out.println("Arrays after swapping:");
        System.out.println("First array: " + Arrays.toString(array1));
        System.out.println("Second array: " + Arrays.toString(array2));
        System.out.println("Third array: " + Arrays.toString(array3));
    }
}
