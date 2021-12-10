package com.example.game;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private int strength;
    private int stamina;
    private int intellect;

    public Player(String name, int strength, int stamina, int intellect) {
        this.name = name;
        this.strength = strength;
        this.stamina = stamina;
        this.intellect = intellect;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", stamina=" + stamina +
                ", intellect=" + intellect +
                '}';
    }

    @Override
    public List<String> write() {
        // add() to an array list
        ArrayList<String> items = new ArrayList<>();
        items.add(0, this.name);
        items.add(1, Integer.toString(this.strength));  // shortcut to convert int to String==> items.add(1, "" + this.strength);
        items.add(2, Integer.toString(this.stamina));
        items.add(3, Integer.toString(this.intellect));

        return items;
    }

    @Override
    public void read(List<String> items) {
        // get() items from array list
        if(items != null) {
            this.name = items.get(0);
            this.strength = Integer.parseInt(items.get(1));
            this.stamina = Integer.parseInt(items.get(2));
            this.intellect = Integer.parseInt(items.get(3));
        }
    }
}
