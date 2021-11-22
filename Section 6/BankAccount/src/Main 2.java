public class Main {

    public static void main(String[] args) {
        BankAccount aBankAccount = new BankAccount();
//        aBankAccount.setAccountNumber("211010972");
//        aBankAccount.setBalance(20172.36);
//        aBankAccount.setCustomerName("Susan E Adams");
//        aBankAccount.setEmail("semadla@mac.com");
//        aBankAccount.setPhone("(210) 385-9491");
//        BankAccount aBankAccount = new BankAccount("211010972", 12345.67,
//                "Susan E Adams", "semadla0404@gmail.com",
//                "(210) 385-9491");
        System.out.println("AcctNum= " + aBankAccount.getAccountNumber());
        System.out.println("Balance= " + aBankAccount.getBalance());
        System.out.println("Name= " + aBankAccount.getCustomerName());
        System.out.println("Email= " + aBankAccount.getEmail());
        System.out.println("Phone= " + aBankAccount.getPhone());

        aBankAccount.depositFunds(3000.21);
        System.out.println("Balance= " + aBankAccount.getBalance());
        aBankAccount.withdrawFunds(300);
        System.out.println("Balance= " + aBankAccount.getBalance());

        aBankAccount.setBalance(300);
        System.out.println("Balance= " + aBankAccount.getBalance());
        aBankAccount.withdrawFunds(301);
        System.out.println("Balance= " + aBankAccount.getBalance());
        aBankAccount.withdrawFunds(300);
        System.out.println("Balance= " + aBankAccount.getBalance());

        BankAccount myAcct = new BankAccount("Jeff", "jeff@gmail.com", "123-123-1234");
        System.out.println(myAcct.getAccountNumber() + " name: " + myAcct.getCustomerName());
    }
}
