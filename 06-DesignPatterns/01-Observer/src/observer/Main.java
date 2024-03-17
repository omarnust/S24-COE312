package observer;

public class Main {

	public static void main(String[] args) {
		
		Clock c1 = new Clock();
		Mouse m1 = new Mouse(c1);
		Mouse m2 = new Mouse(c1);
		Mouse m3 = new Mouse(c1);

		// add alice to the mix
		//Alice a = new Alice(c1);
		AliceSingle b = AliceSingle.getInstance(c1);
		
	}

}
