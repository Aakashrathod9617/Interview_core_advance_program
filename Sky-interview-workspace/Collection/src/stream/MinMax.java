package stream;

import java.util.Arrays;
import java.util.List;

public class MinMax {
	public static void main(String[] args) {
		
	List<Integer> list=Arrays.asList(1,2,3,4,5);
	
	Integer integer=list.stream().max(Integer::compare).get();
	Integer integer1=list.stream().min(Integer::compare).get();
	System.out.println(integer);
	System.out.println(integer1);

	}

}
