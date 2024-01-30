public class Car {
	public String make;
	public String model;
	public int year;
	public String color;
	
	// Note: You do not need to provide the default constructor. Compiler will create one for you.
	// However, if you provide any explicit constructor then the compiler
	// will not create a default constructor for you.
	// default constructor
	public Car() {
		make = "Toyota";
		model = "Camry";
		year = 2010;
		color = "White";
	}
	// constructor: method to initialize the object
	public Car(String make, String model, int year, String color) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
	}
	
	public String aboutCar() {
		return make + " " + model + " " + year + " Color " + color;
	}
	
	static void applyBreak() {
		System.out.println("Applying breaks");
	}
}