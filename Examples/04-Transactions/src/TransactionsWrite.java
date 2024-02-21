
import java.io.IOException;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.io.BufferedOutputStream;


public class TransactionsWrite {
	DataOutputStream dout;
	
	TransactionsWrite(OutputStream fout){
		dout = new DataOutputStream(new BufferedOutputStream(fout));
		
	}
	
	public void doWrite() {
		try {
			writeDeposits("Sara", 150.5F);
			writeDeposits("Ali", 520.10F);
			writeDeposits("John", 300.20F);
			writeWithdrawals("Sara", 120.5F);
			writeDeposits("Omar", 200F);
			writeWithdrawals("Omar", 100F);
			writeWithdrawals("Ali", 50.10F);
			writeWithdrawals("John", 90.20F);

			
			dout.flush();
			dout.close();
		}catch(IOException e) {
			System.out.println(e);
		}
		
	}
	
	private void writeDeposits(String customerName, float depositAmount) throws IOException{
		dout.writeChar('D');
		dout.writeUTF(customerName);
		dout.writeFloat(depositAmount);
				
	}
	
	private void writeWithdrawals(String customerName, float withdrawalAmount) throws IOException{
		dout.writeChar('W');
		dout.writeUTF(customerName);
		dout.writeFloat(withdrawalAmount);		
	}
	
	
}
