import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone myPhone = new MobilePhone("210-222-2222");

    public static void main(String[] args) {
        boolean quit = false;
        startingPhone();
        printMenu();

        while(!quit) {
            System.out.println("Enter an option: (0 to view menu options)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    printMenu();
                    break;
                case 1:
                    printContactList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    updateContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    quit = true;
                    shutDownPhone();
            }
        }
    }

    private static void startingPhone() {
        System.out.println("\nInitializing phone........");
    }

    private static void shutDownPhone() {
        System.out.println("\nShutting down.........");
    }

    private static void printMenu() {
        System.out.println("Options List:");
        System.out.println("\t0 - Print menu options");
        System.out.println("\t1 - Print contact list");
        System.out.println("\t2 - Add new contact");
        System.out.println("\t3 - Remove existing contact");
        System.out.println("\t4 - Update existing contact");
        System.out.println("\t5 - Search contacts");
        System.out.println("\t6 - To quit");
    }

    private static void printContactList() {
        myPhone.printContacts();
    }

    private static void addContact(){
        System.out.println("\nADD CONTACT");
        System.out.println("Enter contact name to add:");
        String name = scanner.nextLine();
        System.out.println("Enter contact phone number:");
        String phone = scanner.nextLine();

        Contact contact = Contact.createContact(name, phone);
        boolean retVal = myPhone.addNewContact(contact);
        if(retVal) {
            System.out.println("\tName: " + name + "\n\tPhone: " +
                    phone);
        } else {
            System.out.println(name + ", not added.");
        }
    }

    private static void removeContact() {
        System.out.println("\nREMOVE CONTACT");
        System.out.println("Enter contact name to remove:");
        String name = scanner.nextLine();
        System.out.println("Enter contact phone number:");
        String phone = scanner.nextLine();

        Contact contact = Contact.createContact(name, phone);

        Boolean retVal = myPhone.removeContact(contact);
        if(retVal) {
            System.out.println("\tName: " + name + "\n\tPhone: " + phone);
        } else {
            System.out.println(name + ", not removed.");
        }
    }

    private static void updateContact() {
        System.out.println("\nUPDATE CONTACT");
        System.out.println("Enter contact name to update:");
        String existingName = scanner.nextLine();
        System.out.println("Enter contact phone number:");
        String existingPhone = scanner.nextLine();

        System.out.println("Enter new contact name:");
        String newName = scanner.nextLine();
        System.out.println("Enter phone number:");
        String newPhone = scanner.nextLine();

        Contact existingContact = Contact.createContact(existingName, existingPhone);
        Contact newContact = Contact.createContact(newName, newPhone);

        Boolean retVal = myPhone.updateContact(existingContact, newContact);
        if(retVal) {
            System.out.println("Updated... ");
            System.out.println("\tName: " + existingName + "\n\tPhone: " + existingPhone);
            System.out.println("With... ");
            System.out.println("\tName: " + newName + "\n\tPhone: " + newPhone);
        } else {
            System.out.println(existingName + ", not updated.");
        }
    }

    private static void searchContact(){
        System.out.println("\nSEARCH CONTACT");
        System.out.println("Enter contact name to search for:");
        String name = scanner.nextLine();

        Contact retContact = myPhone.queryContact(name);
        if(retContact != null) {
            System.out.println("\tName: " + retContact.getName() + "\n\tPhone: " + retContact.getPhoneNumber());
        } else {
            System.out.println(name + ", not found.");
        }
    }
}
