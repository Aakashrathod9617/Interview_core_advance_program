package InputOutput;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {

	public static void main(String[] args) throws Exception {

		FileOutputStream file = new FileOutputStream("D:\\AW\\A2.txt");

		ObjectOutputStream out = new ObjectOutputStream(file);

		Marksheet m = new Marksheet();

		m.setName("neha");
		m.setMath(90);
		

		out.writeObject(m);
		file.close();
		out.close();
		System.out.println("Task completed write");
		
		
		
	}

}


