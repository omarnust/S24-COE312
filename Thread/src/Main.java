
public class Main {
	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo("MyThread 1", 5);
		ThreadDemo t2 = new ThreadDemo("MyThread 2", 20);

		
		//RunnableDemo r1 = new RunnableDemo();
		
		//t1.start();
		//t2.start();
		
		
		System.out.println("Main is running in thread: " + Thread.currentThread().getName());
		
		
		try {
			t1.join();
			//t2.join();
		
		}catch (InterruptedException e) {
			System.err.println("interrupted exception");
		}
		
		System.out.println("Program is terminating");
	}
}
