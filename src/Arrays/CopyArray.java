package Arrays;

import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] sourceArray = new int[size];
        int[] destinationArray = new int[size];

        System.out.println("Enter elements of the source array:");
        for (int i = 0; i < size; i++) {
            sourceArray[i] = scanner.nextInt();
        }

        // Copying elements from sourceArray to destinationArray
        for (int i = 0; i < size; i++) {
            destinationArray[i] = sourceArray[i];
        }

        System.out.println("Elements of the destination array:");
        for (int i = 0; i < size; i++) {
            System.out.print(destinationArray[i] + " ");
        }
    }
}
