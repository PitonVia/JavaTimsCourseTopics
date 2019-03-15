package nestedClasses.innerClassChallengePlaylist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
	
	private String name;
	private String artist;
//	private ArrayList<Song> songs;
	private SongList songList;
	
	// Constructor 
	public Album(String name, String artist) {
		this.name = name;
		this.artist = artist;
//		this.songs = new ArrayList<Song>();
		// Instantiating the SongList class in the constructor
		this.songList = new SongList();
	}

	// Add a song to an album:
	public boolean addSong(String songTitle, double songDuration) {
		
		// Calling the private addSong() method inside the inner class
		return songList.addSong(songTitle, songDuration);
	}
		
	// Return Song if the song already exists
	private Song findSong(String songTitle) {
		
		return songList.findSong(songTitle);
	}

	// Create playlist by providing the track number 
	public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
		
		int index = trackNumber - 1;
		if ((index >= 0) && (index <= this.songList.songs.size())) {
			playlist.add(this.songList.songs.get(index));
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
		songList.printSongs();
	}
	
	// Getters
	public String getName() {
		return name;
	}
//	public ArrayList<Song> getSongs() {
//		return songs;
//	}
	
	// Creating the private inner class for storing songs 
	private class SongList {
		
		private ArrayList<Song> songs;
		
		// Constructor
		public SongList() {
			this.songs = new ArrayList<Song>();
		}
		
		// Add a song to the songs ArrayList:
		private boolean addSong(String songTitle, double songDuration) {
			
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
		
		// Print songs
		private void printSongs() {
			for (Song s : songs) {
				System.out.println("Song: " + s.getTitle());	
			}
		}
		
		// Getter for the songs ArrayList
		public ArrayList<Song> getSongs() {
			return songs;
		}	
	}
}
