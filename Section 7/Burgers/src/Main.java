public class Main {
    public static void main(String[] args) {

        Burger classic = new Burger("classic", "seseme seed", "beef", 3.99);
        classic.addExtra1("cheese", 0.50);
        classic.addExtra2("bacon", 1.50);
        classic.getGrandTotal(classic.itemizeBurger());
        System.out.println("=========================");
        System.out.println();

        HealthyBurger healthy = new HealthyBurger("tofu", 5.99);
        healthy.addExtra1("cheese", 0.50);
        healthy.addExtra2("bacon", 1.50);
        healthy.addExtra3("onion", 0.50);
        healthy.addExtra4("tomato", 0.50);
        healthy.addExtra5("jalapeno", 0.75);
        healthy.addExtra6("pickle", 0.50);
        healthy.getGrandTotal(healthy.itemizeBurger());
        System.out.println("=========================");
        System.out.println();

        DeluxeBurger deluxe = new DeluxeBurger("wheat", "chicken", 4.99);
        deluxe.addExtra1("avocado", 2.00);
        deluxe.getGrandTotal(deluxe.itemizeBurger());
        System.out.println("=========================");
        System.out.println();
    }
}