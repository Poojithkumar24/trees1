import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PostOrder {
    static List<Integer> postorder(Node t){
        if(t==null){
            return new ArrayList<>();
        }
        List<Integer> list=new ArrayList<>();
        list.addAll(postorder(t.left));
        list.addAll(postorder(t.right));
        list.add(t.val);
        return list;
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.right=new Node(5);
        root.left.left=new Node(4);
        root.right.left=new Node(6);
        root.right.left.right=new Node(8);
        root.right.right=new Node(7);
        List<Integer> l=postorder(root);
        System.out.println(l);
    }
}
