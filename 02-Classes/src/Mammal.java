public abstract class Mammal extends Animal{
	String name;
	
	/*A class does not directly inherit constructors from its superclass. 
	* However, when you create an object of a subclass, the default constructor 
	* of the superclass is implicitly called before the constructor of 
	* the subclass.
	* 
	* If the superclass has parameterized constructors, 
	* you need to explicitly call them using the super() keyword in the subclass 
	* constructor.
	* */
	
	Mammal(){
		
	}
	
	Mammal(int weight){
		super(weight); // calling parent class constructor
		 
	}
	
	Mammal(int weight, int num_legs){
		super(weight, num_legs); // calling parent class constructor
	}
	
	Mammal(int weight, String name){
		super(weight); // calling parent class constructor
		this.name = name;
		 
	}
	
	@Override
	public String sound() {
		return "This mammal makes sound";
	}
	
}