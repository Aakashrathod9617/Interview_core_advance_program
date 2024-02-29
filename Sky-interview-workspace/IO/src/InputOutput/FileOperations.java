package InputOutput;

import java.io.File;

public class FileOperations {

	public static void main(String[] args) {

		File f = new File("D:\\AR");

		String[] s = f.list();

		for (String s1 : s) {

			System.out.println(s1);
		}
}
}
