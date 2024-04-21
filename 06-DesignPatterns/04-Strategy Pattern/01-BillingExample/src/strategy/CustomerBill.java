package strategy;
import java.util.ArrayList;

public class CustomerBill {
	private BillingStrategy strategy;
	private ArrayList<Double> items = new ArrayList<Double>();
	
	CustomerBill(BillingStrategy strategy){
		this.strategy = strategy;
	}
	
	public void add(double price, int quantity) {
		items.add(strategy.get_price(price*quantity));
	}
	
	public void printRecipt() {
		double sum = 0;
		for (int i =0; i < items.size(); i++ ) {
			sum += items.get(i);
		}	
        System.out.println("Total due: " + sum);
        items.clear();
	}
	
	// Set Strategy
    public void setStrategy(BillingStrategy strategy) {
        this.strategy = strategy;
    }
}
