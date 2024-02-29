package InputOutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class FileMerge {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("D:\\AR\\A1.txt"));

		PrintWriter pw = new PrintWriter("D:\\AW\\A2.txt");

		String line = br.readLine();

		while (line != null) {
			pw.write(line);
			line = br.readLine();
		}
		br = new BufferedReader(new FileReader("D:\\AR\\A3.txt"));
		line = br.readLine();

		while (line != null) {
			pw.println(line);
			line = br.readLine();
		}
		pw.flush();

		br.close();
		pw.close();
		System.out.println("Check your folder");
	}
}
