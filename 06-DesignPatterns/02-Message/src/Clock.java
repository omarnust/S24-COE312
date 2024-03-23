
import java.util.Date;

public class Clock extends ConcreteSubject implements Runnable {

	int tick;
	boolean send=true;
	
	Clock(int tick) {
		this.tick = tick;
		Thread t = new Thread(this);
		t.start();
	}

	public void run() {

		while (true) {
			
			Message m = new Message(this, "time", new Date().toString()); 
			if (send) publishMessage(m);

			try {
				Thread.sleep(1000*tick);
				send=true;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	//@Override
	//public void update(Message m) {
	//	send = false;
		
	//}
}