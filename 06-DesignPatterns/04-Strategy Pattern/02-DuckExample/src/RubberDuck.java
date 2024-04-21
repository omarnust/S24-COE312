public class RubberDuck extends Duck {
	RubberDuck() {
		flyB = new flyNoWay();
		QuB = new MuteQuack();
	}

	public void Display() {
		System.out.println("I am a real Rubber Duck.");
	}
}
