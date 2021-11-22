public class Hamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private double price;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

//    public double getPrice() {
//        return price;
//    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }
    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }
    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }
    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        System.out.println(this.name + " burger on a " + this.breadRollType + " bun, with " + this.meat + " for $" + this.price);
        double totalPrice = this.price;
        if(this.addition1Name != null) {
            System.out.println("Adding " + this.addition1Name + ": $" + this.addition1Price);
            totalPrice += this.addition1Price;
        }
        if(this.addition2Name != null) {
            System.out.println("Adding " + this.addition2Name + ": $" + this.addition2Price);
            totalPrice += this.addition2Price;
        }
        if(this.addition3Name != null) {
            System.out.println("Adding " + this.addition3Name + ": $" + this.addition3Price);
            totalPrice += this.addition3Price;
        }
        if(this.addition4Name != null) {
            System.out.println("Adding " + this.addition4Name + ": $" + this.addition4Price);
            totalPrice += this.addition4Price;
        }
        return totalPrice;
    }

//    public void getGrandTotal(double totalPrice) {
//        System.out.println("Grand Total: $" + totalPrice);
//    }

}