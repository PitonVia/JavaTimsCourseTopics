package composition;

public class RemoteCtrl {

	private String model;

	// constructor
	public RemoteCtrl(String model) {
		this.model = model;
	}

	public void powerTV() {
		System.out.println("Turning TV on from remote control.");
	}
	
}
