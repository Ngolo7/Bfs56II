package AssignmentThree.Src;

import static AssignmentThree.Utilities.utils.Number;

public class DigitFrequency {

    public static void main(String[] args) {
        long number = Number();  // Use long instead of int
        int[] frequency = new int[10]; // Array to store digit frequency

        // Loop to calculate the frequency of each digit
        for (long n = number; n != 0; n /= 10) {
            int digit = (int)(n % 10);  // Cast to int for the array index
            frequency[digit]++;
        }

        // Print the frequency of each digit
        System.out.println("Digit frequency for " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times.");
            }
        }
    }
}
