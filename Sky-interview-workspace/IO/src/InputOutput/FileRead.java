package InputOutput;

import java.io.FileReader;

//This Program is for reading a text file and prints it at console
public class FileRead {

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

