package Arrays;
import static Arrays.Utilities.ArraysUtils.*;
public class ArrayReversal {
    public static void main(String[] args) {
        int [] array = inputArray();


        // Reverse the array
        reverseArray(array);

        // Output the reversed array
        System.out.println("Reversed array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
