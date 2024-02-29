package in.co.networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
	public static void main(String[] args) throws Exception {
		
		Socket client=new Socket("127.0.0.1",1235);
		 
		DataInputStream in= new DataInputStream(client.getInputStream());
		
		DataOutputStream out= new DataOutputStream(client.getOutputStream());
		
		out.writeBytes("Hello Server\n");
	String s =	in.readLine();
	
	System.out.println("done");
	
	client.close();
	}

}
