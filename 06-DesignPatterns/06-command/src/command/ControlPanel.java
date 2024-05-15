package command;

public class ControlPanel {
	Command [] slots;
	Command undoCommand = null;
	
	public ControlPanel(Command [] slots) {
		this.slots = slots;
	}

	public void buttonWasPressed(int index){
		slots[index].execute();
		undoCommand = slots[index];
	}
	public void undo() {
		if (undoCommand!=null)
			undoCommand.undo();
	}

}
