
import java.io.IOException;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.BufferedInputStream;


public class TransactionsRead {
	DataInputStream din;
	float totalDeposits;
	float totalWithdrawals;
	
	String wCustomerName;
	float wAmount;
	
	String dCustomerName;
	float dAmount;
	
	
	TransactionsRead(InputStream fin){
		din = new DataInputStream(new BufferedInputStream(fin));
		totalDeposits = 0;
		totalWithdrawals = 0;
		
		wAmount = 0;
		dAmount = 0;
		
	}
	
	public void doRead() {
		try {
			while (din.available() > 0) {
				readTransaction();
			}
			
			System.out.println("Total Deposits: " + totalDeposits);
			System.out.println("Total Withdrawals: " + totalWithdrawals);
			
			System.out.printf("Max Deposit: %s, Amount: %.2f\n", dCustomerName, dAmount);
			System.out.printf("Max Withdrawals: %s, Amount: %.2f\n", wCustomerName, wAmount);
			
			din.close();
			
		}catch(IOException e) {
			System.out.println(e);
		}
	}
	
	public void readTransaction() throws IOException{
		
			
		char transactionType = din.readChar();
		
		switch (transactionType) {
		case 'D':
			readDeposit();
			break;
		case 'W':
			readWithdrawal();
			break;
		}
		
	}
	
	private void readDeposit() throws IOException{
		String name = din.readUTF();
		float amount = din.readFloat();
		totalDeposits += amount; 	
		
		System.out.println("[Deposit -> " + "Name: "+ name + ", Amount: " + amount);
		
		if (amount > dAmount) {
			dAmount = amount;
			dCustomerName = name;
		}
	}
	
	private void readWithdrawal() throws IOException{
		String name = din.readUTF();
		float amount = din.readFloat();
		totalWithdrawals += amount;
		
		System.out.println("[Withdrawal -> " + "Name: "+ name + ", Amount: " + amount);
		if (amount > wAmount) {
			wAmount = amount;
			wCustomerName = name;
		}
	}
	
	
}
