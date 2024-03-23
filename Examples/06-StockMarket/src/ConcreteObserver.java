public class ConcreteObserver implements Observer {
	
	ConcreteSubject [] subject = null;

	public ConcreteObserver(ConcreteSubject [] subject) {
		
		this.subject = subject;
	
		for(int i = 0; i<subject.length; i++) {
			subject[i].registerObserver(this);
		}

	}
	@Override
	public synchronized void update(int sharePrice) {
		System.out.println("Do nothing");	
	}
}