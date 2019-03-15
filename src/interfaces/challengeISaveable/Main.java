package interfaces.challengeISaveable;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// This code will test the Player methods
		Player tim = new Player("Tim", 10, 15);
	    System.out.println(tim.toString()); // printing using toString()
	    saveObject(tim);

	    tim.setHitPoints(8);
	    System.out.println(tim); // calling toString by default!
	    
	    tim.setWeapon("Stormbringer");
	    saveObject(tim);
	    
	    //loadObject(tim);
	    System.out.println(tim);
	    	    
	    // This code will test the Monster methods
	    Monster zomby = new Monster("Pasha", 30, 20);
	    System.out.println(zomby);
	    System.out.println("Strength = " + zomby.getStrength());
	    saveObject(zomby);
	    
	    // Note that we are declaring the Interface = Monster
	    // This makes the code more generic and this is preferable over declaring a class
	    // that implemented the interface, unless there is a need to use the class a lot.
	    ISaveable werewolf = new Monster("Werewolf", 20, 40);
	    System.out.println(werewolf);
	    // Becase werewolf was declared as Interface, the code below will not work:
	    //System.out.println(werewolf.getStrength());
	    // To get a value we need to cast the Monster class
	    System.out.println("Strength = " + ((Monster) werewolf).getStrength());
	    saveObject(werewolf);
	    
	    loadObject(werewolf);
	    System.out.println(werewolf);

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
	
	// Takes an object of the interface as a parameter, implements the interface's parameters and saves the value 
	// to the storage device. The method will work for any class object that implemented the ISaveable interface.
	// This a very powerful functionality to create this kind of generic methods using interfaces!!! 
	// The method is calling the .write() method of the ISaveable interface or of any classes that implemented it.
    public static void saveObject(ISaveable objectToSave) {
        for(int i=0; i<objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }
    
    // The opposite method will load the object of the iSaveable interface
    // The method is calling the .read() method of the ISaveable interface or of any classes that implemented it.
    public static void loadObject(ISaveable objectToLoad) {
    	
    	ArrayList<String> values = readValues();
    	
    	objectToLoad.read(values);	
    }
}
