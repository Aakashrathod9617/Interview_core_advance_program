package stream;



import java.util.ArrayList;
import java.util.Collections;

public class FindingDuplicate {

	public static void main(String[] args) {

		ArrayList<String> l = new ArrayList<>();

		l.add("a");
		l.add("a");
		l.add("n");

		l.stream().filter(e -> Collections.frequency(l, e) > 1).distinct().forEach(e -> System.out.println(e));
	}}
