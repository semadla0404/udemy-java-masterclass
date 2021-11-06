public class VipCustomer {
    // Fields
    private String name;
    private double creditLimit;
    private String email;

    // Constructors
    public VipCustomer() {
        this("default name", 11111.11, "three@email.com");
        System.out.println("Calling empty constructor.");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "two@email.com");
        System.out.println("Calling constructor with 2 parameters.");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        System.out.println("Calling main constructor.");
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    // Getter Methods
    public String getName() {
        return this.name;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmail() {
        return this.email;
    }
}
