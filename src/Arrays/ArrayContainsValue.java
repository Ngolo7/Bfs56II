package Arrays;
import java.util.Scanner;

import static Arrays.Utilities.ArraysUtils.inputArray;

public class ArrayContainsValue {
    public static void main(String[] args) {
        int [] array = inputArray();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element/ value to be searched: ");
        int searchValue = sc.nextInt();

        boolean found = false;
        for(int i = 0 ; i < array.length ; i++) {
            if (array[i] == searchValue) {
                found = true;
                break;

            }
        }
            if(found){
                System.out.println("Array contains the value :" + searchValue);
            } else
                System.out.println("Array does not contain the value :" + searchValue);


        }

    }

