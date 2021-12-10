package com.company;

public class Car {

    // State Components - Fields or Attributes
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // Behavior Components - Methods
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
