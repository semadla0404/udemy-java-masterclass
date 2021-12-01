import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Example 1:  declaring a variable of it class type instead of the interface type. <Player mario>
        Player mario = new Player("Mario", 70, 90);
        System.out.println(mario);
        saveObject(mario);

        mario.setStrength(100);
        mario.setHitPoints(50);
        saveObject(mario);
        loadObject(mario);
        System.out.println(mario);

        // Example 2:  declaring a variable of its interface type instead of the class type. <ISaveable zombie>
        ISaveable zombie = new Monster("Zombie", 30, 50);
//        System.out.println("Strength = " + zombie.getStrength()); // <==Can't do this because zombie is actually an ISaveable object, not a Monster object.  You need to cast Monster to it.
        System.out.println("Strength = " + ((Monster) zombie).getHitPoints());
        System.out.println(zombie);
        saveObject(zombie);

    }

    public static void saveObject(ISaveable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

}
