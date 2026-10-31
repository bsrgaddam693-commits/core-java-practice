package logicalstatements;

import java.util.Scanner;

public class FoodOrdering {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        int quantity;
        int price = 0;
        int total_bill;

        String item = "";
        do {

        System.out.println("===== FOOD ORDERING SYSTEM =====");
        System.out.println("1. Pizza   - Rs.200");
        System.out.println("2. Burger  - Rs.120");
        System.out.println("3. Biryani - Rs.180");
        System.out.println("4. Noodles - Rs.100");

        System.out.println("Enter your choice:");
        choice = sc.nextInt();

        switch (choice) {

            case 1:
                item = "Pizza";
                price = 200;
                break;

            case 2:
                item = "Burger";
                price = 120;
                break;

            case 3:
                item = "Biryani";
                price = 180;
                break;

            case 4:
                item = "Noodles";
                price = 100;
                break;

            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        System.out.println("Enter quantity:");
        quantity = sc.nextInt();

        if (quantity <= 0) {
            System.out.println("Invalid quantity!");
            sc.close();
            return;
        }

        total_bill = price * quantity;

        System.out.println("\n===== BILL DETAILS =====");
        System.out.println("Selected Item : " + item);
        System.out.println("Price         : Rs." + price);
        System.out.println("Quantity      : " + quantity);
        System.out.println("Total Bill    : Rs." + total_bill);
        }
        while(choice!=5);

        sc.close();
    }
}