package abstractClasses;

// Parrot class is inheriting from the Bird abstract class.
// We could still override the eat() and breath() methods of the Animal class if we wanted to  
// change them specifically for Parrot. 
public class Parrot extends Bird {

	public Parrot(String name) {
		super(name);
	}

	// We are no longer required to override the fly() method from the Bird class as it 
	// will be inherited automatically. 
}
