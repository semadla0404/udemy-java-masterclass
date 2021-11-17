package com.company;

import java.util.ArrayList;

public class GroceryList {
    // DECLARING AN ARRAYLIST
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        // ADDING ITEMS TO AN ARRAYLIST
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        // ACCESSING ITEMS IN AN ARRAYLIST
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for(int i=0; i< groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if(position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        // MODIFYING AN ITEM IN AN ARRAYLIST
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if(position >= 0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    // OLD METHOD
//    public void removeGroceryItem(int position) {
//        String theItem = groceryList.get(position);
//        // REMOVING AN ITEM FROM AN ARRAYLIST
//        groceryList.remove(position);
//        // example arrayList (remove Eggs)
//        //  0      1      2          0      1
//        // Milk, Eggs, Butter  ==>  Milk, Butter
//        System.out.println("Removed item " + theItem + " from list");
//    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if(position >= 0) {
            return true;
        }
        return false;
    }

    // OLD METHOD
//    public String findItem(String searchItem) {
//        // SEARCH FOR AN ITEM FROM AN ARRAYLIST
//            // obj.contains returns true if found, else false
//        boolean exists = groceryList.contains(searchItem);
//        // SEARCH FOR AN ITEM FROM AN ARRAYLIST
//            // obj.indexOf returns int position of 'first'
//            // occurrence if found, else -1
//        int position = groceryList.indexOf(searchItem);
//        if(position >= 0) {
//            return groceryList.get(position);
//        }
//
//        return null;
//    }
}
