public class DeluxeBurger extends Burger {
    private String deluxeExtraName1;
    private double deluxeExtraPrice1;
    private String deluxeExtraName2;
    private double deluxeExtraPrice2;

    public DeluxeBurger(String bread, String meat, double price) {
        super("deluxe", bread, meat, price);
        this.deluxeExtraName1 = "chips";
        this.deluxeExtraPrice1 = 0.75;
        this.deluxeExtraName2 = "drink";
        this.deluxeExtraPrice2 = 1.75;
    }

    @Override
    public void addExtra1(String name, double price) {
        System.out.println("No extras allowed for Deluxe Burger");
    }

    @Override
    public void addExtra2(String name, double price) {
        System.out.println("No extras allowed for Deluxe Burger");
    }

    @Override
    public void addExtra3(String name, double price) {
        System.out.println("No extras allowed for Deluxe Burger");
    }

    @Override
    public void addExtra4(String name, double price) {
        System.out.println("No extras allowed for Deluxe Burger");
    }

    @Override
    public double itemizeBurger() {
        double totalPrice = super.itemizeBurger();
        System.out.println("Adding " + this.deluxeExtraName1 + ": $" + this.deluxeExtraPrice1);
        totalPrice += this.deluxeExtraPrice1;
        System.out.println("Adding " + this.deluxeExtraName2 + ": $" + this.deluxeExtraPrice2);
        totalPrice += this.deluxeExtraPrice2;
        return totalPrice;
    }
}




// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.