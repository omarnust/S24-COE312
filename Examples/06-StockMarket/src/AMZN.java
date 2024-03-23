public class AMZN extends ConcreteSubject implements Runnable{
	
	AMZN() {
		Thread t = new Thread(this);
		t.start();
	}

	public void run() {

		while (true) {
			notifyObservers();

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


