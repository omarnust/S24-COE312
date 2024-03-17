package observer;
import java.util.ArrayList;
import java.util.Date;

public class ConcreteSubject implements Subject {
	private ArrayList<Observer> observers;

	public ConcreteSubject() {
		observers = new ArrayList<Observer>();
	}

	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = observers.get(i);
			//observer.update();
			observer.update(new Date());
		}
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObsever(Observer o) {
		observers.remove(o);
	}
}