package AssignmentThree.Loops;

import static AssignmentThree.Utilities.utils.InputNumber;
public class MultiplicationOfNumber {

    public static void main(String[] args) {

        int num = InputNumber();
        MultiplicationOfNumber(num);
    }
    public static void MultiplicationOfNumber(int num) {
        System.out.println("Multiplication Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + " x " + i + " = " + result);
        }
    }
}
