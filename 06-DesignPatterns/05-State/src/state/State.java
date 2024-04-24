package state;

public interface State {
	public void next(Context context);
	
	public void printStatus();
}
