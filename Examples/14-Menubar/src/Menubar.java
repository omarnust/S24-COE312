import java.util.List;
import java.util.ArrayList;
public class Menubar {
	private List<Command> commandList = new ArrayList<Command>();
	Command undoCommand = null;
	
	
	public void addCommand(Command c){
		commandList.add(c);
	}
	public void executeCommand(int index){
		commandList.get(index).execute();
		undoCommand = commandList.get(index);
	}
	
	public void undo() {
		if(undoCommand!=null)    
			undoCommand.undo();
		else
			System.out.println("Nothing to Undo");
		undoCommand = null;
	}
	public void changeColor() {
		
	}

 }
