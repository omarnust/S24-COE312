public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrafficSignal tf = new TrafficSignal();
		
		Command pd = new Pedestrian(tf);
		ControlPanel cp = new ControlPanel();
		cp.addCommand(pd);
		
		try {
			Thread.sleep(5000);
			System.out.println("Pedestrian on the road");
			cp.executeCommand(0); // pedestrian manually pressed the button
			
			Thread.sleep(100);
			System.out.println("Pedestrian on the road");
			cp.executeCommand(0);// pedestrian manually pressed the button
			
		}catch(InterruptedException e) {		
		}			
	}
}