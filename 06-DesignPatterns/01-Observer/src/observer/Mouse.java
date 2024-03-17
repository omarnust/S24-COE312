package observer;
import java.util.Date;

public class Mouse extends ConcreteObserver {

public Mouse(Subject subject) {
	super(subject);
}

public void update(Date d) {
	System.out.println(this+"is a happy mouse"+d);
}
}
