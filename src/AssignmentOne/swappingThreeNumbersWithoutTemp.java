package AssignmentOne;

public class swappingThreeNumbersWithoutTemp {
    public static void main(String[] args) {
        swappingThreeNumbersWithoutTemps(11, 23, 43);
    }

    public static void swappingThreeNumbersWithoutTemps(int a, int b, int c) {
        System.out.println("Value of A:" + a);
        System.out.println("Value of B:" + b);
        System.out.println("Value of C:" + c);
        System.out.println("------------------------");

        c = a + b + c;
        b = c - (b + a);
        a = c - (b + a);
        c = c - (b + a);

        System.out.println("Value of A:" + a);
        System.out.println("Value of B:" + b);
        System.out.println("Value of C:" + c);
        System.out.println("------------------------");


    }
}
