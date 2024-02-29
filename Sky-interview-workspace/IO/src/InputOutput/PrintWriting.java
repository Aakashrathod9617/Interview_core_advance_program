package InputOutput;

import java.io.FileWriter;
import java.io.PrintWriter;

//Program for writing in a text file using PrintWriter
public class PrintWriting {

	public static void main(String[] args) throws Exception {

		FileWriter w = new FileWriter("D:\\AR\\A1.txt");
		PrintWriter pw = new PrintWriter(w);

		for (int i = 0; i < 10; i++) {

			pw.println(" MR.SKY");
		}

		pw.close();
		w.close();

		System.out.println(" Check Your file in the desired folder");
	}
}
