package polymorphism;

// To demonstrate Polymorphism, we are going to create a number of inner
// classes inside the Main class. 

// Movie is the base a.k.a. super class from which the 5 other classes are inheriting.
// The classes have similar structure and 1 method (except for last class)
// The child classes are initialized through the base class as they are passing the 

// Inside the Main class there is a static method that would be randomly return one of the 
// 5 Movie child classes. Note that the method returns Movie class as per its signature, 
// while it will actually be returning 1 of its 5 child class instances. 
// Note how we initialize each child class as a Movie class E.g.:
// Movie movie1 = new Jaws();
// Note that when we call .plot method of initialized Forgetable class, which does not have 
// the .plot() method, the .plot() method of the parent Movie class was called!!!

// Basically, at runtime java is looking at the object called 'movie', which was returned  
// from the .randomMovie() method, and it checks if that object has the .plot() method. If
// it find the method, it executes it, otherwise it goes to the parent Movie class and 
// executes the .plot() method in there. 

class Movie {
	private String name;

	// Constructor
	public Movie(String name) {
		this.name = name;
	}
	
	public String plot() {
		return "No plot here";
	}

	public String getName() {
		return name;
	}	
	
}

class Jaws extends Movie {

	// Constructor is initializing the name field of the base/super-class with "Jaws"
	public Jaws() {
		super("Jaws");
	}
	
	public String plot() {
		return "A shark eats lots of people";
	}
}

class IndependenceDay extends Movie {

	// Constructor is initializing the name field of the base/super-class
	public IndependenceDay() {
		super("Independence Day");
	}
	
	@Override
	public String plot() {
		return "Aliens attempt to take over planet Earth";
	}	
}

class MazeRunner extends Movie {

	// Constructor is initializing the name field of the base/super-class
	public MazeRunner() {
		super("Maze Runner");
	}
	
	@Override
	public String plot() {
		return "Kids try to escape the maze";
	}	
}

class StarWars extends Movie {

	// Constructor is initializing the name field of the base/super-class
	public StarWars() {
		super("Star Wars");
	}
	
	@Override
	public String plot() {
		return "Imperial forces try to take over Univerce";
	}	
}

class Forgetable extends Movie {

	// Constructor is initializing the name field of the base/super-class
	public Forgetable() {
		super("Forgetable");
	}
	
	// No plot method for this class.	
}


public class Main {

	public static void main(String[] args) {
		
		// Note how we are declaring the new instances of child classes:
		// The way .plot() method returns different values based on the
		// class that was initialized, is an example of polymorphosm.
		Movie movie1 = new Jaws();
		System.out.println(movie1.plot() + "\n");
		
		Movie movie2 = new Forgetable();
		System.out.println(movie2.plot() + "\n");
		
		// Using loop to get 10 random movies
		for (int i=1; i<11; i++) {
			// Note how we are declaring new instances of child classes:
			Movie movie = randomMovie();
			System.out.println("Movie #: " + i + " : " + movie.getName() +
					"\n" + "Plot " + movie.plot() + "\n");
		}
	}
	
	// Method to return random Movie
	public static Movie randomMovie() {
		
		// Casting Math.random() to int as it returns a random double value from 0 to 1.
		// By multiplying by 5 we get a range from 1 to 4, hence need to add 1.
		int randomNumber = (int) (Math.random() * 5) + 1; 
		System.out.println("Generated random number was: " + randomNumber);
		
		switch(randomNumber) {
		case 1:
			return new Jaws();
		case 2:
			return new IndependenceDay();
		case 3:
			return new MazeRunner();
		case 4:
			return new StarWars();
		case 5:
			return new Forgetable();
		}	
		return null;
	}
}
