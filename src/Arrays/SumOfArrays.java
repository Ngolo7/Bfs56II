package Arrays;
import static Arrays.Utilities.ArraysUtils.*;

public class SumOfArrays {
    public static void main(String[] args) {
        int [] array = inputArray();

        int sum = 0;
        for(int i = 0; i<array.length; i++){
             sum += array[i];
        }
        System.out.println("Sum of all elements:" +sum);
    }
}
