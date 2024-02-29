package stream;

import java.util.ArrayList;
import java.util.List;

public class EvenNoFind {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();

		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);

		l.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));

	}
}
