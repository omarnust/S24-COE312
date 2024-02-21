import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			//FileOutputStream fout = new FileOutputStream("Transactions.txt");
			//TransactionsWrite twrite = new TransactionsWrite(fout);
			//twrite.doWrite();
			
			
			FileInputStream fin = new FileInputStream("Transactions.txt");
			TransactionsRead tread = new TransactionsRead(fin);
			tread.doRead();
			
		
		}catch(IOException e) {			
			
		}
		
	}

}
