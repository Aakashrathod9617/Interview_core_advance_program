package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

//1.Takes phone number,
//2. filter valid phone numbers,
//3. remove duplicate,
//4. shuffle phone numbers,
//5. get three winner,
//6. display winner

public class TestContestant {

	public static void main(String[] args) {

		ArrayList<Contestant> l = new ArrayList<>();

		l.add(new Contestant("A", "9912345678"));
		l.add(new Contestant("B", "9912342222"));
		l.add(new Contestant("C", "9912345770"));
		l.add(new Contestant("D", "9912345678"));
		l.add(new Contestant("E", "9912345888"));
		l.add(new Contestant("F", "9912345111"));
		l.add(new Contestant("G", "11"));

		System.out.println("Winners !!");

		l.stream().map(e -> e.phoneno).filter(e -> e.length() == 10).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(3).forEach(e -> System.out.println(e));

	}

}
