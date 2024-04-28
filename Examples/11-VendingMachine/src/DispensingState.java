public class DispensingState implements State {
    public void next(VendingMachine vendingMachine) {
    	vendingMachine.hasCoin = false;
    	vendingMachine.setState(new NoCoinState());
        System.out.println("Transition from DispensingState to NoCointState");
    }

    public void printStatus() {
        System.out.println("Currently in DispensingState");
    }
}