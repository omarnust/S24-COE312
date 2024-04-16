
public class Main {

	public static void main(String[] args) {
		TCP_Client phone = new TCP_Client("10.25.140.164", 59949); // to start the server
		
		Clock c1 = new Clock(1);
		Clock c2 = new Clock(5);
		//Clock c3 = new Clock(10);		
		ConcreteSubject[] subjects = {phone,c1, c2};// c3};
		
		// Uncomment one of the following observer
		//SimpleObserver o1 = new SimpleObserver(subjects);	
		//ComplexObserver o2 = new ComplexObserver(subjects);		
	    
		MoreComplexObserver o3 = new MoreComplexObserver(subjects);
		
		
		
		//UI ui = new UI();
		//ConcreteSubject[] subjects = {ui};
		
		//UIClient c1 = new UIClient(subjects);
		//UIClient c2 = new UIClient(subjects);
		//ui.UIWrite("Hello from the UI Subject");

	}

}
