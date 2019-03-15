package collections.lists.linkedListChallengePlaylist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
	
	private String name;
	private String artist;
	private ArrayList<Song> songs;
	
	// Constructor 
	public Album(String name, String artist) {
		this.name = name;
		this.artist = artist;
		this.songs = new ArrayList<Song>();
	}

	
	// Add a song to an album:
	public boolean addSong(String songTitle, double songDuration) {
		
		if (findSong(songTitle) == null) {
			this.songs.add(new Song(songTitle, songDuration));
			return true;
		}
		System.out.println("This song already exists.");
		return false;
	}
	
	
	// Returns Song if the song already exists
	private Song findSong(String songTitle) {
		
		for (Song s : this.songs) {
			if (s.getTitle().equals(songTitle)) {
				return s;
			}
		} 
		return null;
	}

	// Create playlist by providing the track number 
	public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
		
		int index = trackNumber - 1;
		if ((index >= 0) && (index <= this.songs.size())) {
			playlist.add(this.songs.get(index));
			return true;
		}
		System.out.println("This album does not have a track " + trackNumber + "\n");	
		return false;
	}
		
	//Create playlist by providing the track number
	public boolean addToPlaylist(String songTitle, LinkedList<Song> playlist) {
		
		Song song = findSong(songTitle);
		// if song exists (title of the song matches)
		if (song != null) {
			playlist.add(song);
			return true;
		}
		System.out.println("The song " + songTitle + " is not in this album.\n");	
		return false;
	}
	
	// Print songs
	public void printSongs() {
		for (Song s : songs) {
			System.out.println("Song: " + s.getTitle());	
		}
	}
	
	
	// Getters
	public String getName() {
		return name;
	}
	public ArrayList<Song> getSongs() {
		return songs;
	}
}
