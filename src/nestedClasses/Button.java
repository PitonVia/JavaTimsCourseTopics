package nestedClasses;

public class Button {

	private String title;
    // This field refers to the local OnclickListener class
	private OnClickListenner onClickListenner;

	// Constructor
    public Button(String title) {
        this.title = title;
    }

    // Getter for the title field
    public String getTitle() {
        return title;
    }

    // Setter for the OnclickListener
    public void setOnClickListenner(OnClickListenner onClickListenner) {
        this.onClickListenner = onClickListenner;
    }

    public void onClick() {
        this.onClickListenner.onClick(this.title);
    }

    // Creating an interface called OnClickListener, which must implement onClick() method
    public interface OnClickListenner {
        public void onClick(String title);
    }
}
