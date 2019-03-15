package interfaces;

public class MobilePhone implements ITelephone {

	private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    // Can generate methods for interface.
    // Note that all methods have to be implemented for the interface to work!

    // Constructor
    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powered up.");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing " + phoneNumber + " on mobile phone.");
        } else {
            System.out.println("Mobile phone is turned off.");
        }
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the mobile phone.");
            isRinging = false;
            System.out.println("Mobile phone is not on.");
        }
    }

    @Override
    public boolean call(int phoneNumber) {
        if (phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Mobile phone rings");
        } else {
            isRinging = false;
            System.out.println("Mobile phone is not on or number different");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging(int phoneNumber) {
        return isRinging;
    }
}
