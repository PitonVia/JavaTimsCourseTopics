package nestedClasses.innerClassChallengePlaylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	private static ArrayList<Album> albums = new ArrayList<Album>();
	
	public static void main(String[] args) {
		
		// We are using the final version of the code from the list.linkedListChallengePlaylist package
		// The objective is to modify the Album class so that it uses an inner class instead of a List
		// The inner class will be called SongList and it will use an ArrayList and will have private 
		// methods for adding songs and for finding songs that will be used by the Album class.
		// Neither the Song class nor the Main class should be changed.
		
		
		// Creating 1-st album
		Album album = new Album("Strombringer", "Deep Purple");
		album.addSong("Strombringer", 4.6);
		album.addSong("Love don't mean a thing", 4.22);
		album.addSong("Holy man", 4.3);
		album.addSong("Hold on", 5.6);
		album.addSong("Lady double dealer", 3.21);
		album.addSong("You can't do it right", 6.23);
		album.addSong("High ball shooter", 4.27);
		album.addSong("The gypsy", 4.2);
		album.addSong("Soldier of fortune", 3.13);
		albums.add(album);
		
		// Creating 2-nd album
		album = new Album("For those about to rock", "AC/DC");
		album.addSong("For those about to rock", 5.44);
		album.addSong("I put the finger on you", 3.25);
		album.addSong("Lets go", 3.45);
		album.addSong("Inject the venom", 3.33);
		album.addSong("Snowballed", 4.51);
		album.addSong("Evil walks", 3.45);
		album.addSong("C.O.D.", 5.25);
		album.addSong("Breaking the rules", 5.32);
		album.addSong("Night of the long knives", 5.12);
		albums.add(album);
		
		// Now we will add some songs to the playlist
		LinkedList<Song> playList = new LinkedList<Song>();
		
		// Get the first album 'Strombringer' at index = 0 and add a song from it to the playlist by song title
		albums.get(0).addToPlaylist("You can't do it right", playList);
		albums.get(0).addToPlaylist("Holy man", playList);
		albums.get(0).addToPlaylist("Speed king", playList); // this song doesn't exist in the album
		// Adding a song by it's track number in the album (last song # 9)
		albums.get(0).addToPlaylist(9, playList);
		
		// Will add some songs from the 2-nd album
		albums.get(1).addToPlaylist(8, playList);
		albums.get(1).addToPlaylist(3, playList);
		albums.get(1).addToPlaylist(2, playList);
		albums.get(1).addToPlaylist(24, playList); // this track doesn't exist in the album
		
		play(playList);
	}

	private static void play(LinkedList<Song> playList) {
		
		Scanner sc = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true; // to reposition iterator when changing playback direction
		
		ListIterator<Song> iter = playList.listIterator();
		
		if (playList.size() == 0) {	
			System.out.println("No songs in playlist");
			return;
		} else {
			// Note how we are calling the toString() from the Song class!!!
			System.out.println("Now playing " + iter.next().toString());
			printMenu();
		}
		
		while(!quit) {
			int action = sc.nextInt();
			sc.nextLine(); // fix for skipping issue
			
			switch(action) {
			case 0:
				System.out.println("Exiting playlist.");
				quit = true;
				break;
			case 1:
				// When we want to move forward
				if (!forward) {
					if(iter.hasNext()) {
						iter.next();
					}
					forward = true;
				}
				if (iter.hasNext()) {
					System.out.println("Now playing " + iter.next().toString());
				} else {
					System.out.println("We've reached the end of the playlist.");
					forward = false;
				}
				break;
			
			case 2:
				// When we want to move forward
				if (forward) {
					if(iter.hasPrevious()) {
						iter.previous();
					}
					forward = false;
				}
				if (iter.hasPrevious()) {
					System.out.println("Now playing " + iter.previous().toString());
				} else {
					System.out.println("We're at the start of the playlist.");
					forward = true;
				}
				break;
			
			case 3:
				if (forward) {
					if(iter.hasPrevious()) {
						System.out.println("Now re-playing " + iter.previous().toString());
						forward = false;
					} else {
						System.out.println("We're at the start of the playlist.");
					}
				// if we were not moving forward		
				} else {
					if (iter.hasNext()) {
						System.out.println("Now re-playing " + iter.next().toString());
						forward = true;
					} else {
						System.out.println("We've reached the end of the playlist.");
					}
				}	
				break;
			case 4:
				printList(playList);
				break;
			case 5:
				printMenu();
				break;	
			case 6:
				// Code for removing song
				if (playList.size() > 0) {
					iter.remove();
					// after removing a song, we need to move iterator to the new item
					if (iter.hasNext()) {
						System.out.println("Now playing " + iter.next().toString());
					} else if (iter.hasPrevious()) {
						System.out.println("Now playing " + iter.previous().toString());
					}
				} else {
					System.out.println("Playlist is empty.");
				}
				break;	
			}
		}
	}

	private static void printList(LinkedList<Song> playList) {

		System.out.println("Printing the list of songs:\n");
		
		// We can use the regular Iterator to go through the list and print all songs:
		Iterator<Song> iterator = playList.iterator();
		// Note the use of while to go through all List elements:
		while (iterator.hasNext()) {
			// Remember to include .next() to move to the next item
			System.out.println(iterator.next().toString());
		}
		System.out.println();
		
		// The usual code for printing all items of the List:
//		for (Song s : playList) {
//			System.out.println(s.toString());
//		}		
	}

	private static void printMenu() {
		System.out.println("Available actions: \n press");
		System.out.println("0 - to quit\n" + 
					"1 - to play next song\n" +
					"2 - to play previous song\n" +
					"3 - re-play the current song\n" +
					"4 - print songs in the playlist\n" +
					"5 - print available actions\n" + 
					"6 - delete current song from playlist\n");	
	}
	
	
}
