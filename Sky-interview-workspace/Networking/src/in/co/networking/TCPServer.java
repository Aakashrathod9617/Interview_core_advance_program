package in.co.networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String[] args) throws Exception {
		
		ServerSocket server = new ServerSocket(1235);
		Socket client	=server.accept();
		
		DataInputStream in= new DataInputStream(client.getInputStream());
		DataOutputStream out= new DataOutputStream(client.getOutputStream());
			String s=in.readLine();
			out.writeBytes("Hello client\n");
			System.out.println("aakash rathod");
		server.close();
	}

}
