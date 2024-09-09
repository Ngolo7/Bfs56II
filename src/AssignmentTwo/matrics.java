package AssignmentTwo;

public class matrics {

    public static void main(String[] args) {

        // Outer loop: control the rows
        for (int i = 1; i <= 5; i++) {


            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
