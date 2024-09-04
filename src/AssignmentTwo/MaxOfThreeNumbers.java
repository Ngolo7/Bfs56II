package AssignmentTwo;

public class MaxOfThreeNumbers {
    public  static  void main(String[] args){
        int num1 = 34;
        int num2 = 14;
        int num3 = 56;
        if(num1>num2 && num1>num3){
            System.out.println("Maximum number is :" +num1);
        }
        else if(num2>num1 && num2>num3){
            System.out.println("Maximum number is :" +num2);

        }
        else
            System.out.println("Maximum number is :" +num3);
    }
}
