import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class jan102020 {
    

    // a) V

    // b)

    static <T, R> R fold(BiFunction<R, T, R> funcao, R inicial, Collection<T> colecao) {

        List<T> lista = colecao.stream().collect(Collectors.toList());
        R ret = inicial;
        for (T element : lista) {

            ret = funcao.apply(ret, element);
        }
        return ret;
    }

    // c) 

    static <T> Collection<T> removeDuplicadosComFold(Collection<T> colecao) {

        return fold((x,t) -> {

                if (!x.contains(t)) {

                x.add(t);
                }        
            return x;}, new LinkedList<>(), colecao);
    }


    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 2, 3, 3,3, 1, 1);
        LinkedList<Integer> list = (LinkedList<Integer>) removeDuplicadosComFold(numeros);
        System.out.println(list);
    }
}
