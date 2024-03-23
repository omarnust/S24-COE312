public class Counter {
	private int counterFrontDoor = 0;
	private int counterBackDoor = 0;

	private static Counter instance;
	
	
	private Counter() {
	}

	public static synchronized Counter getInstance(){
		if(instance == null){
		instance = new Counter();
		}
		 return instance;
		}

	
	public int getBackCounter() {
		return counterBackDoor;
	}
	public int getFrontCounter() {
		return counterFrontDoor;
	}
	
	public synchronized void addCounterFrontDoor(int num) {
		counterFrontDoor += num;
	}
	
	public synchronized void addCounterBackDoor(int num) {
		counterBackDoor += num;
	}
	
	public synchronized void decrementCounterFrontDoor(int num) {
		counterFrontDoor -= num;	
		counterFrontDoor = counterFrontDoor < 0 ? 0 : counterFrontDoor;
	}
	
	public synchronized void decrementCounterBackDoor(int num) {
		counterBackDoor -= num;	
		counterBackDoor = counterBackDoor < 0 ? 0 : counterBackDoor;
	}
}