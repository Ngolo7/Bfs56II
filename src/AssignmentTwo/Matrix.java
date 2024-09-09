package AssignmentTwo;

public class Matrix {
    public static void main(String[] args) {

        // Outer loop: control the rows
        for (int i = 5; i >= 1; i--) {  // 5 rows, starting from 5 and decreasing to 1

            // Inner loop: print decreasing number of stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to the next line after printing stars
            System.out.println();
        }
    }
}
