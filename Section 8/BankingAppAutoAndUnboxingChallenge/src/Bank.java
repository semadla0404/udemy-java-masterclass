import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        Branch branch = findBranch(branchName);
        if(branch == null) {
            branch = new Branch(branchName);
            this.branches.add(branch);
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.addNewCustomer(customerName, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        // traverse the list of branches to find the name
        for(int i=0; i < branches.size(); i++) {
            Branch branch = this.branches.get(i);
            if(branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

    public Boolean printCustomerList(String branchName, boolean printTransactions) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            System.out.println("Printing Customer list for branch: " + branchName);
            // get the customer array list to traverse
            ArrayList<Customer> customers = branch.getBranchCustomers();
            for(int i=0; i < customers.size(); i++) {
                // get the customer to print out
                Customer branchCustomer = customers.get(i);
                System.out.println((i+1) + ": " + branchCustomer.getCustomerName());

                if(printTransactions) {
                    // get the transaction array list to traverse
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    System.out.println("\tTransactions:");
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("\t\t" + transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }

}
