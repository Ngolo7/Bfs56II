package AssignmentThree.Src;

import static AssignmentThree.Utilities.utils.InputNumber;
import static AssignmentThree.Src.PerfectNumber.isPerfectNumber;
public class PerfectNumbersInRange {

    public static void main(String[] args) {
        int n = InputNumber();

        // Print all perfect numbers between 1 and n
        System.out.println("Perfect numbers between 1 and " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (isPerfectNumber(i)) {
                System.out.println(i + " is a Perfect number.");
            }
        }
    }
}
