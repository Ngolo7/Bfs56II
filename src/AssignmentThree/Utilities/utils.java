package AssignmentThree.Utilities;

import java.util.Scanner;

public class utils {

    private static Scanner sc = new Scanner(System.in);

    public static int InputNumber() {
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        sc.close();
        return number;
    }

    }

