package Arrays;
import java.util.Scanner;
import java.util.Arrays;
import static Arrays.Utilities.ArraysUtils.*;
public class SortArrayAscending {
    public static void main(String[] args) {
        int [] array = inputArray();


        Arrays.sort(array); // Sort the array in ascending order
        System.out.println("Array elements in ascending order:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
