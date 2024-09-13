package Arrays;
import java.util.Scanner;
import static Arrays.Utilities.ArraysUtils.*;

public class OddPositionElements {
    public static void main(String[] args) {
        int [] array = inputArray();


        System.out.println("Elements at even positions (indexing starts from 1):");
        for (int i = 0; i < array.length; i += 2) { // Even position, i.e., 1st, 3rd, etc.
            System.out.print(array[i] + " ");
        }
    }
}
