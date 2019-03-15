package encapsulation;

public class Main {

	public static void main(String[] args) {

		Player player = new Player();
		
		// Setting the values of the Player fields manually, since 
		// they all have public access modifiers. 
		player.name = "Tim";
		player.health = 20;
		player.weapon = "Sword";
		
		int damage = 10;
		player.loseHealth(damage);
		System.out.println("Remaining health = " + player.healthRemaining());
		
		damage = 11;
		player.health = 200;
		player.loseHealth(damage);
		System.out.println("Remaining health = " + player.healthRemaining());
		System.out.println();
		
		// When we initialize health with value <0 or >100, it will default to 100:
		EnhancedPlayer ePlayer = new EnhancedPlayer("Tom", 200, "Bow");
		System.out.println("Initial health = " + ePlayer.getHealth());
			
	}
}
