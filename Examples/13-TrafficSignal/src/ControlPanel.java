import java.util.List;
import java.util.ArrayList;
public class ControlPanel implements Runnable{
	private List<Command> commandList = new ArrayList<Command>();
	int count  = 0;
	
	public ControlPanel() {
		Thread t = new Thread(this);
		t.start();
	}
	public void addCommand(Command c){
		commandList.add(c);
	}
	public void executeCommand(int index){
		if (count > 1) {
			commandList.get(index).execute();
			count = 0;
		}	
	}
	
	public void run() {
		while(true) {
			try {
				if (count<3) {
					count +=1;
					Thread.sleep(3000);
				}else {
					count = 0;
					commandList.get(0).execute();
				}
				
			}catch(InterruptedException e) {
				
			}
			
		}
	}
 }