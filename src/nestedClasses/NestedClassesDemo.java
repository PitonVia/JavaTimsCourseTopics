package nestedClasses;

import java.util.Scanner;

public class NestedClassesDemo {

	// scanner is required to demostrate functionality of the Button object
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");
	
	public static void main(String[] args) {

	    // 4 TYPES of NESTED CLASSES:

	    // 1. STATIC NESTED CLASS - mainly used to associate a class with its outer class.

	    // 2. NON-STATIC NESTED CLASS (a.k.a. INNER CLASS) - used when it doesn't make sense to create 
		// a separate class, since the class only relates to the outer class and is not useful on its own.
		// Instances of the inner class will have access to all private members and methods of the outer class. 
		// Gear class inside the Gearbox class is the example of the inner class. 

	    // 3. LOCAL CLASS - INNER CLASS defined inside of code block, which is usually a method or an if
	    // statement. The scope of such class is completely restricted to that particular block of code.
		// Local classes are used less often. 
		// Refer to the ClickListenner class inside the Main method, which implements the Button class.
		// Useful, for example, when you have several different buttons having the same onClick methods.
	
	    // 4. ANONYMOUS CLASS - is a local class without a name, which has to be declared and
	    // instantiated at the same time and is used only once. Commonly used for touching event
	    // handlers in mobile interfaces: (e.g. different buttons, each with a different onClick method)
		// Refer to the .setOnClickListenner() method inside the Main method as an example. 

		Gearbox mcLaren = new Gearbox(6);

		// This is how we declare a public inner class Gear
/*		Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
		System.out.println(first.driveSpeed(1000) + "\n");       */
		
		// However, it makes sense not to expose the inner Gear class to a public interface and to make it  
		// private as we are not interested in creating individual Gear objects when driving. We want to    
		// change gears by interacting with the outer Gearbox class. 
		
		// Method adds first 3 gears to the List of Gears
		// These calls are no longer required, since the method was changed to private and the gears are
		// now added as a part of the outer Gearbox class constructor!
/*      mcLaren.addGear(1,5.3);
        mcLaren.addGear(2,10.6);
        mcLaren.addGear(3,15.9);       */

        // Changing the operateClutch to true so we can actually change gears of the Gearbox object
        mcLaren.operateClutch(true);
        // Changing the Gearbox currentGear field's value to 1
        mcLaren.changeGear(1);
        
     // Changing the operateClutch to false so it is impossible to change the currentGear of the Gearbox
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000)); 
        mcLaren.changeGear(2); // unable to change Gear since clutch is NOT in, changing the gear to neutral (0)
        System.out.println(mcLaren.wheelSpeed(3000)); // return speed of 0, since 3,000 * 0 = 0.
        
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        System.out.println(mcLaren.wheelSpeed(1000)); // should return 0.0 as clutch is in!
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));
        System.out.println();
        
        
        // Example of the Local Class implementing the Button Class:
/*        class ClickListenner implements Button.OnClickListenner {
      
        	// Constructor
            public ClickListenner() {
                System.out.println("I've been attached.");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked.");
            }
        }

        btnPrint.setOnClickListenner(new ClickListenner());
        listen();              */
		
        
        // Example use of an ANONYMOUS CLASS:
        btnPrint.setOnClickListenner(new Button.OnClickListenner() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked.");
            }
        });
        listen();
        
	}
	
	// Method simulates the listen method from the keyboard
	public static void listen() {

        boolean quit = false;
        while (!quit) {
            System.out.println("Select options 0-to quit " +
                    "\n or 1-to click on button: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                    
                case 1:
                    btnPrint.onClick();
            }
        }


    }

}
