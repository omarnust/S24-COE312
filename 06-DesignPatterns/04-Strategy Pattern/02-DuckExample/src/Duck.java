public abstract class Duck {
	flyBehavior flyB;
	QuackBehavior QuB;

	public Duck() {
	}

	public abstract void Display();

	public void performFly() {
		flyB.fly();
	}

	public void performQuack() {
		QuB.quack();
	}

	public void Swim() {
		System.out.println("All the ducks float");
	}

	public void setFlyBehavior(flyBehavior fb) {
		flyB = fb;
	}

	public void setQuackBehavior(QuackBehavior qb) {
		QuB = qb;
	}

}
