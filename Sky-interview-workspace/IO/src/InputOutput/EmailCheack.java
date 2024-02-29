package InputOutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EmailCheack {
	public static void main(String[] args) throws IOException{
		 FileReader r1= new FileReader("D:\\Email.txt");
		 BufferedReader b1= new BufferedReader(r1);
		 FileWriter w1= new  FileWriter("D:\\Email1.txt");
		 
		 String ch= b1.readLine();
		 
		 String s ="^ [a-zA-Z0-9._%+-]+@ [a-zA-Z0-9.-]+. [a-zA-Z] {2,}$";
		 while(ch !=null) {
			 System.out.println(ch);
			 if(ch.matches(s)) {
				 w1.write(ch);
				 System.out.println(ch);
			 }
			 ch=b1.readLine();
		 }
		 r1.close();
		 w1.close();
		 b1.close();
		 
	}

}
