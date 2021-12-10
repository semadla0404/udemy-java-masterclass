import java.util.ArrayList;

public class MobilePhone {
    // Properties
    private ArrayList<Contact> myContacts;

   // Constructor
    public MobilePhone() {
        this.myContacts = new ArrayList<Contact>();
    }

    // Methods
    public void printContactList() {
        for(int i = 0; i < myContacts.size(); i++) {
            System.out.println((i+1) + ": " +
                    this.myContacts.get(i).getName() + " ==> " +
                    this.myContacts.get(i).getPhone());
        }
    }

    public boolean addNewContact(Contact contact) {
//        if(findContact(contact) >= 0) {  //This line does not work!
        if(findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0) {
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        } else if(findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name " + newContact.getName() +
                    " already exists. Update was not successful.");
            return false;
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if(foundPosition < 0) {
            System.out.println(contact.getName() + ", was not found.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + ", was deleted.");
        return true;
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for(int i=0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if(position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    public String queryContact(Contact contact) {
        if(findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

}