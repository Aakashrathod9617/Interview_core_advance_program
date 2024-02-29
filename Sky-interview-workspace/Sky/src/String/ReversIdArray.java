package String;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class ReversIdArray {
	public static void main(String[] args) {
		
		int [] a = {2,0 ,3 ,1 ,0};
		
		IntStream s = Arrays.stream(a);
		
		s.boxed().sorted(Collections.reverseOrder()).forEach(s1 -> System.out.println(s1));
		
		
	}

}
