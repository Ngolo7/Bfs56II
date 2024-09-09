package AssignmentThree.Src;

public class PrintASCII {

    public static void main(String[] args) {
        System.out.println("ASCII characters with their values:");

        // Loop to print ASCII values and corresponding characters from 0 to 127
        for (int i = 0; i <= 127; i++) {
            System.out.println("ASCII value of " + (char) i + " = " + i);
        }
    }
}
