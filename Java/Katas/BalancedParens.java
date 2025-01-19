import java.util.ArrayList;

public class BalancedParens {

    public static ArrayList <String> balancedParens (int n) {
        ArrayList<String> lst = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        dfs(sb,lst,0,0,n);
        return lst;
    }

    private static void dfs(StringBuilder sb, ArrayList<String> lst, int open, int close, int max) {
        if (close==max) {
            lst.add(sb.toString());
            return;
        }
        if (open>close)  {
            sb.append(')');
            dfs(sb,lst,open,close+1,max);
            sb.deleteCharAt(sb.length()-1);
        }
        if (open<max) {
            sb.append('(');
            dfs(sb,lst,open+1,close,max);
            sb.deleteCharAt(sb.length()-1);
        }
    }     
}