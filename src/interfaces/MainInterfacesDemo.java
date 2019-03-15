package interfaces;

public class MainInterfacesDemo {

	public static void main(String[] args) {
		
	    // INTERFACE - is a contract that the defined method signatures or constants will not change.  
		// It specifies methods that must be implemented by a particular class that implements interface.
		// Note that ALL the methods have to be implemented for an interface to work.

		// Interface names are commonly preceded by a Capital 'I', e.g. ITelephone. 
	    // Interface itself is ABSTRACT, i.e. contains no code, only method signatures and constants.

	    // Interface provides common behaviour to multiple classes by ensuring that they implement the
	    // same interface. It standardizes the way particular set of classes are used.

	    // To implement interface for a class keyword 'implements' has to be used.

		
		// Note how we are initializing an interface:
        ITelephone timsPhone;
        
        // Note that we are not typing: ITelephone timsPhone = new ITelephone(); 
        // This is very important, since we will be instantiating the interface through the DeskPhone
        // and the MobilePhone classes that implemented the same ITelephone interface: 
        timsPhone = new DeskPhone(123456);

/*      The same happens when we work with the WebDriver interface: 
        WebDriver driver;
        driver = new FirefoxDriver();   */
        
        // Calling the implemented methods of the DeskPhone class: 
        timsPhone.powerOn();
        timsPhone.call(123456);
        timsPhone.answer();
        System.out.println();

        // Note how it is possible to assign a completely new class to the same
        // interface variable and to execute the same methods for it.
        // This is a very powerful feature of interfaces!!!!!!        
        timsPhone = new MobilePhone(24565);

/*      // In Selenium, we can cast the 'driver' to different classes, which implemented the same
        // WedDriver interface:       
        driver = new InternetExplorerDriver();
        driver = new ChromeDriver();    */
        
        // Calling the implemented methods of the MobilePhone class: 
        timsPhone.powerOn();
        timsPhone.call(24565);
        timsPhone.answer();	
	}
}
