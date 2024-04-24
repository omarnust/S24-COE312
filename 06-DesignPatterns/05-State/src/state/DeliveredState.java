package state;

public class DeliveredState implements State{
	
	public void next(Context context) {
		context.setState(new ReceivedState());
	}
	public void printStatus() {
		System.out.println("Package has been delivered to the post office.");
	}

}
