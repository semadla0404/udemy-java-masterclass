public class Room {
    private Sofa sofa;
    private CoffeeTable coffeeTable;
    private Lamp lamp;
    private Size size;

    public Room(Sofa sofa, CoffeeTable coffeeTable, Lamp lamp) {
        this.sofa = sofa;
        this.coffeeTable = coffeeTable;
        this.lamp = lamp;
        this.size = new Size(20, 20, 13);
    }

    public void turnLightsOnOff() {
        lamp.lightsCommand();
    }

    public Size getSize() {
        return size;
    }
}
