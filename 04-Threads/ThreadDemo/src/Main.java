
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ExtendThread m1 = new ExtendThread("Thread 1");
		//ExtendThread m2 = new ExtendThread("Thread 2");
		
		ImplementInterface m1 = new ImplementInterface("Thread 1");
		//ImplementInterface m2 = new ImplementInterface("Thread 2");
		
		//try {
			//m1.getThread().join();
			//m2.getThread().join();
		//}catch (InterruptedException e) {	
	    //}
				
		System.out.println("Main terminated");
	}

}
