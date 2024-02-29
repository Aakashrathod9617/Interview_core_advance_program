package in.co.networking;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPClient {
	public static void main(String[] args) throws SocketException, Exception {
		 DatagramSocket socket= new DatagramSocket();
		 
		 byte[] buf= new byte[256];
		 InetAddress address= InetAddress.getByName("127.0.0.1");
		 
		 DatagramPacket packet= new DatagramPacket(buf, buf.length, address, 3355);
		 socket.send(packet);
		 packet = new DatagramPacket(buf, buf.length);
		 
		 socket.receive(packet);
		 
		 String received= new String(packet.getData());
		 System.out.println("Quote of the Moment: " + received); 
		 
		 System.out.println("Done");
		 socket.close();
		 
		 
	}

}
