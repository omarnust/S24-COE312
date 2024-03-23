import java.util.ArrayList;
import java.util.Random;

public class ConcreteSubject implements Subject {
	private ArrayList<Observer> observers;
	Random r = new Random();
	
	public ConcreteSubject() {
		observers = new ArrayList<Observer>();
	}
	public void notifyObservers() {
		int val = r.nextInt(100);
		System.out.println("Current Stock Value: " + val);
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = observers.get(i);
			observer.update(val);
		}
	}
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObsever(Observer o) {
		observers.remove(o);
	}
}