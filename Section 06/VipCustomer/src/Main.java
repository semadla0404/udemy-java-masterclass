public class Main {
    public static void main(String[] args) {

        System.out.println("DEFAULT");
        VipCustomer defaultVip = new VipCustomer();
        System.out.println(defaultVip.getName());
        System.out.println(defaultVip.getCreditLimit());
        System.out.println(defaultVip.getEmail());
        System.out.println("******");
        System.out.println("JEFF");
        VipCustomer jeffVip = new VipCustomer("Jeff", 12000);
        System.out.println(jeffVip.getName());
        System.out.println(jeffVip.getCreditLimit());
        System.out.println(jeffVip.getEmail());
        System.out.println("******");
        System.out.println("SUSAN");
        VipCustomer sisVip = new VipCustomer("Susan", 49000, "sis@email.com");
        System.out.println(sisVip.getName());
        System.out.println(sisVip.getCreditLimit());
        System.out.println(sisVip.getEmail());
        System.out.println("******");
    }
}
