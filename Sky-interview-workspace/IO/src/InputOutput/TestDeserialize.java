package InputOutput;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestDeserialize {

	
	public static void main(String[] args) throws Exception {

		FileInputStream f = new FileInputStream("D:\\AW\\A2.txt");
		ObjectInputStream o = new ObjectInputStream(f);

		Marksheet m = (Marksheet) o.readObject();

		System.out.println("Name : " + m.getName());
		System.out.println("Maths : " + m.getMath());

		f.close();
		o.close();

		System.out.println("Task completed");
	}

}
