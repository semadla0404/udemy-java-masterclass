public class Main {

    private static Bank myBank = new Bank("Frost Bank");

    public static void main(String[] args) {

        if(myBank.addBranch("Stone Oak")) {
            System.out.println("Branch created.");
        }

        if(myBank.addBranch("Helotes")) {
            System.out.println("Branch created.");
        }

        myBank.addCustomer("Stone Oak", "Susan Adams", 1200.12);
        myBank.addCustomer("Stone Oak", "Jeff Adams", 2322.11);
        myBank.addCustomer("Stone Oak", "Faith Adams", 200.22);
        myBank.addCustomer("Stone Oak", "Alysse Adams", 322.75);

        myBank.addCustomer("Helotes", "Magda Madla", 3857.99);
        myBank.addCustomer("Helotes", "Linda Massey", 3484.35);

        myBank.addCustomerTransaction("Stone Oak", "Susan Adams", 45.99);
        myBank.addCustomerTransaction("Stone Oak", "Susan Adams", 123.66);
        myBank.addCustomerTransaction("Stone Oak", "Jeff Adams", 195.96);
        myBank.addCustomerTransaction("Stone Oak", "Jeff Adams", 145.99);

        myBank.addCustomerTransaction("Helotes", "Magda Madla", 45.99);
        myBank.addCustomerTransaction("Helotes", "Magda Madla", 123.66);
        myBank.addCustomerTransaction("Helotes", "Linda Massey", 195.96);
        myBank.addCustomerTransaction("Helotes", "Linda Massey", 145.99);

        myBank.listCustomers("Stone Oak", true);
        myBank.listCustomers("Helotes", false);


        // Checking some negative test cases
        // 1.  Adding a branch that already exists
        if(myBank.addBranch("Stone Oak") == false) {
            System.out.println("This branch already exists.  Did not create.");
        }

        // 2.  Adding a customer that already exists at the branch
        if(myBank.addCustomer("Stone Oak", "Alysse Adams", 123.12) == false) {
            System.out.println("This customer already exists at this branch.  Did not create.");
        }

        if(myBank.addCustomerTransaction("Stone Oak", "Scrappy-Doo", 222.22) == false) {
            System.out.println("This customer does not exist at this branch.  Did not add transaction.");
        }

        System.out.println("Ending...");
    }
}
