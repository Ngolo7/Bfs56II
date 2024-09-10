package AssignmentThree.Loops;

import static AssignmentThree.Utilities.utils.InputNumber;

public class SwapWithoutThirdVariable {

    public static void main(String[] args) {
        // Input two numbers from the user
        int a = InputNumber();
        int b = InputNumber();

        // Display before swapping
        System.out.println("Before Swap: a = " + a + ", b = " + b);

        // Swap the values without using a third variable in a for loop
        for (int i = 0; i < 1; i++) {
            a = a + b;  // Step 1: Add both values
            b = a - b;  // Step 2: Subtract the new value of a (a + b) from b to get the original value of a
            a = a - b;  // Step 3: Subtract the new value of b (which is the original a) from a (a + b) to get the original value of b
        }

        // Display after swapping
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}
