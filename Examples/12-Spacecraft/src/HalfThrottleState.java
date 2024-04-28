
public class HalfThrottleState implements State{
	public void next(Spacecraft s) { 
		if (s.findMode(s.readings) <=5){
			s.setState(new FullThrottleState());
			System.out.println("Transitioning to FullThrottle " + "🚀");
		}
	}
	public void printStatus() {
		System.out.println("Engine on Half Throttle");
	}
}
