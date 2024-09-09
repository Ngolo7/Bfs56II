package AssignmentThree.Src;

import static AssignmentThree.Utilities.utils.InputNumber;

public class naturalNumber {
    public static void main(String[] args) {
        int num = InputNumber();
        naturalNumber1toN(num);
    }
    private static void naturalNumber1toN(int num){
        System.out.println("The natural number from 1 to " + num + ":");
        for(int i = 1; i<= num; i ++){
            System.out.println(i);
        }
    }
}
