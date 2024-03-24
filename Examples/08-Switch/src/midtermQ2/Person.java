package midtermQ2;

public class Person implements Runnable{
	private Thread t;
	private Switch s;
	
	Person(Switch s){
		this.s = s;
		t = new Thread(this);
		t.start();
	}
	
	public void run() {
		for (int i=0; i<5; i++) {
			synchronized(s) {
				s.click();
			}
		}
	}
	public Thread getThread() {
		return t;
	}
}



