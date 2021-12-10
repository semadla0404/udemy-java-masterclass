package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        // A LINKED LIST is a linear collection of data elements whose order is not given by
        // their physical placement in memory. Instead, each element points to the next.
        // It is a data structure consisting of a collection of nodes which together represent a sequence.

/*
        // Create a Linked List
        LinkedList<String> placesToVisit = new LinkedList<String>();

        // Add elements to the Linked List
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        printList(placesToVisit);

        // inserting an element at a certain index in the Linked List
        placesToVisit.add(1, "Alice Springs");
        printList(placesToVisit);

        // removing an element at a certain index
        placesToVisit.remove(4);
        printList(placesToVisit);
*/

        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);

        addInOrder(placesToVisit, "Alice Springs");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);

        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()) {    // hasNext() looks to see if there is another element to go to still
            System.out.println("Now visiting " + i.next());  // returns the current element, and then iterates to the next.
        }
        System.out.println("==================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();    // this is only setting the iterator up, it isn't pointing to the first item

        while(stringListIterator.hasNext()) {   // this is where the list points to the first item initially
            int comparison = stringListIterator.next().compareTo(newCity);  // this is where the list points to the first item initially with .next()
            if(comparison == 0) {
                // equal, do not add;
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if(comparison > 0) {
                // new city (adelaide) should appear before this one (brisbane)
                // brisbane -> adelaide
                stringListIterator.previous();  // since we already moved to the next element from above (45), we need to go back to the previous using .previous()
                stringListIterator.add(newCity);
                return true;
            } else if(comparison < 0) {
                // move on to next record city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;  // to help with the changing of direction of the list iterator and displaying duplicate items
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()) {
            System.out.println("No cities in the itinerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }
        while(!quit) {
            int action = scanner.nextInt();
            switch(action) {
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next(); // skipping over the last item
                        }
                        goingForward = true;
                    }

                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list.");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous(); // skipping over the last item
                        }
                        goingForward = false;
                    }

                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }
}
