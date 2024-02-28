import java.util.Random;

public class ImplementInterface implements Runnable{	
	Random r = new Random();
	private Thread t;
	
	ImplementInterface(String name){
		t = new Thread(this);
		t.setName(name);
		System.out.println("Creating " + t.getName()  );
		t.start();
	}
	
	public void run() {
		System.out.println(t.getName());
		
		System.out.println("Running " +  t.getName());
	      try {
	         for(int i = 4; i > 0; i--) {
	            System.out.println(t.getName() + ": " + r.nextInt(0,100));
	            // Let the thread sleep for a while.
	            Thread.sleep(150);
	         }
	      }catch (InterruptedException e) {
	         System.out.println("Thread " +  t.getName() + " interrupted.");
	      }
	      System.out.println("Thread " + t.getName() + " exiting.");
	      
	      
	}
}