public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("healthy", meat, price, "brown rye");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }
    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger();
//        double totalPrice = super.getPrice();
        if(this.healthyExtra1Name != null) {
            System.out.println("Adding " + this.healthyExtra1Name + ": $" + this.healthyExtra1Price);
            totalPrice += this.healthyExtra1Price;
        }
        if(this.healthyExtra2Name != null) {
            System.out.println("Adding " + this.healthyExtra2Name + ": $" + this.healthyExtra2Price);
            totalPrice += this.healthyExtra2Price;
        }
        return totalPrice;
    }
}