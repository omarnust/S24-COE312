import java.util.Random;

//Thread Example by extending Thread class
public class ExtendThread extends Thread{	
	Random r = new Random();
	
	public ExtendThread(String name){
		super(name);
		System.out.println("Creating " +  this.getName() );
		this.start();
	}
	
	public void run() {
		System.out.println("Running " +  this.getName() );
	      try {
	         for(int i = 4; i > 0; i--) {
	            System.out.println(this.getName() + ": " + r.nextInt(0,100));
	            // Let the thread sleep for a while.
	            Thread.sleep(150);
	         }
	      }catch (InterruptedException e) {
	         System.out.println("Thread " +  this.getName() + " interrupted.");
	      }
	      System.out.println("Thread " +  this.getName() + " exiting.");
	}
}