package AssignmentThree.Src;
import java.util.Scanner;
import static AssignmentThree.Utilities.ArmstrongUtil.isArmstrongNumber;

public class ArmstrongNumbersBetweenRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the upper limit 'n'
        System.out.print("Enter the upper limit n:");
        int n = scanner.nextInt();

        // Print Armstrong numbers between 1 and n
        System.out.println("Armstrong numbers between 1 and " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (isArmstrongNumber(i)) {
                System.out.println(i);
            }
        }

        // Close the scanner
        scanner.close();
    }
}


