import java.util.stream.Stream;

public class NthFibonacciFP {
    public static void main(String[] args) {
        int n = 10;
        int fib = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                        .limit(n + 1)
                        .reduce((first, second) -> second)
                        .get()[0];
        System.out.println("F(" + n + ") = " + fib);
    }
}
