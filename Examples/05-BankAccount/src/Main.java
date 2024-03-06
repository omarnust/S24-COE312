public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BankAccount bankAccount = new BankAccount(1000);
        
		Transaction t1 = new Transaction(bankAccount);
		Transaction t2 = new Transaction(bankAccount);
         
        t1.getThread().join();
        t2.getThread().join();
        
        System.out.println("Final balance: " + bankAccount.getBalance());
		
		
		
	}
}
