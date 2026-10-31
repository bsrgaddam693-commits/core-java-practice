package logicalstatements;

import java.util.Scanner;

public class RestaurentManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String yn = "";
        double total_price = 0;

        do {
            System.out.println("\nEnter the Category:");
            System.out.println("starters / maincourse / breads / drinks / desserts");

            String category = sc.next();

            switch (category) {

            case "starters" -> {
                String syn = "";
                double starters_price = 0;

                do {
                    System.out.println("\nEnter Starter Item:");
                    System.out.println("soup / fries / manchuria / paneer / springroll");

                    String item = sc.next();

                    switch (item) {
                    case "soup" -> {
                        System.out.println("Tomato Soup = 80 Rs");
                        starters_price += 80;
                    }
                    case "fries" -> {
                        System.out.println("French Fries = 100 Rs");
                        starters_price += 100;
                    }
                    case "manchuria" -> {
                        System.out.println("Veg Manchuria = 120 Rs");
                        starters_price += 120;
                    }
                    case "paneer" -> {
                        System.out.println("Paneer Tikka = 180 Rs");
                        starters_price += 180;
                    }
                    case "springroll" -> {
                        System.out.println("Spring Rolls = 150 Rs");
                        starters_price += 150;
                    }
                    default -> System.out.println("Starter not available!");
                    }

                    System.out.println("Continue with Starters? Y/N");
                    syn = sc.next();

                } while (syn.equalsIgnoreCase("y"));

                System.out.println("Total Starters Price: " + starters_price);
                total_price += starters_price;
            }

            case "maincourse" -> {
                String myn = "";
                double maincourse_price = 0;

                do {
                    System.out.println("\nEnter Main Course Item:");
                    System.out.println("biryani / friedrice / noodles / meals / pizza");

                    String item = sc.next();

                    switch (item) {
                    case "biryani" -> {
                        System.out.println("Chicken Biryani = 250 Rs");
                        maincourse_price += 250;
                    }
                    case "friedrice" -> {
                        System.out.println("Fried Rice = 150 Rs");
                        maincourse_price += 150;
                    }
                    case "noodles" -> {
                        System.out.println("Veg Noodles = 130 Rs");
                        maincourse_price += 130;
                    }
                    case "meals" -> {
                        System.out.println("Veg Meals = 120 Rs");
                        maincourse_price += 120;
                    }
                    case "pizza" -> {
                        System.out.println("Pizza = 220 Rs");
                        maincourse_price += 220;
                    }
                    default -> System.out.println("Main Course Item not available!");
                    }

                    System.out.println("Continue with Main Course? Y/N");
                    myn = sc.next();

                } while (myn.equalsIgnoreCase("y"));

                System.out.println("Total Main Course Price: " + maincourse_price);
                total_price += maincourse_price;
            }

            case "breads" -> {
                String byn = "";
                double breads_price = 0;

                do {
                    System.out.println("\nEnter Bread Item:");
                    System.out.println("naan / roti / butternaan / paratha / kulcha");

                    String item = sc.next();

                    switch (item) {
                    case "naan" -> {
                        System.out.println("Plain Naan = 40 Rs");
                        breads_price += 40;
                    }
                    case "roti" -> {
                        System.out.println("Chapati/Roti = 20 Rs");
                        breads_price += 20;
                    }
                    case "butternaan" -> {
                        System.out.println("Butter Naan = 55 Rs");
                        breads_price += 55;
                    }
                    case "paratha" -> {
                        System.out.println("Paratha = 45 Rs");
                        breads_price += 45;
                    }
                    case "kulcha" -> {
                        System.out.println("Kulcha = 50 Rs");
                        breads_price += 50;
                    }
                    default -> System.out.println("Bread Item not available!");
                    }

                    System.out.println("Continue with Breads? Y/N");
                    byn = sc.next();

                } while (byn.equalsIgnoreCase("y"));

                System.out.println("Total Breads Price: " + breads_price);
                total_price += breads_price;
            }

            case "drinks" -> {
                String drn = "";
                double drinks_price = 0;

                do {
                    System.out.println("\nEnter Drink Item:");
                    System.out.println("water / coke / juice / coffee / tea");

                    String item = sc.next();

                    switch (item) {
                    case "water" -> {
                        System.out.println("Mineral Water = 20 Rs");
                        drinks_price += 20;
                    }
                    case "coke" -> {
                        System.out.println("Coke = 40 Rs");
                        drinks_price += 40;
                    }
                    case "juice" -> {
                        System.out.println("Fresh Juice = 80 Rs");
                        drinks_price += 80;
                    }
                    case "coffee" -> {
                        System.out.println("Coffee = 50 Rs");
                        drinks_price += 50;
                    }
                    case "tea" -> {
                        System.out.println("Tea = 20 Rs");
                        drinks_price += 20;
                    }
                    default -> System.out.println("Drink not available!");
                    }

                    System.out.println("Continue with Drinks? Y/N");
                    drn = sc.next();

                } while (drn.equalsIgnoreCase("y"));

                System.out.println("Total Drinks Price: " + drinks_price);
                total_price += drinks_price;
            }

            case "desserts" -> {
                String dyn = "";
                double desserts_price = 0;

                do {
                    System.out.println("\nEnter Dessert Item:");
                    System.out.println("icecream / gulabjamun / cake / brownie / pudding");

                    String item = sc.next();

                    switch (item) {
                    case "icecream" -> {
                        System.out.println("Ice Cream = 80 Rs");
                        desserts_price += 80;
                    }
                    case "gulabjamun" -> {
                        System.out.println("Gulab Jamun = 60 Rs");
                        desserts_price += 60;
                    }
                    case "cake" -> {
                        System.out.println("Chocolate Cake = 120 Rs");
                        desserts_price += 120;
                    }
                    case "brownie" -> {
                        System.out.println("Brownie = 100 Rs");
                        desserts_price += 100;
                    }
                    case "pudding" -> {
                        System.out.println("Pudding = 90 Rs");
                        desserts_price += 90;
                    }
                    default -> System.out.println("Dessert not available!");
                    }

                    System.out.println("Continue with Desserts? Y/N");
                    dyn = sc.next();

                } while (dyn.equalsIgnoreCase("y"));

                System.out.println("Total Desserts Price: " + desserts_price);
                total_price += desserts_price;
            }

            default -> System.out.println("Category not available!");
            }

            System.out.println("\nContinue with another Category? Y/N");
            yn = sc.next();

        } while (yn.equalsIgnoreCase("y"));

        System.out.println("\n========== FINAL RESTAURANT BILL ==========");
        System.out.println("Total Price: Rs " + total_price);
        System.out.println("Thank you! Visit Again!");

        sc.close();
    }
}