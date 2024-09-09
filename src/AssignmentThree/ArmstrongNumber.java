package AssignmentThree;

import static AssignmentThree.Utilities.ArmstrongUtil.countDigits;
import static AssignmentThree.Utilities.utils.InputNumber;
import static AssignmentThree.Utilities.ArmstrongUtil.isArmstrongNumber;

public class ArmstrongNumber {

    public static void main(String[] args) {
        int number = InputNumber();

        // Get the number of digits
        int numDigits = countDigits(number);

        // Print the result with the number of digits
        if (isArmstrongNumber(number)) {
            System.out.println("number of Digits :" + numDigits);
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println("number of Digits :" + numDigits);
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
