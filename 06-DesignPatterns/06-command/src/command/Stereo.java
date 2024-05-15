package command;

public class Stereo {
	public void on() {
		System.out.println(this+" stereo is on.");
	}
	public void settrack(String s) {
		System.out.println(this+" stereo is playing "+s);
	}
	public void setvolume(int i) {
		System.out.println(this+" stereo's volume is set to "+1);
	}
	public void off() {
		System.out.println(this+" stereo is off.");
	}
}
