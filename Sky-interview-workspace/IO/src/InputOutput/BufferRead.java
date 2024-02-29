package InputOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

//This Program is for Reading the Data using BufferedReader Class

public class BufferRead {
	public static void main(String[] args) throws Exception {
		
		FileReader f = new FileReader("D:\\AR\\A1.txt");
		BufferedReader br = new BufferedReader(f);
		
		
		// read method will read single character
		int ch=br.read();
		System.out.println(ch);
		
		// readline method will read complete line

		String line = br.readLine();
		while(line !=null) {
			
			System.out.println(line);
			line = br.readLine();
		}
		f.close();
		br.close();
		
		
		
		FileWriter fw= new FileWriter("D:\\AW\\A2.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		
		String s="aakash";
		
		bw.write(s);
		bw.close();
		fw.close();
		
	}

}
