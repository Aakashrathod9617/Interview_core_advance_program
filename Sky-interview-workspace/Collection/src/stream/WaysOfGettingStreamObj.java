package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class WaysOfGettingStreamObj {

	public static void main(String[] args) {

		// 1) Blank Stream

		Stream<Object> Empty = Stream.empty();

		Empty.forEach(e -> {

			System.out.println(e);
		});
		
		
		System.out.println("___________________________________________________");

		// 2) For Array, Object, Collection

		String n[] = { "Shashank", "Shekahr", "Pandey" };

		Stream<String> s1 = Stream.of(n);

		s1.forEach(a -> {

			System.out.println(a);
		});
		
		System.out.println("___________________________________________________");

		

		// 3) Builder method

		Stream<Object> streamBuilder = Stream.builder().build();
		
		System.out.println("___________________________________________________");


		// 4) Anonymous Array

		IntStream s2 = Arrays.stream(new int[] { 1, 2, 3, 4, 5 });

		s2.forEach(b -> {

			System.out.println(b);
		});
		
		System.out.println("___________________________________________________");


		// 5) Collections Object Like List , Set

		List<Integer> l2 = new ArrayList<>();

		l2.add(91);
		l2.add(97);
		l2.add(99);
		l2.add(89);

		Stream<Integer> s3 = l2.stream();

		s3.forEach(c -> {

			System.out.println(c);
		});

	}

}
