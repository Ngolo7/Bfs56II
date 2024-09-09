package Restaurant;// DrinksDetails.java
import java.util.Scanner;

public class DrinksDetails {
    // Prices for drinks
    int coffee_price = 30;
    int tea_price = 20;
    int juice_price = 50;
    int drinks_total_bill = 0;

    // Scanner object for input
    Scanner sc = new Scanner(System.in);

    // Coffee Order Method
    public void orderCoffee() {
        System.out.println("How many cups of Coffee do you want?");
        int cups = sc.nextInt();
        int coffee_bill = cups * coffee_price;
        drinks_total_bill += coffee_bill;
        System.out.println(" Tea cup: " + "$" + (coffee_price));
        System.out.println(cups + " cup(s) of Tea: per cup: " + "$" + (coffee_bill));
    }
    // Tea Order Method
    public void orderTea() {
        System.out.println("How many cups of Tea do you want?");
        int cups = sc.nextInt();
        int tea_bill = cups * tea_price;
        drinks_total_bill += tea_bill;
        System.out.println(" Tea cup: "+ "$" +(tea_price));
        System.out.println(cups + " cup(s) of Tea: per cup: "+ "$" +(tea_bill));
    }

    // Juice Order Method
    public void orderJuice() {
        System.out.println("How many glasses of Juice do you want?");
        int glasses = sc.nextInt();
        int juice_bill = glasses * juice_price;
        drinks_total_bill += juice_bill;
            System.out.println(" Juice per glass: "+ "$" +(juice_price));
            System.out.println(glasses + " glass(es) of Juice: "+ "$" +(juice_bill));
    }

    // Show Total Bill for Drinks
    public void showBill() {
        System.out.println("Total Bill for Drinks: " + drinks_total_bill);
    }

    // Display Menu for Drinks
    public void displayMenu() {
        int choice;
        do {
            System.out.println("\nDrinks Menu:");
            System.out.println("1) Coffee");
            System.out.println("2) Tea");
            System.out.println("3) Juice");
            System.out.println("4) Show Bill");
            System.out.println("5) Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    orderCoffee();
                    break;
                case 2:
                    orderTea();
                    break;
                case 3:
                    orderJuice();
                    break;
                case 4:
                    showBill();
                    break;
                case 5:
                    System.out.println("Exiting Drinks Menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }
}
