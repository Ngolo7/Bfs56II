package Arrays;

import java.util.Scanner;

import static Arrays.Utilities.ArraysUtils.inputArray;

public class IndexOfArrays {
    public static void main(String[] args) {
        int[] array = inputArray();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to find its index:");
        int value = sc.nextInt();
        int index = 0;
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                index = i;
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found");

        } else {
            System.out.println("the index of " + value + " is " + index);
        }
        sc.close();

    }

}
