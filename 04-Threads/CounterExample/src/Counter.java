public class Counter {
	private int count;
	Counter(){
		count = 0;
	}
	public int getCounter() {
		return count;
	}
	//public synchronized void addCounter(String door) {
	public void addCounter(String door) {	
		try {		
			int val = count;
			Thread.sleep(10);
			count = val+1;
			System.out.println(door + "-> Counter: " + count);
		}catch(Exception e) {
			
		}
	}
}