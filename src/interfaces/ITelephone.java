package interfaces;

public interface ITelephone {

	// Interface specifies signatures of methods only:
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean call(int phoneNumber);
    boolean isRinging(int phoneNumber);
}
