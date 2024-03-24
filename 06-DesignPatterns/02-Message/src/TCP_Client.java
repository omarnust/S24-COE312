
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class TCP_Client extends ConcreteSubject implements Runnable {
	String host;
	int port;

	int power_threshold = 20;
	
	JSONParser parser = new JSONParser();

	TCP_Client(String host, int port) {
		this.host = host;
		this.port = port;
		Thread t = new Thread(this);
		t.start();
	}

	void setThreshold(int power) {
		power_threshold = power;
	}
	@Override
	public void run() {
		try {
			Socket socket = new Socket(this.host, this.port);
			InputStream input = socket.getInputStream();
			InputStreamReader reader = new InputStreamReader(input);
			BufferedReader br = new BufferedReader(reader);
			String line = "";
			while ((line = br.readLine()) != null) {
				//System.out.println(line);
				
				JSONObject jsonObject = (JSONObject) parser.parse(line);
				String logS = (String) jsonObject.get("avAudioRecorderAveragePower");
				float power = Float.parseFloat(logS);
				//System.out.println(logS);
			
				if(Math.abs(power)  < power_threshold) {
					// send a message to who ever wants it 
					//System.out.println(logS);
					Message m = new Message(this, "speaking", "yes"); 
					publishMessage(m);
				}
			}
		} catch (UnknownHostException ex) {
			System.out.println("Server not found: " + ex.getMessage());
		} catch (IOException ex) {
			System.out.println("I/O error: " + ex.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}