public class Dog extends Mammal implements Pet{
	
	public void walk() {
		System.out.println("Dog is walking");
	}
	public void play() {
		System.out.println("Dog is playing");
	}
	
	@Override
	public String sound() {
		return "bark";
	}
}