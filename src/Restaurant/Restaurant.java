package Restaurant;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BriyaniDetails Briyani = new BriyaniDetails();
        TiffinDetails Tiffin = new TiffinDetails();
       DrinksDetails Drinks = new DrinksDetails();

        Scanner menu = new Scanner(System.in);
        System.out.println("Welcome to the Restaurant Menu");
        System.out.println("Would you like to see the restaurant menu?");

        int choice;
        do {
            System.out.println("1. Briyani");
            System.out.println("2. Tiffin ");
            System.out.println("3. Drinks ");
            System.out.println("4. exit");
            System.out.println("5. Enter your choice");
            choice = menu.nextInt();

            switch (choice) {
                case 1:
                    Briyani.displayMenu();
                    break;
//                case 2:
//                    Tiffin.displayMenu();
//                    break;
                case 3:
                    Drinks.displayMenu();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.Please try again");
            }


        }
        while (choice != 3) ;
        sc.close();

    }
}

