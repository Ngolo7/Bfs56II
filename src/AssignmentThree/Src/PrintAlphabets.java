package AssignmentThree.Src;

public class PrintAlphabets {

    public static void main(String[] args) {
        System.out.println("Lowercase alphabets from 'a' to 'z':");

        // Loop through ASCII values of 'a' to 'z'
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
