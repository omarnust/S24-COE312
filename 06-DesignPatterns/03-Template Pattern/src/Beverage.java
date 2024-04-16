public abstract class Beverage { 

	  Beverage(){
		  
	  }
	  
	// final makes sure that no one can change 
	// the structure of the recipe. 
	// still need 4 steps etc. 
	
	// --  ENFORCES THE RECIPE 
	  
	final  void prepareRecipe() {
		boilWater();
		Brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}
	
	protected void boilWater() {
		System.out.println("Boil water.");
	}
	protected void pourInCup() {
		System.out.println("Pouring into cup.");
	}
	
	// adding a hook
	protected boolean customerWantsCondiments() {
		    return true;
	}
	
	// giving choice to the children to implement their 
	// own versions of Brew and addCondiments. 
	
	//  -- GIVES US FLEXIBILITY 
	
	abstract void Brew();
	abstract void addCondiments();
	
	

}
