package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayFilter {
	
	public static void main(String[] args) {
		
		String[] s= {"One" , "Two","Three" , "Four",};
   Stream<String>st=Arrays.stream(s);
   st.map(e -> e.toUpperCase()).sorted().filter(e -> e.startsWith("T")).distinct().forEach(e -> System.out.println(e));
	}

}
