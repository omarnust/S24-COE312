
public class TrafficSignal implements Runnable{
	int signal = 0;
	boolean pedestrian = false;
	public TrafficSignal(){
		 Thread t = new Thread(this);
		 t.start();
				 
	}
	// not using state design pattern
	public void nextState() {
		switch(signal) {
		case 0:
			System.out.println("Red Signal    🔴");
			break;
		case 1:
			System.out.println("Yellow Signal 🟡");
			break;
		case 2:
			System.out.println("Green Signal  🟢");
			break;
		}
		signal = ++signal % 3;
	}
	
	public void pedestrialCrossing() {
		pedestrian = true;
	}

	public void run() {
		while(true) {
			try {
				if(pedestrian) {
					signal = 0;
					pedestrian = false;
					System.out.println("Pedestrian turn🚶");
				}else {	
					nextState();
				}
				Thread.sleep(500);				
			}catch(InterruptedException e) {
				
			}		
		}
		
	}
	 
}
