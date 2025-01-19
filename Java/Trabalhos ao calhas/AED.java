public class AED {
    
    public static int occurences(int[] v, int n) {
        return occurences(v, n, 0, 0);
    }

    private static int occurences(int[] v, int n, int occurences, int index) {
        if(index < v.length) {
            if(v[index] == n)
                occurences++; 
            return occurences(v,n,occurences,index+1);
        }
        return occurences;
    }

    public static void main(String[] args) {
        
        int[] v = {1,2,3,4,5,6,7,3,2,4,6,7,2,1};
        System.out.println(occurences(v,1));
    }
}
