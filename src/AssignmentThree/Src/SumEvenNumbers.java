package AssignmentThree.Src;

import static AssignmentThree.Utilities.utils.InputNumber;
import static AssignmentThree.Src.EvenNumber.EvenNumber;

public class SumEvenNumbers {
    public static void main(String[] args) {
        // Input the number
        int num = InputNumber();

        // Print even numbers
        EvenNumber(num);

        // Calculate and print the sum of even numbers
        sumEvenNumbers(num);
    }

    // Method to calculate and print sum of even numbers
    public static void sumEvenNumbers(int num) {
        int sum = 0;
        System.out.println("\nSum of even numbers between 1 to " + num + ":");
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
