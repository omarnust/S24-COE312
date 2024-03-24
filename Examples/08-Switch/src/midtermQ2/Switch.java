package midtermQ2;

public class Switch {
	private boolean state;
	Switch(){
		state = false;
	}	
	public void click() {
		state = !state;
		System.out.println("I am " + (state ?  "on": "off"));
	}
	public boolean getState() {
		return state;
	}
}

