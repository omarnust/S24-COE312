public class StockAssistant2 extends ConcreteObserver implements Runnable {
	private int currentStockValue = 50; // assuming initial stock price
	int sell = 0; // do nothing
	int up = 1; // assuming upward trend to start with
	
	public StockAssistant2(ConcreteSubject[] subjects) {
		super(subjects);
		
		Thread t = new Thread(this);
		t.start();
	}

	@Override
	public synchronized void update(int sharePrice) {
		if (sharePrice > currentStockValue && up == 1) {
			sell = 1; //sell
		}else if (sharePrice > currentStockValue && up == -1) {
			sell = 0; // do nothing
			up = 1; // price moving up
		}else if (sharePrice < currentStockValue && up == 1) {
			sell = 0; // do nothing
			up = -1; // price moving down
		}else if (sharePrice < currentStockValue && up == -1) {
			sell = -1; // buy
		}else if(sharePrice == currentStockValue) {
			sell = 0;
			
		}
		
		currentStockValue = sharePrice;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(5000);		
				
				if (sell == 1) {
					System.out.println(this + " Sell the stocks");
				}else if(sell == -1){
					System.out.println(this + " Buy the stocks");
				}else if(sell == 0){
					System.out.println(this + " Do nothing");
				}
				
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
