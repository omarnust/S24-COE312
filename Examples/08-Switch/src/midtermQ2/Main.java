package midtermQ2;

public class Main {
	
	public static void main(String[] args) throws Exception{
				
		Switch s = new Switch();
		
		Person person1 = new Person(s);
		Person person2 = new Person(s);
		
		person1.getThread().join();
		person2.getThread().join();
	}

}
