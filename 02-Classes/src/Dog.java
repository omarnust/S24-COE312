public class Dog extends Mammal implements Pet{
	
	// Without a constructor explicity createdOnly default constructor exists.
	
	
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