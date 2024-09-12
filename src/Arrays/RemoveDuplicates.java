package Arrays;
import java.util.Arrays;

import static Arrays.Utilities.ArraysUtils.*;
public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] array = inputArray();

        // Remove duplicates and print the result
        int[] resultArray = removeDuplicates(array);
        System.out.println("Array after removing duplicates: ");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + " ");
        }
    }

    // Method to remove duplicates from the array without using ArrayList
    public static int[] removeDuplicates(int[] array) {
        int n = array.length;

        if (n == 0 || n == 1) {
            return array;
        }
        Arrays.sort(array); //sorting the arrays

        // Create a new array to store unique elements
        int[] tempArray = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (array[i] != array[i + 1]) {
                tempArray[j++] = array[i];
            }
        }
        // Copy the last element since it hasn't been checked in the loop
        tempArray[j++] = array[n - 1];

        // Copy the unique elements to the final array
        int[] resultArray = new int[j];
        for (int i = 0; i < j; i++) {
            resultArray[i] = tempArray[i];
        }

        return resultArray;

    }
}

