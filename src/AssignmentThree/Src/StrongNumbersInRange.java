package AssignmentThree.Src;

import static AssignmentThree.Utilities.utils.InputNumber;
import static AssignmentThree.Src.StrongNumber.isStrongNumber;

public class StrongNumbersInRange {

    public static void main(String[] args) {
        // Input the upper limit 'n' to find all strong numbers between 1 and n
        int n = InputNumber();

        // Print all strong numbers between 1 and n
        System.out.println("Strong numbers between 1 and " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (isStrongNumber(i)) {
                System.out.println(i + " is a Strong number.");
            }
        }
    }

}
