package strategy;

public class DiscountStrategy50p implements BillingStrategy{
	public double get_price(double raw_price) {
		System.out.println("Price: " + raw_price + 
		           ", Discounted Price: " + raw_price*0.50);
		return raw_price * 0.50;
	}
}
