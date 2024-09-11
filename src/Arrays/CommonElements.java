package Arrays;

import java.util.Scanner;
public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first array
        System.out.println("Enter the size of the first array:");
        int n1 = sc.nextInt();
        int[] array1 = new int[n1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n1; i++) {
            array1[i] = sc.nextInt();
        }

        // Input second array
        System.out.println("Enter the size of the second array");
        int n2 = sc.nextInt();
        int[] array2 = new int[n2];
        System.out.println("Enter the elements of the second array");
        for (int i = 0; i < n2; i++) {
            array2[i] = sc.nextInt();
        }

        // Call the method to find common elements
        System.out.println("Common elements between the two arrays are:");
        FindCommonElements(array1, array2);

        sc.close();
    }

    // Method to find common elements between two arrays
    public static void FindCommonElements(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println(array1[i]);
                    break;
                }
            }
        }
    }
}
