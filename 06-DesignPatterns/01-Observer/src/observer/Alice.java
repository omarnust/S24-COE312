package observer;
import java.util.Date;
import java.util.Random;

public class Alice extends ConcreteObserver {
	Random r = new Random();

	public Alice(Subject subject) {
		super(subject);
	}

	public void update(Date d) {

		if (r.nextInt(100) % 10 == 0)
			System.out.println("Alice says, Oh it is so late on " + d);
	}
}