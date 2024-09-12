package Arrays;
import java.util.Arrays;
import static Arrays.Utilities.ArraysUtils.*;

public class SecondSmallestElement {
    public static void main(String[] args) {
        int[] arr = inputArray();

        try {
            int secondSmallest = findSecondSmallest(arr);
            System.out.println("The second smallest number in the array is: " + secondSmallest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int findSecondSmallest(int[] arr) {
        if (arr == null || arr.length < 2) {
           System.out.println("Array must contain at least two elements.");
        }

        // Sort the array in ascending order
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Find the second smallest element, which is the first element that is different from the smallest
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != smallest) {
                return arr[i];  // Return the first element that is greater than the smallest
            }
        }

        // If no second smallest element is found (all elements are the same)
        throw new IllegalArgumentException("No second smallest element found.");
    }
}
