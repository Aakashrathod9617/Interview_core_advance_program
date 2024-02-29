package InputOutput;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PrimitiveDataReadWrite {
	public static void main(String[] args) throws Exception {
		
		DataInputStream in= new DataInputStream(new FileInputStream("d:\\AR\\A1.txt"));
	
		int ch=in.read();
		char a;
		
		while(ch!=-1) {
		a =(char)ch;	
		System.out.println(a);
		ch=in.read();
		}
in.close();


DataOutputStream out= new DataOutputStream(new FileOutputStream("d:\\AR\\A1.txt" , true));




out.writeInt(3);
out.writeChar('l');
out.close();

	}
	


}
