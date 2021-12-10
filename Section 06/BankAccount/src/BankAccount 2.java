public class BankAccount {
    // fields
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phone;

    // constructors
    public BankAccount() {
        // this line calls the constructor below that sets all the fields
        this("12345", 4321.11, "default name", "default@email.com", "210-222-2222");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double balance,
                       String customerName, String email, String phone) {
        System.out.println("Account constructor called with parameters");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
    }

    public BankAccount(String customerName, String email, String phone) {
        // this constructor has a couple of default values set (accountNumber, balance)
        this("99999", 100.55, customerName, email, phone);
    }

    // methods
    public void setAccountNumber(String acctNum) {
        this.accountNumber = acctNum;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }

    public double depositFunds(double depositAmt) {
        System.out.println("Processing deposit of $" + depositAmt + "...");
        double newBalance = this.balance += depositAmt;
        System.out.println("New Balance: " + newBalance);
        return newBalance;
    }

    public double withdrawFunds(double withdrawAmt) {
        if((this.balance - withdrawAmt) < 0) {
            System.out.println("Insufficient Funds");
            System.out.println("WITHDRAWAL DENIED");
            return -1.0;
        } else {
            System.out.println("Processing withdrawal of $" + withdrawAmt + "...");
            double newBalance = this.balance -= withdrawAmt;
            System.out.println("New Balance: " + newBalance);
            return newBalance;
        }
    }
}
