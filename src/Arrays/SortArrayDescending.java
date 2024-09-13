package Arrays;
import java.util.Arrays;
import static Arrays.Utilities.ArraysUtils.*;

public class SortArrayDescending {
    public static void main(String[] args) {
        int[] array = inputArray();

        // Sort the array in ascending order
        Arrays.sort(array);

        // Reverse the array to make it descending
        reverseArray(array);

        // Print the array in descending order
        System.out.println("Array elements in descending order:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

}