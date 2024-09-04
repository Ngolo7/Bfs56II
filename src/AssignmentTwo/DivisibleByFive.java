package AssignmentTwo;

import java.util.Scanner;

public class DivisibleByFive {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();

        if(a % 5 == 0){
            System.out.println("The number" + " " + a + " " + "is divisible by five");
        }
        else
            System.out.println("The number" + " " + a + " " + "is not divisible by five");
    }
}
