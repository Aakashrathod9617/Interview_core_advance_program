package in.co.networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPServer {
	public static void main(String[] args) throws IOException {
		
		String[] s= {"Bura Mat Dekho" , "Bura Mat Suno"};
		DatagramSocket socket= new DatagramSocket(3355);
		
		byte[] buf= new byte[256];
		
		DatagramPacket packet= new DatagramPacket(buf, buf.length);
		boolean flag= true;
		while(flag) {
			socket.receive(packet);
			
			InetAddress address= packet.getAddress();
			
			int port=packet.getPort();
			
			int ind= (int) (Math.random() * 2);
			
			byte[] quote =  s[ind].getBytes();
			
			DatagramPacket quotePkt= new DatagramPacket(quote, quote.length,address, port);
			
			socket.send(quotePkt);
			
			System.out.println("start Server");
			
			
		}
	
	socket.close();
	}

}
