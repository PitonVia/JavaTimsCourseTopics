package generics.genericsChallenge;

import java.util.ArrayList;

// This class will have ability to add players of specific type. 

// Note the <T> indicating that the Team class will be of a certain type where 'T' is a type parameter. 
// 'extends Player' is a bound, which restricts the T to a variant object of the Player class type, 
// which prevents the possibility of errors if wrong type of objects would be used from public interface.
// In the example below, 'T' is the bounded class parameter.
// It is also possible for 'T' to implement an interface - in our example we have implemented Comparable 
// interface that will be comparing Team class objects of the same type. For this interface we must 
// implement the compareTo() method. 
// The advantage of implementing Comparable interface is that it allows to use Collections.sort() method. 

public class Team<T extends Player> implements Comparable<Team<T>> {

	private String name;
	int played = 0;
	int won = 0;
	int lost = 0;
	int tied = 0;
	
	private ArrayList<T> members = new ArrayList<>();

	// Constructor
	public Team(String name) {
		this.name = name;
	}
	
	// Method that allows to add members to the team - note the 'T' object as a parameter. 
	public boolean addPlayer(T player) {
		// Note the powerful .contains() method for lists - checks if ArrayList already has this player
		if (members.contains(player)) {
			// no need to cast (Player), since the upper bound of the 'T' object type is the Player class
			System.out.println("Player " + player.getName() + " is already on the team!");
			return false;
		}
		this.members.add(player);
		System.out.println("Added " + player.getName() + " to team " + this.name);
		return true;
	}
	
	// Return how many players are on the team
	public int numPlayers() {
		
		return this.members.size();
	}
	
	// Return match results for our team and for the opponent's team
	// We added 'T' type parameter to the Team class to ensure that only teams of the same type can match!
	public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
		String message;
		if (ourScore > theirScore) {
			this.won++;
			message = " beat ";
		} else if (ourScore == theirScore) {
			this.tied++;
			message = " drew with ";
		} else {
			this.lost++;
			message = " lost to ";
		}
		this.played++;
		
		// This code performs the same operations for the opponent's team
		if (opponent != null) {
			System.out.println(this.getName() + message + opponent.getName());
			opponent.matchResult(null, theirScore, ourScore);
		}
	}
	
	// Method returns simple ranking
	public int ranking() {
		return (won * 2) + tied;
	}
	
	// Getter for name
	public String getName( ) {
		return name;
	}

	// Method of the Comparable interface. It returns a negative int if this object is < than the object it was
	// compared to; return positive int if this object > object it was compared to or returns 0 if they are equal. 
	@Override
	public int compareTo(Team<T> team) {
		// Note the use of this.ranking() for this class
		if (this.ranking() > team.ranking()) {
			return -1;
		} else if (this.ranking() < team.ranking()) {
			return 1;
		} else {
			return 0;
		}
	}
}
