import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone myMobilePhone = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;
        int selection = 0;
        startingPhone();
        printMenu();

        while(!quit) {
            System.out.println("Enter a selection: (0 to show available actions)");
            selection = scanner.nextInt();
            scanner.nextLine();

            switch (selection) {
                case 0:
                    printMenu();
                    break;
                case 1:
                    printContactList();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateExistingContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    quit = true;
                    System.out.println("Shutting down...");
                    break;
            }
        }
    }

    private static void startingPhone() {
        System.out.println("Phone initializing...");
    }

    private static void printMenu() {
        System.out.println("\nPress");
        System.out.println("\t0 - Print menu options.");
        System.out.println("\t1 - Print out contacts.");
        System.out.println("\t2 - Add new contact.");
        System.out.println("\t3 - Update existing contact.");
        System.out.println("\t4 - Remove contact.");
        System.out.println("\t5 - Search contact.");
        System.out.println("\t6 - Quit.");
    }

    private static void printContactList() {
        myMobilePhone.printContactList();
    }

    private static void addNewContact() {
        System.out.println("Enter name of new contact: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);

        if(myMobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added:\n\tName: " +
                    name + "\n\tPhone: " + phone);
        } else {
            System.out.println("Cannot add, " + name + " already on file.");
        }
    }

    private static void updateExistingContact() {
        System.out.println("Enter name of contact you want to update: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = myMobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new phone number:");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if(myMobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated record.");
        } else {
            System.out.println("Error updating record.");
        }
    }

    private static void removeContact() {
        System.out.println("Enter name of contact you want to update: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = myMobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        if (myMobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted.");
        } else {
            System.out.println("Error deleting record.");
        }
    }

    private static void searchContact() {
        System.out.println("Enter name of contact you want to search: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = myMobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("\tName: " + existingContactRecord.getName() + "\n\tPhone: " + existingContactRecord.getPhone());
    }
}
