package in.co.networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class URLRead {
	public static void main(String[] args) throws IOException {
		 URL u = new URL("http://www.sunilos.com.8080/Home");
		 
		 System.out.println("Protocol: " + u.getProtocol());
		 System.out.println("Host Name: "+ u.getHost());
		 System.out.println("Port Number: "+ u.getPort());
		 System.out.println("File Name: "+ u.getFile());
	 
		 InputStream istr= u.openStream();
		 
		 Scanner in= new Scanner(istr);
		 
		 while(in.hasNext()) {
			 String html = in.nextLine();
			 System.out.println(html);
		 
		 }
		 in.close();
	}

}
