package InputOutput;

import java.io.FileWriter;

//Program for Write Characters in a text file 
public class FileWriting {

	public static void main(String[] args) throws Exception {

		FileWriter w = new FileWriter("D:\\AW\\A2.txt",true);

		char[] c = { 'S', 'K', 'Y',' ', 'W', 'O', 'R', 'L','D' };

//		w.write(c);
//		w.write(',');
//		w.write("Welcome ");
//		w.write(", To ");
		//w.write("Rathod");
		w.write(" sky");
		w.close();
		System.out.println("okyyy");
	}
}