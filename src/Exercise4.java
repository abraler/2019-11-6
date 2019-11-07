import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}
public class Exercise4 {


    public static void main(String[] args) {
        List<Node >list=new ArrayList<>();
        list.add(new Node(1));
        list.add(new Node(2));
        list.add(new Node(3));
        list.add(new Node(14));
        list.add(new Node(16));

        System.out.println(list.get(0).val);
        System.out.println(list.get(0).val);
        System.out.println(list.get(0).val);
    }
}
