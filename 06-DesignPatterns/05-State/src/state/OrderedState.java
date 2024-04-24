package state;
import java.util.Random;

public class OrderedState implements State{
	Random rand = new Random(); // just to simulate rain
			
	public void next(Context context) {
		int r = rand.nextInt(10);
		
		if (r < 5){ // not raining
		  context.setState(new DeliveredState());
		}
	}

	public void printStatus() {
		System.out.println("Package ordered, not delivered to the post office yet.");
	}
}

