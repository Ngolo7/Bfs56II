import java.util.Arrays;
import java.util.Scanner;

public class KSmallestElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        // Read the array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Read the value of k
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        // Check for valid k
        if (k <= 0 || k > n) {
            System.out.println("Invalid value of k. It should be between 1 and " + n);
            return;
        }

        // Find and print the k smallest elements
        int[] smallestElements = findKSmallestElements(array, k);
        System.out.println("The " + k + " smallest elements:");
        System.out.println(Arrays.toString(smallestElements));
    }

    public static int[] findKSmallestElements(int[] array, int k) {
        // Sort the array in ascending order
        Arrays.sort(array);
        System.out.println("The sorted array:"+Arrays.toString(array));
        // Take the first k elements
        return Arrays.copyOfRange(array, 0, k);
    }

}
