package String;

public class Reverse {

	public static void main(String[] args) {

		
		  String s="aakash rathod";
		  
		  
		  for(int i=s.length()-1; i>=0; i--) {
		  
		  System.out.print(s.charAt(i));
		  
		  }
		  
		  System.out.println("");
		  
		  String s1="Aakash rathod"; 
		  String[] ch= s1.split(" ");
		  
		  for(int i=0; i<ch.length ; i++) { 
			  
			  for(int j=ch[i].length()-1; j>=0; j--) {
		  
		  System.out.print(ch[i].charAt(j)); }
		 
		  
		 }
		 
		
		

//		String[] a= {"Aakash Rathod"};
//		
//		for(String str:a) {
//		for(int i= str.length()-1; i>=0; i--) {
//			
//			System.out.print(str.charAt(i));
//		}
		}
		
		/*
		 * String a="Aakash Rathod";
		 * 
		 * for(int i= a.length()-1; i>=0; i--) {
		 * 
		 * System.out.print(a.charAt(i)); }
		 */		
//		System.out.println(" ");
//		
//		
//		String[] sk= {"Sky Rathod"};
//		
//		for(String str:sk) {
//			String[] ch=str.split(" ");
//		
//		
//		for(int i=0; i<ch.length ; i++) {
//			
//			for(int j=ch[i].length()-1; j>=0; j--) {
//				System.out.print(ch[i].charAt(j));
//			}
//		}}
		
		
		/*
		 * String sk="Sky Rathod"; String[] ch=sk.split(" ");
		 * 
		 * for(int i=0; i<ch.length ; i++) {
		 * 
		 * for(int j=ch[i].length()-1; j>=0; j--) { System.out.print(ch[i].charAt(j)); }
		 * }
		 */
	}


