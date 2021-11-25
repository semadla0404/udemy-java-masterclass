import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String monsterName;
    private int strength;
    private int stamina;

    public Monster(String monsterName, int strength, int stamina) {
        this.monsterName = monsterName;
        this.strength = strength;
        this.stamina = stamina;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "monsterName='" + monsterName + '\'' +
                ", strength=" + strength +
                ", stamina=" + stamina +
                '}';
    }

    @Override
    public List<String> write() {
        // add() to an array list
        ArrayList<String> items = new ArrayList<>();
        items.add(0, this.monsterName);
        items.add(1, Integer.toString(this.strength));
        items.add(2, Integer.toString(this.stamina));
        return items;
    }

    @Override
    public void read(List<String> items) {
        // get() items from array list
        if(items != null) {
            this.monsterName = items.get(0);
            this.strength = Integer.parseInt(items.get(1));
            this.stamina = Integer.parseInt(items.get(2));
        }
    }
}
