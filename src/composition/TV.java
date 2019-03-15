package composition;

public class TV {

	private String make;
	private int size;
	private RemoteCtrl rc;
	
	public TV(String make, int size, RemoteCtrl rc) {
		this.make = make;
		this.size = size;
		this.rc = rc;
	}
	
	public void watchShow() {
		rc.powerTV(); // Calling the method from RemoteCtrl class to power on TV
		System.out.println("Tuning to the show on TV");
	}
	
	public String getMake() {
		return make;
	}
	public int getSize() {
		return size;
	}
	public RemoteCtrl getRc() {
		return rc;
	}	
}
