import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class jan102023 {
    
    // a)

    static <A> List<A> myFilter (Predicate<A> p, List<A> xs) {
        
        ArrayList<A> ret = new ArrayList<>();

        for(A elem : xs) {

            if(p.test(elem)) {

                ret.add(elem);
            }
        }

        return ret;
    }

    static  boolean isPrime(int num) {

        if( num <= 1) {
            return false;
        }
        for(int i=2;i<=num/2;i++) {

           if((num%i)==0)
               return  false;
       }
       return true;
    }
    

    // b)

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(0);
        list.add(1);
        list.add(-2);
        list.add(3); 
        ArrayList<Integer> ret = (ArrayList<Integer>) myFilter(x -> x >= 0, list);
        System.out.println(ret.toString());
        int b = IntStream.range(1000, 2000).filter(x -> isPrime(x)).sum();
    }
}
