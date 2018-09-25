package ArrayListChallenge09;

import java.util.Scanner;

public class main{

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("626 9484 0292")

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("Enter action : ");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Shutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                     addNewContact();
                    break;
                case 3:
                     updateContact();
                    break;
                case 4:
                     removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                     printActions();
                    break;

            }
        }
    }

    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact =    Contact.createContact(name,phone);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added: " + name + ", phone" + phone);
        }else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }


    private static void startPhone() {
        System.out.println("Starting phone...");

    }

    public static void printActions() {
        System.out.println("\nPress ");
        System.out.println("\t 0-shutfown");
        System.out.println("\t 1-print contact list ");
        System.out.println("\t 2-add contact ");
        System.out.println("\t 3-update contact ");
        System.out.println("\t 4-remove contact ");
        System.out.println("\t 5-query ");
        System.out.println("\t 6-print a list of avaliable actions ");
        System.out.println("Choce yout action");
    }
}
