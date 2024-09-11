package Arrays;
import static Arrays.Utilities.ArraysUtils.*;

public class DuplicateOfArrays {
    public static void main(String[] args) {
        int[] array = inputArray();

        // Loop to find duplicates
        for (int i = 0; i < array.length - 1; i++) {
            int count = 1;
            boolean isDuplicate = false;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    isDuplicate = true;
                }
            }
            // Check if this duplicate was already printed
            if (isDuplicate && !isAlreadyPrinted(array, array[i], i)) {
                System.out.println("Element " + array[i] + " is occurring " + count + " times");
            }
        }
    }

    // Helper method to check if an element has already been printed
    public static boolean isAlreadyPrinted(int[] array, int value, int currentIndex) {
        for (int k = 0; k < currentIndex; k++) {
            if (array[k] == value) {
                return true; // Element was found earlier, already printed
            }
        }
        return false; // Element was not found before, not printed yet
    }
}
