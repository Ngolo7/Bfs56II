package Arrays;
import static Arrays.Utilities.ArraysUtils.*;

public class ReverseArray {
    public static void main(String[] args) {

        int [] array = inputArray();


        // Print the array elements in reverse order
        System.out.println("The elements of the array in reverse order are:");
        for (int i = array.length -1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
