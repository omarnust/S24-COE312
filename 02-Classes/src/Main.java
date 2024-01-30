
/*
 * Object-oriented programming (OOP) is a computer programming model 
 * based on the concept of objects, which can contain data and code,
 * Procedural programming is about writing procedures or methods that 
 * perform operations on the data 
 * 
 * topics:
 * classes/objects
 * attributes
 * methods:
	 * static vs public attributes and methods
	 * static methods and attributes can be accessed without creating
	 * the object
	 * public methods and attributes on the other hand can only be
	 * accessed via objects 
 * constructors: Constructors in Java are special methods that are used for initializing objects. 
 *               They have the same name as the class and do not have a return type, not even void. 
 * modifiers:
 *  access modifier: used to set the access level for classes, attributes, methods
	 * For classes we can either have public or default
	 * public: class is accessible for any class
	 * default: class is only accessible by classes in the same package
	 * static: only for nested classes
	 * 
	 * For methods, attributes, constructors you can have following modifiers
	 * public: code is accessible from all classes
	 * private: code is accessible from within class
	 * default: code is accessible from same package
	 * protected: code is accessible from same package and subclasses
 *	non access modifiers:
	 * For classes:
	 * final: class cannot be inherited
	 * abstract: The class can not be used to create objects
	 * To access an abstract class, it must be inherited from another class.
	 * 
	 * For attributes and methods:
	 * final: Attributes and methods cannot be overridden/modified
	 * static: Attributes and methods belongs to the class, rather than an object
	 * abstract: Can only be used in an abstract class, and can only be used on methods
 * encapsulation
 *  Data encapsulation:
	 * make sure that "sensitive" data is hidden from users. 
	 * To achieve this, you must:
	 * declare class variables/attributes as private provide 
	 * set public get and set methods to access and update the value 
	 * of a private variable
	 * 
	 * Why?
	 * -Better control of class attributes and methods
	 * -Class attributes can be made read-only (if you only use 
	 * the get method), or write-only (if you only use 
	 * the set method)
	 * -Flexible: the programmer can change one part of the 
	 * code without affecting other parts 
	 * -Increased security of data
 * Java packages & API: A package in Java is used to group related classes
 	* Built-in packages
 		* import package.name.class; // import a class e.g import java.util.Scanner 
 		*                               java.util is package name and scanner is the class
 		* import package.name.*;   // import whole package 
 	* user-defined packages: use package keyword check out -> https://www.w3schools.com/JAVA/java_packages.asp
 * Inheritance	
 * Polymorphism
 * Abstraction	 
 * Error checking
 * Input
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar = new Car();
		System.out.println(myCar.color);
				
		// modify the attributes
		myCar.color = "Red";
		System.out.println(myCar.color);		
		// use final keyword if you don't want to override the existing values
		
		Car myNewCar = new Car("Audi", "Q5", 2022, "blue");
		System.out.println(myNewCar.aboutCar());
		
		// using Scanner 
		try {
			Scanner input = new Scanner(System.in);
			System.out.println("Make");
			String make = input.nextLine();
			System.out.println("Model");
			String model = input.nextLine();
			System.out.println("Year");
			while (!input.hasNextInt()) {
				System.out.println("Enter a valid Year");
			    input.next();
			}
			int year = input.nextInt();
			input.nextLine();
			System.out.println("Color");
			String color = input.nextLine();
			Car myNewCar2 = new Car(make, model, year, color);
			System.out.println(myNewCar2.aboutCar());
			
		}catch(Exception e) {
			
		}
		
		
		//Cat myCat = new Cat();
		//Dog myDog = new Dog();
		
		//myCat.about();
		//myDog.about();
	}

}
