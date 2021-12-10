import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone (String number) {
        this.myNumber = number;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) >= 0) {
//            System.out.println("=== " + contact.getName() + " is already on file ===");
            return false;
        }
        this.myContacts.add(contact);
//        System.out.println("Successfully added contact.");
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int indexForOldContact = findContact(oldContact.getName());
        int indexForNewContact = findContact(newContact.getName());
        if(indexForOldContact == -1) {
//            System.out.println("=== Contact not found ===");
            return false;
        } else if (indexForNewContact >= 0) {
//            System.out.println("=== New contact already exists ===");
            return false;
        }
        this.myContacts.remove(indexForOldContact);
        this.myContacts.add(newContact);
//        System.out.println("Successfully updated contact.");
        return true;
    }

    public boolean removeContact(Contact contact) {
        int index = findContact(contact.getName());
        if(index == -1) {
//            System.out.println("=== Contact not found ===");
            return false;
        }
        this.myContacts.remove(index);
//        System.out.println("Successfully removed contact.");
        return true;
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        for(int i=0; i < this.myContacts.size(); i++) {
            if(this.myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int index = findContact(name);
        if(index == -1) {
//            System.out.println("=== Contact not found ===");
            return null;
        }
        Contact contact = myContacts.get(index);
//        System.out.println("Successfully found the contact.");
        return contact;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for(int i=0; i < this.myContacts.size(); i++) {
            System.out.println((i+1) + ". " + this.myContacts.get(i).getName() +
                    " -> " + this.myContacts.get(i).getPhoneNumber());
        }
    }
}
