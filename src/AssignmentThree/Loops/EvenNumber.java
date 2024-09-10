package AssignmentThree.Loops;
import static AssignmentThree.Utilities.utils.InputNumber;
public class EvenNumber
{
public static void main (String[] args){
    int num = InputNumber();
    EvenNumber(num);
}


public static void EvenNumber(int num){
    System.out.println("Even Number from 1 to" + num+ ":");
    for(int i = 1; i <= num; i++){
        if(i % 2 == 0){
            System.out.print(i + ", ");
        }
    }

}
}
