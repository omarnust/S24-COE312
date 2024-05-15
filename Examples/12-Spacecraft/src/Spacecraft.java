
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Spacecraft implements Observer, Runnable{
	public ArrayList<Integer> readings = new ArrayList<Integer>();
	
	State state;
	
	public Spacecraft(){
		state = new HalfThrottleState();
		Thread t = new Thread(this);
		t.start();
	}
	
	@Override
	public synchronized void update(int num) {
		readings.add(num);
		if (readings.size() > 10) {
            readings.remove(0);
        }
	}
	
	public void run() {
		while(true) {
			if(readings.size() == 10) {
				//System.out.println(readings.toString());
				System.out.println("Engine Power: " + this.findMode(readings));
				nextState();
				state.printStatus();
			}
			try {
				Thread.sleep(5000);		
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void nextState() {
		state.next(this);
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public int findMode(ArrayList<Integer> numbers) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int number : numbers) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        int mode = 0;
        int maxFrequency = 0;

        // Find the element with the highest frequency
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int frequency = entry.getValue();
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mode = entry.getKey();
            }
        }

        return mode;
    }

}
