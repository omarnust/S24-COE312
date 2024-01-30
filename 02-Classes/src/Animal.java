// abstract class. The class can not be used to create objects
// To access an abstract class, it must be inherited from another class.
// The class can contain abstract method
// If a class contains abstract method, then it needs to be an abstract class
public abstract class Animal {
	int weight;
	Leg[] legs;
	
	Animal(){
		
	}
	Animal(int weight){
		this.weight = weight;
	}
	Animal(int weight, int num_legs){
		this.weight = weight;
		legs = new Leg[num_legs];
		
		for(int i=0; i < num_legs; i++) {
			legs[i] = new Leg();
		}
		
	}
	
	public void about() {
		System.out.println(this + "with sound " + sound());
	}
	
	public abstract String sound();
}