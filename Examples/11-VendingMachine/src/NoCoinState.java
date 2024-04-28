public class NoCoinState implements State {
    public void next(VendingMachine vendingMachine) {
    	if(vendingMachine.hasCoin) {
    		vendingMachine.setState(new HasCoinState());
    		System.out.println("Transitioning from NoCoinState to HasCoinState");
    	}else {
    		System.out.println("Cannot transition from NoCoinState without inserting a coin.");
    	}
    }

    public void printStatus() {
        System.out.println("Currently in NoCoinState");
    }
}