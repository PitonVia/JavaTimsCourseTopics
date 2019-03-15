package generics.genericsChallenge;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

	private String name;
	
	private ArrayList<T> league;
	
	// Constructor
	public League(String name) {
		this.name = name;
		this.league = new ArrayList<>();
	}
	
	// Add team to the league
	public boolean addTeam(T team) {
		if (league.contains(team)) {
			System.out.println("The team " + team.getName() + " is already in the league " + this.name);
			return false;
		}
		this.league.add(team);
		System.out.println("Added " + team.getName() + " to  league " + this.name);
		return true;		
	}
	
	// Sorting the teams in the ArrayList
	public void showLeagueTable() {
		
		// sort() works, since we implemented comparable interface for the Team class
		Collections.sort(league);
		
		for (T team : league) {
			System.out.println(team.getName() + " : " + team.ranking());
		}
		
	}





}
