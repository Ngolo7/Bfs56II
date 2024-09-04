package AssignmentOne;

public class swappingThreeNumbers {
    public static void main(String[] args) {
            swappingThreeNumber(13,20,51);
    }

    private static void swappingThreeNumber(int a, int b, int c) {
        System.out.println("Value of A:" + a);
        System.out.println("Value of B:" + b);
        System.out.println("Value of C:" + c);
        System.out.println("------------------------");

        int temp1 = a;
        a = c;
        c = temp1;

        int temp2 = a;
        a= b;
        b = temp2;

        System.out.println("Value of A:" + a);
        System.out.println("Value of B:" + b);
        System.out.println("Value of C:" + c);


    }
}
