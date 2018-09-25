package ArrayList09;

import java.util.ArrayList;
import java.util.Scanner;

public class main{

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter yout choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0-choice option ");
        System.out.println("\t 1-print grocery list ");
        System.out.println("\t 2-add item ");
        System.out.println("\t 3-modify item ");
        System.out.println("\t 4-remove item ");
        System.out.println("\t 5-search item ");
        System.out.println("\t 6-process array list ");
        System.out.println("\t 7-quiz aplication");
    }

    public static void addItem() {
        System.out.println("add item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println(" modify item");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replecemet item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo - 1, newItem);
    }

    public static void removeItem() {
        System.out.println("Remove item ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem() {
        System.out.println("Search item ");
        String searchItem = scanner.nextLine();
        if (groceryList.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem);
        } else {
            System.out.println(searchItem + " is not found");
        }
    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}
