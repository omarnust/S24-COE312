import java.util.Random;
public class BackDoor extends ConcreteSubject implements Runnable {
	Random rand = new Random();
	
	BackDoor() {
		Thread t = new Thread(this);
		t.start();
	}

	public void run() {

		while (true) {
			Message m1 = new Message(this, "BackDoorEntering", rand.nextInt(5)); 
			Message m2 = new Message(this, "BackDoorLeaving", rand.nextInt(5));
			
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