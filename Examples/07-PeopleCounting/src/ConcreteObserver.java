import java.util.ArrayList;

public class ConcreteObserver implements Observer {

	ArrayList<ConcreteSubject> subjects = null;
	Counter counter;

	public ConcreteObserver(ArrayList<ConcreteSubject> subjects) {
		this.subjects = subjects;
		for(int i = 0; i<subjects.size(); i++) {
			subjects.get(i).registerObserver(this);
		}

	}

	@Override
	public synchronized void update(Message m) {
		
		
	}
	
}