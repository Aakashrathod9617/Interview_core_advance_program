package InputOutput;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

//Program for read data from keyboard and write into a text file 
public class ReadFromKeyboard {

	public static void main(String[] args) throws Exception {

		PrintWriter pw = new PrintWriter(new FileWriter("D:\\AR\\A3.txt"));
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String line = br.readLine();

		while (!line.equals("quit")) {
			pw.write(line);
			line = br.readLine();
		}
		
		br.close();
		pw.close();
		is.close();
		
		System.out.println(" Check your file");

	}
}
