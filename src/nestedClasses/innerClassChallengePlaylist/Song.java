package nestedClasses.innerClassChallengePlaylist;

public class Song {

	private String title;
	private double duration;
	
	// Constructor
	public Song(String title, double duration) {
		this.title = title;
		this.duration = duration;
	}

	// Overriding .toString() method from the Object class. 
	// toString() is used for retrieving various fields of the class. 
	@Override
	public String toString() {
		return this.title + ": " + this.duration;
	}
	
	// Getters
	public String getTitle() {
		return title;
	}
	public double getDuration() {
		return duration;
	}

/*	// Static method will return a song object
	public static Song getSong(String title, double duration) {
		Song song = new Song(title, duration);
		return song;
	}*/
}
