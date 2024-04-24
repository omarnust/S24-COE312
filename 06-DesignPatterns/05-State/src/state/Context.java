package state;

public class Context {
	 
    private State state = new OrderedState();
    
    //Context(State state){
    // 	this.state = state;
    //}
 
    public void nextState() {
        state.next(this);
    }
 
    public void printStatus() {
        state.printStatus();
    }

    public void setState(State  state) {
    	this.state = state;
    }
}
