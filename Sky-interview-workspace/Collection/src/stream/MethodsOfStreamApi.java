package stream;

import java.util.List;
import java.util.stream.Collectors;

public class MethodsOfStreamApi {
	

	public static void main(String[] args) {

		// 1) Filter

		List<String> n = List.of("Shashank", "Shekhar", "khailesh", "Ahanti");

		List<String> n1 = n.stream().filter(a -> a.startsWith("S")).collect(Collectors.toList());

		System.out.println(n1);

		// 2) Map

		List<Integer> a = List.of(2, 8, 9, 6, 4);

		List<Integer> a1 = a.stream().map(b -> b * b).collect(Collectors.toList());

		System.out.println(a1);

		// 3) ForEach

		n.stream().forEach( // Basic Stream Data Traversing

				c -> {

					System.out.println(c);
				});

		n1.stream().forEach(System.out::println); // Here Function Reference Is Working

		// 4) Sorted

		a.stream().sorted().forEach(System.out::println);

		// 5) Min

		Integer f = a.stream().min((d, e) -> d.compareTo(e)).get();

		System.out.println(f);

		// 6)Max

		Integer g = a.stream().max((s, t) -> s.compareTo(t)).get();

		System.out.println(g);

	}

}
