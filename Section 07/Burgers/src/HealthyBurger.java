public class HealthyBurger extends Burger {
    private String extraName5;
    private double extraPrice5;
    private String extraName6;
    private double extraPrice6;

    public HealthyBurger(String meat, double price) {
        super("healthy", "brown rye", meat, price);
    }

    public void addExtra5(String name, double price) {
        this.extraName5 = name;
        this.extraPrice5 = price;
    }
    public void addExtra6(String name, double price) {
        this.extraName6 = name;
        this.extraPrice6 = price;
    }

    @Override
    public double itemizeBurger() {
        double totalPrice = super.itemizeBurger();
//        double totalPrice = super.getPrice();
        if(this.extraName5 != null) {
            System.out.println("Adding " + this.extraName5 + ": $" + this.extraPrice5);
            totalPrice += this.extraPrice5;
        }
        if(this.extraName6 != null) {
            System.out.println("Adding " + this.extraName6 + ": $" + this.extraPrice6);
            totalPrice += this.extraPrice6;
        }
        return totalPrice;
    }
}