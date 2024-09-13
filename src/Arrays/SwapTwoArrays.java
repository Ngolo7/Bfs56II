package Arrays;
import java.util.Arrays;
import java.util.Scanner;

import static Arrays.Utilities.ArraysUtils.*;
public class SwapTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        System.out.println("Enter the first array: ");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the second array: ");
        for(int i = 0; i< size; i++) {
            arr2[i] = sc.nextInt();
        }


        //Arrays before swaping
        System.out.println("Before Swap:");
        System.out.println("Array1: " + Arrays.toString(arr1));
        System.out.println("Array2: " + Arrays.toString(arr2));

         for(int i = 0; i< size; i++) {
             int temp = arr1[i];
             arr1[i] = arr2[i];
             arr2[i] = temp;
         }

        // Display arrays after swap
        System.out.println("After Swap:");
        System.out.println("Array1: " + Arrays.toString(arr1));
        System.out.println("Array2: " + Arrays.toString(arr2));


        }
    }



