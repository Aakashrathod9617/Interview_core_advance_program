package InputOutput;

import java.io.File;

//Here In this Program we will read an information of a file and Prints at  Console
public class MethodsOfFile {

	public static void main(String[] args) {

		File f = new File("D:\\AR\\A1.txt");

		if (f.exists()) {

			System.out.println("Name:" + f.getName());
			System.out.println(f.getAbsolutePath());
			System.out.println(f.canWrite());
			System.out.println(f.canRead());
			System.out.println(f.isFile());
			System.out.println(f.isDirectory());

		}
	}
}
