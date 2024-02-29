package stream;

import java.util.stream.Stream;

public class RandomNo {
	
	public static void main(String[] args) {
		
		Stream.generate(Math::random).limit(5).forEach(s -> System.out.println(s*100));
		
		
	}

}
