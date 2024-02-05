// An interface is a completely "abstract class" 
// that is used to group related methods with empty bodies: 
// It can be a way around for multiple inheritance. A class can implement multiple interfaces

public interface Pet {
	
	// all variables in an interface are implicitly public, 
	// static, and final, making them constants.
	int a = 10;
	
	public void walk(); // interfaces have functions with no body
	public void play(); // interfaces have functions with no body
}

