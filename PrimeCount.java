import java.util.stream.IntStream;

public class PrimeCount {

    public static void main(String[] args) {
        int start = 1;
        int end = 10;

        long count = IntStream.rangeClosed(start, end)
                .filter(PrimeCount::isPrime)
                .count();

        System.out.println("Number of primes: " + count);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(n))
                .allMatch(i -> n % i != 0);
    }
}