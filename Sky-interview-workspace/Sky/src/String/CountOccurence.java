package String;

public class CountOccurence {
	
	public static void main(String[] args) {
		
		
		  String a1 = "AAKASH xxxRATHOD"; 
		  int count = 0;
		  String s =a1.toLowerCase();
		 
		 for (char a = 'a'; a <= 'z'; a++) { 
			 for (int i = 0; i < s.length(); i++) {
		  
		  if (s.charAt(i) == a) {
		  
		  count++;
		  
		  } }
		  
		  if (count != 0) {
			  System.out.print(a + "=" + count +",");
			  count = 0;
			  }
		  
		  }
		  
		  System.out.println(" ");
//		  
//		  String s1="Harshu Rathod"; int count1= 0;
//		  
//		  for(char i= 'a'; i <= 'z'; i++) {
//			  
//			  for(int j=0; j<s1.length(); j++) {
//		  
//		  if(s1.charAt(j)==i) { 
//			  count1++; 
//		  } 
//		  } if(count1 !=0) {
//			  System.out.print(i+"="+count1+" ,");
//			  count1=0; 
//			  }
//		  
//		  
//		 }
//		 
//		System.out.println("");
	//occurence in array
		
//		String[] s2= {"SsssssSkyyyyyy", "yathhfdv"};
//		int count2=0;
//
//		for(String str:s2) {
//			
//			String s3=str.toLowerCase();
//			for(char a='a'; a<='z'; a++) {
//							for(int b=0; b<s3.length(); b++) {
//				if(s3.charAt(b)==a) {
//					
//				count2++;
//				
//				}
//				
//			}	
//			if(count2>0) {
//			System.out.print(a +"="+count2 +",");	
//		    count2=0;	
//			}
//			}
//		}
//		
//		
	
	}
	

}
