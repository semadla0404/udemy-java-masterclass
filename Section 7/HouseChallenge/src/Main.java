public class Main {
    public static void main(String[] args) {

        Size sofaSize = new Size(10, 4, 4);
        Size tableSize = new Size(2, 2, 2);

        Sofa sofa = new Sofa("leather", "blue", sofaSize);
        CoffeeTable table = new CoffeeTable("wood", "walnut", tableSize);
        Lamp lamp = new Lamp(false);
        Room room = new Room(sofa, table, lamp);

        System.out.println("roomSize= " + room.getSize().getLength() + " x " + room.getSize().getWidth() + " x " + room.getSize().getHeight());
        System.out.println("LampOn?: " + lamp.isOn());
        room.turnLightsOnOff();
        System.out.println("LampOn?: " + lamp.isOn());
        room.turnLightsOnOff();
        System.out.println("LampOn?: " + lamp.isOn());

        System.out.println("sofaSize= " + sofa.getSize().getLength() + " x " + sofa.getSize().getWidth() + " x " + sofa.getSize().getHeight());

    }
}
