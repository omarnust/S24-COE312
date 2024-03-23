

public class MoreComplexObserver extends ConcreteObserver implements Runnable {

	public MoreComplexObserver(ConcreteSubject[] subjects) {
		super(subjects);
		
		Thread t = new Thread(this);
		t.start();
	}

	private String speaking = "";
	private String time = "";
	private Object origin=null;
	
	@Override
	public synchronized void update(Message m) {		
		if(m.topic=="time") {		
			 time = m.payload;
			 origin = m.origin;
		}
		else if(m.topic == "speaking") {			
			speaking = m.payload;
		}
	}
	
	
	@Override
	public void run() {
		while(true) {
			try {
				speaking = "no";
				Thread.sleep(5000);		
				System.out.println("The last click from clock "+origin+" was at "+time);
				if(speaking=="no") {
					System.out.println("No one spoke during the last 5 seconds");
					
				} else {
					System.out.println("Someone spoke during the last 5 seconds");
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
