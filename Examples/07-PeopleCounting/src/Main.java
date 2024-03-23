
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		
		Counter c = Counter.getInstance();
		
		ArrayList<ConcreteSubject> subjects = new ArrayList<ConcreteSubject>();
		
		// Front doors
		for (int i=0; i<5; i++) {
			subjects.add( new FrontDoor() );
		}
		for (int i=0; i<5; i++) {
			subjects.add( new BackDoor() );
		}
		
		CentralObserver observer = new CentralObserver(subjects, c);
		
	}
}
