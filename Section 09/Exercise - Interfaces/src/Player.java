import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon = "Sword";

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        // add() to an array list
        ArrayList<String> items = new ArrayList<>();
        items.add(0, this.name);
        items.add(1, Integer.toString(this.hitPoints));  // shortcut to convert int to String==> items.add(1, "" + this.strength);
        items.add(2, Integer.toString(this.strength));
        items.add(3, this.weapon);

        return items;
    }

    @Override
    public void read(List<String> items) {
        // get() items from array list
        if(items != null && items.size() > 0) {
            this.name = items.get(0);
            this.hitPoints = Integer.parseInt(items.get(1));
            this.strength = Integer.parseInt(items.get(2));
            this.weapon = items.get(3);
        }
    }
}
