package Arrays;

import java.util.Scanner;

public class FrequencyOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        boolean[] visited = new boolean[size];  // Boolean array to mark counted elements

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            visited[i] = false;  // Initialize visited array to false for all elements
        }

        // Calculate the frequency of each element
        for (int i = 0; i < size; i++) {
            if (visited[i]) {
                // If the element is already visited, skip counting
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
                    count++;  // Increment count if a duplicate is found
                    visited[j] = true;  // Mark the duplicate as visited
                }
            }

            System.out.println(array[i] + " occurs " + count + " time(s)");
        }
    }
}
