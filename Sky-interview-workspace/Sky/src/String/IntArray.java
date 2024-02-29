package String;

import java.util.Arrays;

public class IntArray {

	public static void main(String[] args) {
		String str = "djeyugwdfudfswyjdukdgwug6151";
		int[] in = new int[str.length()];

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				in[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
				count++;
			}
		}
		for (int j : in) {
			if (j != 0) {
				System.out.println(j);
			}
		}

		/*
		 * public static void main(String[] args) { String str ="dj456151"; int[] in =
		 * new int[10];
		 * 
		 * int count =0;
		 * 
		 * for(int i=0; i<str.length();i++) { if (Character.isDigit(str.charAt(i))) {
		 * in[i]=Integer.parseInt(String.valueOf(str.charAt(i))); count++; } }
		 * System.out.println(Arrays.toString(in));
		 */
	}
}
