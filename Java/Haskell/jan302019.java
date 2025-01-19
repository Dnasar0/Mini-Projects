import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class jan302019 {
    
    static Stream<Integer> converter(Stream<Integer> s, Predicate<Integer> predicado, Function<Integer, Integer> b) {

        return s.map(x -> predicado.test(x) ? b.apply(x) : x);
    }

    public static void main(String[] args) {
        
        converter(Stream.of(-3, 3, -2, 2), (Integer x) -> x > 0, (Integer x) -> x * x).forEach(System.out::println);
    }

}
