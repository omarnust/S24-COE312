import java.util.Random;

public class ThreadDemo extends Thread{
	Random r = new Random();
	int n = 0;
	
	ThreadDemo(String name, int n){
		super(name);
		this.n = n;
		this.start();
	}
	public void run() {
		System.out.println(this.getName() + " running");
		
		for (int i=0; i<n; i++) {
			System.out.println(this.getName() + ": " + r.nextInt(0,100));
		}
		
	}
	

}
