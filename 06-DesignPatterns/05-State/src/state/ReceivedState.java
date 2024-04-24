package state;

public class ReceivedState implements State{
	public void next(Context context) {
		System.out.println("This package is already received by a client.");
	}

	public void printStatus() {
		System.out.println("Package delivered to the given address.");
	}

}
