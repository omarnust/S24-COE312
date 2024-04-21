public class MallardDuck extends Duck {
	MallardDuck() {
		flyB = new flyWithWings();
		QuB = new Quack();
	}

	public void Display() {
		System.out.println("I am a real Mallard Duck.");
	}
}
