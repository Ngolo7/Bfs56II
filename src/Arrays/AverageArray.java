package Arrays;

import static Arrays.Utilities.ArraysUtils.inputArray;

public class AverageArray {
    public static void main(String[] args) {

        // Getting the array input from the user
        int[] array = inputArray();

        // Calculating the sum of the array elements
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        // Calculating and printing the average
        double average = (double) sum / array.length;
        System.out.println("Average value: " + average);
    }
}
