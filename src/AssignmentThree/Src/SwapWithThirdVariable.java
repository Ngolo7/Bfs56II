package AssignmentThree.Src;

import static AssignmentThree.Utilities.utils.InputNumber;

public class SwapWithThirdVariable {

    public static void main(String[] args) {
        // Input two numbers from the user
        int a = InputNumber();
        int b = InputNumber();

        // Display before swapping
        System.out.println("Before Swap: a = " + a + ", b = " + b);

        // Swap the values using a third variable and a for loop
        for (int i = 0; i < 1; i++) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Display after swapping
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}
