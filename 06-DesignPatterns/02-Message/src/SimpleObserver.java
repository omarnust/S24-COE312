

public class SimpleObserver extends ConcreteObserver implements Runnable {

	public SimpleObserver(ConcreteSubject[] subjects) {
		super(subjects);  // have been registered with everyone. 
		
		Thread t = new Thread(this);
		t.start();
	}
	

	@Override
	public void run() {
		while(true) {
			// do nothing because the message will be automatically printed
			// through update.
		}
	}

}
