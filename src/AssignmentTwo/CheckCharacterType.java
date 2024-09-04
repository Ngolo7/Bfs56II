import java.util.Scanner;

public class CheckCharacterType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit.");
        } else if (Character.isLetter(ch)) {
            System.out.println(ch + " is an alphabet.");
        } else {
            System.out.println(ch + " is a special character.");
        }

        scanner.close();
    }
}
