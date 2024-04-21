package strategy;

public class Main {

	public static void main(String[] args) {

		
        CustomerBill firstCustomer = new CustomerBill(new NormalStrategy());

        // Normal billing
        firstCustomer.add(100, 1);

        // Start Discount Billing
        firstCustomer.setStrategy(new DiscountStrategy25p());
        firstCustomer.add(50, 1);

        // The Customer pays
        firstCustomer.printRecipt();
        
        // New Customer
        CustomerBill secondCustomer = new CustomerBill(new DiscountStrategy25p());
        secondCustomer.add(80, 1);
        
        // End Discount Billing
        secondCustomer.setStrategy(new NormalStrategy());
        secondCustomer.add(130, 2);
        secondCustomer.add(250, 1);
        secondCustomer.printRecipt();
    }

}
