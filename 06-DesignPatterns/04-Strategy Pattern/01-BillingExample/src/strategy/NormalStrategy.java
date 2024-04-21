package strategy;

public class NormalStrategy implements BillingStrategy{
	public double get_price(double raw_price) {
		System.out.println("Price: " + raw_price);
		return raw_price;
	}
}
