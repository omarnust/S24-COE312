public class Door implements Runnable{
	public Thread t;
	Counter counter;
	int totalPeople;
	
	Door(Counter c, int totalPeople){
		counter = c;
		this.totalPeople = totalPeople;
		t = new Thread(this);
		t.start();
	}
	
	public void run() {
		// uncomment one of the following functions
		//run_nosynchronization();
		run_withBlocksynchronization();
	}
	
	
	public void run_nosynchronization() {
		for (int i=0; i<totalPeople; i++) {
			counter.addCounter(Thread.currentThread().getName());
		}
	}
	
	public void run_withBlocksynchronization() {
		for (int i=0; i<totalPeople; i++) {
			
			synchronized(counter) {
				counter.addCounter(Thread.currentThread().getName());
			}
		}
	}
	
	
}