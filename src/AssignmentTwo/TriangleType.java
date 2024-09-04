import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter the three sides of the triangle: ");
                int side1 = scanner.nextInt();
                int side2 = scanner.nextInt();
                int side3 = scanner.nextInt();

                // Check if the input values form a valid triangle
                if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
                    throw new Exception("Sides must be positive integers.");
                }

                // Determine the type of triangle
                if (side1 == side2 && side2 == side3) {
                    System.out.println("Equilateral Triangle");
                } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                    System.out.println("Isosceles Triangle");
                } else {
                    System.out.println("Scalene Triangle");
                }

                validInput = true;  // Input is valid, exit the loop

            } catch (Exception e) {
                System.out.println("Invalid input! Please enter valid integers. " + e.getMessage());
                scanner.nextLine();  // Clear invalid input
            }
        }

        scanner.close();
    }
}
