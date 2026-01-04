import java.util.stream.IntStream;
import java.util.Optional;

public class FunctionalArrayAccess {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int index = 2;   
        Optional<Integer> element = IntStream.range(0, arr.length)
                                             .filter(i -> i == index)
                                             .mapToObj(i -> arr[i])
                                             .findFirst();
        element.ifPresentOrElse(
            System.out::println,
            () -> System.out.println("Index out of bounds")
        );
    }
}
