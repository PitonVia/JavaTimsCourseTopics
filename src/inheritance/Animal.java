package inheritance;

// This is the base Animal class, from which other classes will be inheriting
// the base fields and the base methods.
public class Animal {

	private String name;
	private int brain;
	private int body;
	private int size;
	private int weight;
	
	// Auto-generated constructor for all fields:
	public Animal(String name, int brain, int body, int size, int weight) {
		this.name = name;
		this.brain = brain;
		this.body = body;
		this.size = size;
		this.weight = weight;
	}

	public void eat() {
		System.out.println("Animal eats");
	}
	
	public void move(int speed) {
		System.out.println("Animal moves at speed " + speed);
	}
	
	// Auto-generated getters for each field
	public String getName() {
		return name;
	}
	public int getBrain() {
		return brain;
	}
	public int getBody() {
		return body;
	}
	public int getSize() {
		return size;
	}
	public int getWeight() {
		return weight;
	}
}
