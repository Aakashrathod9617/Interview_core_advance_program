package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortById {
	
	public static void main(String[] args) {
		
//		int [] a = {1,0,2,7,0 ,3 ,1 ,0,0};
//		
//		IntStream s = Arrays.stream(a);
//		
//		s.boxed().sorted(Collections.reverseOrder()).forEach(s1 -> System.out.println(s1));
//		
//		
		
int [] a = {1,0,2,7,0 ,3 ,1 ,0,0};
		
		IntStream s = Arrays.stream(a);
		
	Integer[]s1	=s.boxed().sorted(Collections.reverseOrder()).toArray(Integer[] :: new);
	
	System.out.println(Arrays.toString(s1));
		
	
	

		
		
	}

}
