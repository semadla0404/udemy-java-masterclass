import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> branchCustomers;

    public Branch(String name) {
        this.name = name;
        this.branchCustomers = new ArrayList<Customer>();
    }

    public boolean addNewCustomer(String customerName, double initialTransaction) {
        Customer customer = findCustomer(customerName);
        if(customer == null) {
            customer = new Customer(customerName, initialTransaction);
            this.branchCustomers.add(customer);
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer customer = findCustomer(customerName);
        if(customer != null) {
            customer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for(int i=0; i < this.branchCustomers.size(); i++) {
            Customer customer = this.branchCustomers.get(i);
            if(customer.getCustomerName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getBranchCustomers() {
        return branchCustomers;
    }
}
