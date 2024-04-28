
public class FullThrottleState implements State{
	public void next(Spacecraft s) { 
		if (s.findMode(s.readings) >=5){
			s.setState(new HalfThrottleState());
			System.out.println("Transitioning to HalfThrottle");
		}
	}
	public void printStatus() {
		System.out.println("Engine on Full Throttle");
	}
}
