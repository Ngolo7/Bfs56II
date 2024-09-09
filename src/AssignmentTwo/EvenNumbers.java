package AssignmentTwo;

public class EvenNumbers {
    public static void main(String[] args) {
        int count = 0;

        // Loop through numbers from 2 to 100
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + "\t");
            count++;


            if (count % 5 == 0) {
                System.out.println();
            }
        }
    }
}