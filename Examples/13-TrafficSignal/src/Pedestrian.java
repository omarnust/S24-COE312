
public class Pedestrian implements Command{
	TrafficSignal tf;
	
	public Pedestrian(TrafficSignal tf){
		this.tf = tf;
	}
	public void execute(){
		tf.pedestrialCrossing();
	}
	
}
