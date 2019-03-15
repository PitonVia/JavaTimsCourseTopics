package abstractClasses;

public class Main {

	public static void main(String[] args) {

		Dog dog = new Dog("Yorkie");
		dog.eat();
		dog.breath();

		// Note that we cannot instantiate the Bird class as it an abstract class so 
		// we had to create new Parrot and Penguin classes that extended the Bird class.
		
		Parrot parrot = new Parrot("Tucan");
		parrot.eat();
		parrot.breath();
		parrot.fly();
		
		Penguin penguin = new Penguin("Emperor");
		penguin.fly();
	}

}
