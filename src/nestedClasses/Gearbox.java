package nestedClasses;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        // Note how we are instantiating an inner class inside the constructor!
        Gear neutral = new Gear(0, 0.0);
        // Then, adding the inner class object to the List
        this.gears.add(neutral);  
        
        for (int i=0; i<maxGears; i++) {
        	addGear(i, i*5.3);
        }
    }
    
    // Operates the clutch when need to change Gear
    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    // This method will interact with the private inner Gear class and will be adding the objects of the Gear 
    // class to the List of gears. However, instead of calling this method from the public interface, it is 
    // better to make this method private and to include it as part of the Gearbox class constructor!
    private void addGear(int number, double ratio) {
        if ((number > 0) && (number < maxGears)) {
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear) {
        if ((newGear >= 0) && ((newGear < maxGears) && this.clutchIsIn)) {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected.");
        } else {
            this.currentGear = 0;
            System.out.println("Mechanical issue, unable to change gear!");
        }
    }

    // Calculates the speed of the wheels by calling the ratio getter of the inner Gear class
    public double wheelSpeed(int revs) {
        if (clutchIsIn) {
            System.out.println("Clutch is in - cannot determine speed.");
            return 0.0;
        }

        return revs * gears.get(currentGear).getRatio();
    }

    // Creating the INNER CLASS Gear - a class inside the Gearbox public class.
    // Because the Gear class is not useful without the Gearbox class, it makes sense to 
    // create the Gear class as an inner class of the Gearbox. 
    public class Gear {
        private int gearNumber;
        private double ratio;

        // Generating constructor for the inner class:
        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        // Getter for the ratio field
        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int revs) {
            return revs * (this.ratio);
        }

    }

}