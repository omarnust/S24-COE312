public class VendingMachine {
    private State currentState;
    boolean hasCoin;

    public VendingMachine() {
        currentState = new NoCoinState(); // Initial state is NoCoinState
        hasCoin = false;
    }

    public void setState(State state) {
        currentState = state;
    }
    
    public void insertCoin() {
    	hasCoin = true;
    }
    
    public void next() {
        currentState.next(this);
    }

    public void printStatus() {
        currentState.printStatus();
    }
}
