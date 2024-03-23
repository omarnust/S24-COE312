import java.util.Random;
public class FrontDoor extends ConcreteSubject implements Runnable {
	Random rand = new Random();
	
	FrontDoor() {
		Thread t = new Thread(this);
		t.start();
	}

	public void run() {

		while (true) {
			Message m1 = new Message(this, "FrontDoorEntering", rand.nextInt(5)); 
			Message m2 = new Message(this, "FrontDoorLeaving", rand.nextInt(5));
			
			notifyObservers(m1);
			notifyObservers(m2);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}