public class StockAssistant1 extends ConcreteObserver implements Runnable {
	private int currentStockValue = 50;
	boolean sell = false;
	
	
	public StockAssistant1(ConcreteSubject[] subjects) {
		super(subjects);
		
		Thread t = new Thread(this);
		t.start();
	}

	@Override
	public synchronized void update(int sharePrice) {
		sell = sharePrice > currentStockValue? true: false;
		currentStockValue = sharePrice;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(5000);		
				
				if (sell) {
					System.out.println(this + " Sell the stocks");
				}else {
					System.out.println(this + " Buy the stocks");
				}
				
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
