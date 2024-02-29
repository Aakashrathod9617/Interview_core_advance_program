package in.co.networking;

import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLWrite {
	
	public static void main(String[] args) throws Exception {
		
		URL url= new URL("http://www.ask.com/web");
		
		String question= "java";
		URLConnection conn= url.openConnection();
		
		conn.setDoOutput(true);
		OutputStreamWriter out= new OutputStreamWriter(conn.getOutputStream());
		out.write("q=" + question);
	System.out.println("done");
	out.close();
	
	System.out.println("ok ");
	}

}
