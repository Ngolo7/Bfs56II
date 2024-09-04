package AssignmentTwo;

import java.util.Scanner;

public class CheckIfAlphabet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        if (Character.isLetter(ch)) {
            System.out.println(ch + " is an Alphabate .");
        } else {
            System.out.println(ch + " is not an Alphabate .");
        }
    }

    }
