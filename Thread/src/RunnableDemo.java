import java.util.Random;
import java.util.Random;

public class RunnableDemo implements Runnable{
	Random r = new Random();
	
	public void run() {
		System.out.println(Thread.currentThread().getName() + " running");
		
		for (int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + r.nextInt(0,100));
		}
		
	}

}
