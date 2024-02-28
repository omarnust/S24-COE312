import java.util.Random;

public class ThreadDemo extends Thread{
	Random r = new Random();
	
	ThreadDemo(String name){
		super(name);
		this.start();
	}
	public void run() {
		System.out.println(this.getName() + " running");
		
		for (int i=0; i<5; i++) {
			System.out.println(this.getName() + ": " + r.nextInt(0,100));
		}
		
	}
	

}
