import java.util.Arrays;
import static Arrays.Utilities.ArraysUtils.*;
public class SeparateEvenOddInPlace {
    public static void main(String[] args) {
        int[] array =inputArray();


        System.out.println("Original array:");
        printArray(array);

        separateEvenOddInPlace(array);

        System.out.println("Separated array (evens first, then odds):");
        printArray(array);
    }

    public static void separateEvenOddInPlace(int[] array) {
        int index = 0;  // Pointer for the next position for even numbers

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
                index++;
            }
        }
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
