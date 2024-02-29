package InputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;

//Program to read and write binary data means Image type files 
public class BinaryReadWrite {

	public static void main(String[] args) throws Exception {

		FileInputStream file = new FileInputStream("D:\\AR\\a.png");
		FileOutputStream out = new FileOutputStream("D:\\AW\\b.png");

		int ch = file.read();

		while (ch != -1) {

			out.write(ch);
			ch = file.read();
			
		}
		System.out.println("oky");

		out.close();
		file.close();
	}
}