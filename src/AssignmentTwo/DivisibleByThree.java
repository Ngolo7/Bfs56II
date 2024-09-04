package AssignmentTwo;

import java.util.Scanner;

public class DivisibleByThree
{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();

        if(a%3 == 0){
            System.out.println("The divisible number is: "+a);
        }
        else
        System.out.println("The number is not divisible by the three");
    }
}
