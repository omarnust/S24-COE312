public class HasCoinState implements State {
    public void next(VendingMachine vendingMachine) {
        System.out.println("Transitioning from HasCoinState to DispensingState");
        vendingMachine.setState(new DispensingState());
    }

    public void printStatus() {
        System.out.println("Currently in HasCoinState");
    }
}