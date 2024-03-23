import java.util.ArrayList;

public class CentralObserver extends ConcreteObserver implements Runnable {
	
	int counterFrontDoor = 0;
	int counterBackDoor = 0;
	Counter counter;

	public CentralObserver(ArrayList<ConcreteSubject> subjects, Counter counter) {
		super(subjects);
		
		this.counter = counter;
		
		Thread t = new Thread(this);
		t.start();
	}

	
	@Override
	public void update(Message m) {
		switch(m.doorType) {
		case "FrontDoorEntering":
			counter.addCounterFrontDoor(m.payload);
			break;
		case "FrontDoorLeaving":
			counter.decrementCounterFrontDoor(m.payload);
			break;
		case "BackDoorEntering":
			counter.addCounterBackDoor(m.payload);
			break;
		case "BackDoorLeaving":
			counter.decrementCounterBackDoor(m.payload);
			break;	
			
		}
		
		
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println("Total people in Building: " + (counter.getFrontCounter() + counter.getBackCounter()));
			System.out.println("    Front Door: " + counter.getFrontCounter());
			System.out.println("    Back Door: " +  counter.getBackCounter());
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}