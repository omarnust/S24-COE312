public class Cat extends Mammal implements Pet{
	
	public void walk() {
		System.out.println("Cat is walking");
	}
	public void play() {
		System.out.println("Cat is playing");
	}
	
	@Override
	public String sound() {
		return "meow";
	}
}