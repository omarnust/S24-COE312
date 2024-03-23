public class Message {
	Object origin;
	String doorType;
	int payload;
	
	Message(Object origin, String doorLocaton, int payload){
		this.origin=origin;
		this.doorType=doorLocaton;
		this.payload=payload;
	}
	
	public String toString() {
		return "origin:"+origin+"\ntopic:"+doorType+"\npayload:"+payload;
	}
}