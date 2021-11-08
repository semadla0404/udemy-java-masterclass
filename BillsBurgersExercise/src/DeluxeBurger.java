public class DeluxeBurger extends Hamburger{
//    private double deluxeExtraPrice1;
//    private String deluxeExtraName2;
//    private String deluxeExtraName1;
//    private double deluxeExtraPrice2;

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("No extras allowed for Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("No extras allowed for Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("No extras allowed for Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("No extras allowed for Deluxe Burger");
    }

//    @Override
//    public double itemizeHamburger() {
//        double totalPrice = super.itemizeHamburger();
////        System.out.println("Adding " + this.deluxeExtraName1 + ": $" + this.deluxeExtraPrice1);
////        totalPrice += this.deluxeExtraPrice1;
////        System.out.println("Adding " + this.deluxeExtraName2 + ": $" + this.deluxeExtraPrice2);
////        totalPrice += this.deluxeExtraPrice2;
//        return totalPrice;
//    }
}
