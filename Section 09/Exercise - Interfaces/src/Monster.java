import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String monsterName, int hitPoints, int strength) {
        this.name = monsterName;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    @Override
    public List<String> write() {
        // add() to an array list
        ArrayList<String> items = new ArrayList<>();
        items.add(0, this.name);
        items.add(1, Integer.toString(this.hitPoints));
        items.add(2, Integer.toString(this.strength));
        return items;
    }

    @Override
    public void read(List<String> items) {
        // get() items from array list
        if(items != null && items.size() > 0) {
            this.name = items.get(0);
            this.hitPoints = Integer.parseInt(items.get(1));
            this.strength = Integer.parseInt(items.get(2));
        }
    }
}
