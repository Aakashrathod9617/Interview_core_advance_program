package stream;

import java.util.Arrays;
import java.util.List;

public class OddNoFind {

	

	public static void main(String[] args) {

		List<Integer> n = Arrays.asList(1, 4, 8, 40, 11, 22, 33, 99,14);

		//n.stream().filter(e -> e % 2 != 0).forEach(System.out::println);
		n.stream().filter(e -> e%7==0).forEach(e -> System.out.println(e));

	}
}
