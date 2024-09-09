package AssignmentThree.Src;

public class PrintUppercaseAlphabets {

    public static void main(String[] args) {
        System.out.println("Uppercase alphabets from 'A' to 'Z':");

        // Loop through ASCII values of 'A' to 'Z'
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
