package AssignmentThree.Loops;

import static AssignmentThree.Utilities.utils.InputNumber;

public class PrintFactors {

    public static void main(String[] args) {
        int number = InputNumber();
        System.out.println("Factors of " + number + ":");

        // Loop to find and print all factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
