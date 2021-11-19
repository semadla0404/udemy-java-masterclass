public class Contact {
    // Properties
    private String name;
    private String phone;

    // Constructor
    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

   //Factory Method - need to look this up as to what this design pattern does
    public static Contact createContact(String name, String phone) {
        return new Contact(name, phone);
    }
}
