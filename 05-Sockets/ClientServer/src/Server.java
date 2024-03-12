import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataOutputStream;
import java.io.DataInputStream;

public class Server implements Runnable{
	private Thread t;
	ServerSocket myServer;
	
	Server(){
		t = new Thread(this);
		t.start();
	}
	
	public void run() {
		startServer();
	}
	
	
	public void startServer(){  
		
		try{  
			myServer = new ServerSocket(6666);  
			
			System.out.println("Listening for connection on 6666");
			
			while(true) {
				Socket s = myServer.accept();//establishes connection
				
				// create a new thread for communicating with this client
				System.out.println("Connection established");
		
				DataOutputStream dout = new DataOutputStream(s.getOutputStream());  
				//DataInputStream din = new DataInputStream(s.getInputStream());
				
				dout.writeUTF("Welcome");
					
			}
			
		}catch(Exception e){
			System.out.println(e);
		}  
	}  
}