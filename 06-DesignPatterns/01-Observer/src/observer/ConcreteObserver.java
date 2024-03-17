package observer;
import java.util.Date;

public class ConcreteObserver implements Observer {

	private Subject subject;

	public ConcreteObserver(Subject subject) {
		this.subject = subject;
		subject.registerObserver(this);
	}

	// default update function
	public void update() {
		System.out.println("do nothing from " + this);
	}
	
	public void update(Date d) {
		System.out.println("do nothing from " + this+d);
	}
	
}