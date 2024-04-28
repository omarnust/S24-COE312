import java.util.Random;
public class Sensor implements Subject, Runnable{
	Random r = new Random();
	Observer observer;
	
	public Sensor(){
		Thread t = new Thread(this);
		t.start();
	}
	public void notifyObservers(int num) {
		observer.update(num);
		
	}

	public void registerObserver(Observer o) {
		observer = o;
	}

	public void removeObserver() {
		observer = null;
	}
	
	public void run() {
		while (true) {
			this.notifyObservers(r.nextInt(10));
			try {
				Thread.sleep(1000);		
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}