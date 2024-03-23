

public class UIClient extends ConcreteObserver{
	ConcreteSubject[] subject;

	public UIClient(ConcreteSubject[] subject) {
		super(subject);
		// TODO Auto-generated constructor stub
		this.subject = subject;
	}
	

}
