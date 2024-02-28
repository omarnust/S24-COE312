
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counter = new Counter();
		Door door1 = new Door(counter, 5);
		Door door2 = new Door(counter, 5);
		
		try {
			door1.t.join();
			door2.t.join();
		
		}catch(InterruptedException e) {
			
		}
		
		System.out.println("total: " + counter.getCounter());
	}

	
}
