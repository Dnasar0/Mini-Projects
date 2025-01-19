import java.util.function.Function;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class jan112019 {

    public static void main(String[] args) {
        
        Function<Double, Double> f = x -> - x * x + 2;
        double inicio = -2;
        double fim = 2;
        double inc = 0.0001;
        double maxF = Stream.iterate(inicio, n -> n + inc).limit((int) fim).map(n -> f.apply(n)).reduce(Math::min).get();
        System.out.println(maxF);
    }
}