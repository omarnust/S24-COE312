public abstract class Mammal extends Animal{
	String name;
	
	Mammal(){
		
	}
	
	Mammal(int weight){
		super(weight); // calling parent class constructor
	}
	
	Mammal(int weight, int num_legs){
		super(weight, num_legs); // calling parent class constructor
	}
	
	@Override
	public String sound() {
		return "This mammal makes sound";
	}

}