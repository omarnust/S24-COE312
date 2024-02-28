
public class Main {
	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo("MyThread 1");
		ThreadDemo t2 = new ThreadDemo("MyThread 2");
		
		RunnableDemo r1 = new RunnableDemo();
		
		Thread t3 = new Thread(r1);
		t3.start();
		
		
		System.out.println(Thread.currentThread().getName());
		
		
		try {
			t1.join();
			t2.join();
			t3.join();
		}catch (InterruptedException e) {
			System.err.println("interrupted exception");
		}
		
		
		System.out.println("Program is terminating");
	}
}
