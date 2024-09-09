package Restaurant;
import java.util.Scanner;

public class BriyaniDetails {


    int chickenBiryani_price = 150;
    int muttonBiryani_price = 160;
    int vegBiryani_price = 120;
    int biryani_total_bill = 0;

    Scanner sc = new Scanner(System.in);

    // Chicken Biryani Order Method
    public void orderChickenBiryani() {
        System.out.println("How many plates of Chicken Biryani do you want?");
        int plates = sc.nextInt();
        int chicken_biryani_bill = plates * chickenBiryani_price;
        biryani_total_bill += chicken_biryani_bill;
        System.out.println(plates + " plate(s) of Chicken Biryani: " + chicken_biryani_bill);
    }

    public void orderMuttonBiryani() {
        System.out.println("How many plates of Mutton Biryani do you want?");
        int plates = sc.nextInt();
        int mutton_biryani_bill = plates * muttonBiryani_price;
        biryani_total_bill += mutton_biryani_bill;
        System.out.println(plates + " plate(s) of Chicken Biryani: " + mutton_biryani_bill);
    }
    public void orderVegBiryani() {
        System.out.println("How many plates of Veg Biryani do you want?");
        int plates = sc.nextInt();
        int veg_biryani_bill = plates * vegBiryani_price;
        biryani_total_bill += veg_biryani_bill;
        System.out.println(plates + " plate(s) of Chicken Biryani: " + veg_biryani_bill);
    }
    // Show Total Bill Method for Biryani Orders
    public void showBill() {
        System.out.println("Total Bill for Biryani: " + biryani_total_bill);
    }

    // Display Menu for Biryani Orders
    public void displayMenu() {
        int choice;
        do {
            System.out.println("Biryani Section:");
            System.out.println("1) Chicken Biryani");
            System.out.println("2) Veg Biryani");
            System.out.println("3) Show Bill");
            System.out.println("4) Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    orderChickenBiryani();
                    break;
                case 2:
                    orderVegBiryani();
                    break;
                case 3:
                    showBill();
                    break;
                case 4:
                    System.out.println("Exiting Biryani Menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
}