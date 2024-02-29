package String;

import java.util.Arrays;

public class NumToArrayInString {

	public static void main(String[] args) {
		String str ="gf76ur7f756dcrd54xeard6";
		//int count = 0;
		char [] ch=str.toCharArray();
		String x= "";
		String y="";
		
		for(int i=0;i<ch.length; i++) {
			
			if(Character.isDigit(ch[i])) {
				
				x= x+ch[i];
				
			}else {
				y =y+ch[i];
			}
		}
		char[] xstr=x.toCharArray();
		char[] ystr=y.toCharArray();
		System.out.println(Arrays.toString(xstr));
		System.out.println(Arrays.toString(ystr));
	}
}
