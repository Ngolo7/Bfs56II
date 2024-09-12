package Arrays;

import java.util.Arrays;
import static Arrays.Utilities.ArraysUtils.*;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] array = inputArray();

        int secondLargest = FindsecondLargest(array);
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }

    public static int FindsecondLargest(int[] array) {
        if (array.length < 2) {
            return Integer.MIN_VALUE;  // Not enough elements to find the second largest
        }

        // Sort the array in ascending order
        Arrays.sort(array);
System.out.println(Arrays.toString(array));
        // Find the second largest element, skipping duplicates
        for (int i = array.length - 2; i >= 0; i--) {
            if (array[i] != array[array.length - 1]) {
                return array[i];  // Return the second largest element
            }
        }

        return Integer.MIN_VALUE;
    }
}
