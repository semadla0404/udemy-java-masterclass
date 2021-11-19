package com.company;

import java.util.ArrayList;

// Think of this as a WRAPPER
class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
	    String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Tim");

        // Can't do the following line below - primitives are not allowed for ArrayLists
        // - you can only have class objects use the ArrayLists
//        ArrayList<int> intArrayList = new ArrayList<int>();

        // This would use the class above to get around that
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        Integer integer = new Integer(54);
        Double doubleVal = new Double(12.25);

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for(int i=0; i < 10; i++) {
            integerArrayList.add(Integer.valueOf(i));   // <== AUTOBOXING - where you convert a primitive by wrapping it.
        }
        for(int i=0; i < 10; i++) {
            System.out.println(i + " --> " + integerArrayList.get(i).intValue());   // <== UNBOXING - taking from the wrapper and converting it back to a primitive.
        }

// THE EASY WAY OF DOING THIS IS BELOW!  The only way to be able to use primitives with ArrayLists with the use of Wrappers.

        Integer myIntValue = 56;    // at compile time this happens==>  Integer myIntValue = Integer.valueOf(56);
        int myInt = myIntValue.intValue();     // at compile time this happens==>  int myInt = myIntValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl=0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(Double.valueOf(dbl));            // <== AUTOBOXING HERE - using a wrapper "Double.valueOf()".
        }

        for(int i=0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue(); // <== UNBOXING HERE - using "doubleValue()" to return the double value.
            System.out.println(i + " --> " + value);
        }
// AND THE VERY EASY EASY WAY OF DOING THIS BELOW! REMOVING:
        // - Double.valueOf()   <== AUTOBOXING
        // - .doubleValue()     <== UNBOXING

        ArrayList<Double> myDoubleValues2 = new ArrayList<Double>();
        for(double dbl=0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues2.add(dbl);            // <== AUTOBOXING HERE - using a wrapper "Double.valueOf()".
        }

        for(int i=0; i < myDoubleValues2.size(); i++) {
            double value = myDoubleValues2.get(i); // <== UNBOXING HERE - using "doubleValue()" to return the double value.
            System.out.println(i + " --> " + value);
        }
    }
}
