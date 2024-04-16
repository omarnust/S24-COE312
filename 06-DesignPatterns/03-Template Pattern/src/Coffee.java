public class Coffee extends Beverage {


	@Override
	void Brew() {
		// TODO Auto-generated method stub
		System.out.println("brew coffee");
	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Adding sugar and milk.");
	}
	
	protected boolean customerWantsCondiments() {
	    return false;
	}


}