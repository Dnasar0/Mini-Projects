import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class jan182016 {

        static <T, R> R foldl(BiFunction<R, T, R> funcao, R zero, List<T> lista) {

            R ret = zero; 

            for (T elem : lista) {
                ret = funcao.apply(ret, elem);
            }
            return ret;
        }

        static <T> T maximo(Comparator<T> comparador, List<T> lista) {

            return foldl((x,acc) -> {
                if (comparador.compare(x, acc) > 0) {
                    return x;
                } else {
                    return acc;
                }
            }, lista.get(0), lista);
        }

        static <T> List<T> filter(Predicate<T> predicado, List<T> lista) {

            return foldl((x,acc) -> {
                if(predicado.test(acc)) {
                    x.add(acc);
                }
                return x;
            }, new ArrayList<>(), lista);
        }

        public static void main(String[] args) {
            
            ArrayList<Integer> a = new ArrayList<>();
            a.add(1);
            a.add(2);
            a.add(3);
            System.out.println(filter(x -> (x > 1) , a));
        }
}