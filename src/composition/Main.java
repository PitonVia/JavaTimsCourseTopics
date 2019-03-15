package composition;

public class Main {

	public static void main(String[] args) {

		// Master (composite) class Room consists of 2 classes: Window and TV.
		// Window has Blinds class and TV has RemoteCtrl class. 
		// Inside the Room, the .watchTV() method is implemented through a private getter
		// while the .checkOutside() method is calling the Window class method directly.
		
		Blinds blinds = new Blinds("white");
		Window window = new Window("square", blinds);
		
		// Note how we are declaring the instance of the RemoteCtrl class directly 
		// without creating an instance variable: 
		TV tv = new TV("Sony", 65, new RemoteCtrl("sony"));
		
		Room room = new Room("livingRoom", window, tv);
		
		room.checkOutside();
		System.out.println();
		
		// calling a method inside Room class that invokes a private getter for TV 
		// and calls the .watchShow() method inside the TV class
		room.watchTV();	
		System.out.println();
		
		// Accessing the powerTV() method via Room >> TV getter >> RC getter:
		room.getTv().getRc().powerTV();
	}
}
