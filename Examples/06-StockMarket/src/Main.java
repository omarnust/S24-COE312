public class Main {
	public static void main(String[] args) {
		AMZN A = new AMZN();  
		
		ConcreteSubject[] subjects = {A};
		StockAssistant1 sa = new StockAssistant1(subjects);
		StockAssistant2 sb = new StockAssistant2(subjects);	
	}
}
