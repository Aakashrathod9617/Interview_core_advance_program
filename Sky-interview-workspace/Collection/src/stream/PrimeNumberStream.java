package stream;

import java.util.stream.IntStream;

public class PrimeNumberStream {

    public static boolean isPrime(int number) {
        return number > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(number)).noneMatch(i -> number % i == 0);
    }

    public static void main(String[] args) {
        int upperLimit = 50; // You can change this limit as needed

        System.out.println("Prime numbers up to " + upperLimit + ":");

        // Using Java Stream to filter prime numbers
        IntStream.rangeClosed(2, upperLimit)
                .filter(PrimeNumberStream::isPrime)
                .forEach(System.out::println);
    }
}