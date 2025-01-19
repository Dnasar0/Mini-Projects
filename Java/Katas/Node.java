import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

public class Node {

    public Node left;
    public Node right;
    public int value;
    
    public Node(Node l, Node r, int v) {
        left = l;
        right = r;
        value = v;
    }
    

    public static List<Integer> treeByLevels(Node node) {
        
        if (node == null) return Collections.emptyList();    
        List<Integer> res = new ArrayList<>();    
    
        //breadth-first search
        Queue<Node> nodesToVisit = new ArrayDeque(); //ArrayDeque is better than LinkedList if no removing in between is involved
        nodesToVisit.offer(node);
        
        Node current;
        while ((current = nodesToVisit.poll()) != null) {
            res.add(current.value);
            if (current.left != null) nodesToVisit.offer(current.left);
            if (current.right != null) nodesToVisit.offer(current.right);
        }  
        
        return res;
    }

    public static void main(String[] args) {
        
        Node tree = new Node(new Node(null, new Node(null, null, 4), 2), new Node(new Node(null, null, 5), new Node(null, null, 6), 3), 1);
        System.out.println(treeByLevels(tree));
    }
}

