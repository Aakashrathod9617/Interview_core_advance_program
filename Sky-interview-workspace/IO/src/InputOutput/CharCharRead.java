package InputOutput;

import java.io.FileReader;
import java.io.FileWriter;

public class CharCharRead {
	public static void main(String[] args) throws Exception {

		FileReader reader = new FileReader("D:\\AR\\A1.txt");
		int a = reader.read();

		char c;
		while (a != -1) { // value of a is -1 until no more char is left in the text file
			c = (char) a;
			System.out.print(c);
			a = reader.read();
		}
		reader.close();
	}
	

}
