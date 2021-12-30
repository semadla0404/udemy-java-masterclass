public class Burger {
    private String name;
    private String bread;
    private String meat;
    private double price;

    private String extraName1;
    private double extraPrice1;
    private String extraName2;
    private double extraPrice2;
    private String extraName3;
    private double extraPrice3;
    private String extraName4;
    private double extraPrice4;

    public Burger(String name, String bread, String meat, double price) {
        this.name = name;
        this.bread = bread;
        this.meat = meat;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void addExtra1(String name, double price) {
        this.extraName1 = name;
        this.extraPrice1 = price;
    }
    public void addExtra2(String name, double price) {
        this.extraName2 = name;
        this.extraPrice2 = price;
    }
    public void addExtra3(String name, double price) {
        this.extraName3 = name;
        this.extraPrice3 = price;
    }
    public void addExtra4(String name, double price) {
        this.extraName4 = name;
        this.extraPrice4 = price;
    }

    public double itemizeBurger() {
        System.out.println(this.name + " burger on a " + this.bread + " bun, with " + this.meat + " for $" + this.price);
        double totalPrice = this.price;
        if(this.extraName1 != null) {
            System.out.println("Adding " + this.extraName1 + ": $" + this.extraPrice1);
            totalPrice += this.extraPrice1;
        }
        if(this.extraName2 != null) {
            System.out.println("Adding " + this.extraName2 + ": $" + this.extraPrice2);
            totalPrice += this.extraPrice2;
        }
        if(this.extraName3 != null) {
            System.out.println("Adding " + this.extraName3 + ": $" + this.extraPrice3);
            totalPrice += this.extraPrice3;
        }
        if(this.extraName4 != null) {
            System.out.println("Adding " + this.extraName4 + ": $" + this.extraPrice4);
            totalPrice += this.extraPrice4;
        }
        return totalPrice;
    }

    public void getGrandTotal(double totalPrice) {
        System.out.println("Grand Total: $" + totalPrice);
    }

}