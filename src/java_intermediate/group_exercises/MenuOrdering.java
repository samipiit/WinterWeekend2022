package java_intermediate.group_exercises;

import java.util.Scanner;

public class MenuOrdering {
    /*
    Build a menu-ordering program driven by user input to allow users to order food items off of a menu
    The program should allow the user to select items to order, and keep a tally of the total
    The total should be printed for the customer once they finish selecting their order
     */

    static MenuOrdering obj = new MenuOrdering();
    static Scanner stdin = new Scanner(System.in);
    static String welcomeMsg = "WELCOME TO BOB'S BURGERS! WHAT WOULD YOU LIKE TO ORDER?\n";
    static String menu = "\t1 - BURGERS\n\t2 - SIDES\n\t3 - DRINKS\n\n\n\tEnter \"quit\" to quit";
    static String burgerMenu = "1 - HAMBURGER ($5.50)\n2 - CHEESEBURGER ($6.25)\n3 - DOUBLE CHEESEBURGER ($7.50)\n" +
            "4 - CRISPY CHICKEN ($6.50)\n5 - SPICY CRISPY CHICKEN ($7.00)\n\nPlease make your selection: ";
    static String sidesMenu = "1 - SM FRENCH FRIES ($2.50)\n2 - LG FRENCH FRIES ($4.00)\n3 - ONION RINGS ($3.50)";
    static String drinksMenu = "1 - COCA-COLA ($1.50)\n2 - SNAPPLE ($2.00)\n3 - HOMEMADE SWEETENED ICED TEA ($2.50)";
    static double total;

    public static void main(String[] args) {
        String selection;
        total = 0;

        while (true) {
            selection = obj.getWelcomeMenuSelection();

            if (selection.equalsIgnoreCase("quit")) {
                break;
            }

            switch (selection) {
                case "1":
                    System.out.print(burgerMenu);
                    selection = stdin.next();

                    switch (selection) {
                        case "1":
                            total = total + 5.50d;
                            break;
                        case "2":
                            total = total + 6.25d;
                            break;
                        case "3":
                            total = total + 7.50d;
                            break;
                        case "4":
                            total = total + 6.50d;
                            break;
                        case "5":
                            total = total + 7.00d;
                            break;
                    }
                    obj.printTotal();
                    break;
                case "2":
                    System.out.print(sidesMenu);
                    break;
                case "3":
                    System.out.print(drinksMenu);
                    break;
                default:
                    System.out.println("INVALID ENTRY - Please come again");
            }

            break;
        }


        stdin.close();
    }

    String getWelcomeMenuSelection() {
        System.out.println(welcomeMsg);
        System.out.println(menu);
        System.out.print("\nPlease make your selection: ");

        return stdin.next();
    }

    void printTotal() {
        System.out.println("YOUR TOTAL IS: $" + total);
    }

}
