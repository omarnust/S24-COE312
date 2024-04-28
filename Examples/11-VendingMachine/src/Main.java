
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.printStatus(); // Currently in NoCoinState

        vendingMachine.next(); // Cannot transition from NoCoinState without inserting a coin.
        
        vendingMachine.insertCoin(); // inserting coin
        
        vendingMachine.next();
        vendingMachine.printStatus(); 

        vendingMachine.next();
        vendingMachine.printStatus(); 
        
        vendingMachine.next();
        vendingMachine.next();
	}

}
