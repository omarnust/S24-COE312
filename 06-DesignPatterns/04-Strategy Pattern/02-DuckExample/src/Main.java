public class Main {

	public static void main(String[] args) {
		
		 MallardDuck d = new MallardDuck();
		 d.performFly();
		 
		 // this duck gets shot
		 d.setFlyBehavior(new flyNoWay());
		 d.performFly();
		 
		 RubberDuck rd = new RubberDuck();
		 rd.setFlyBehavior(null);
		 rd.setQuackBehavior(new Quack());
		 
		 rd.
		

	}
}
