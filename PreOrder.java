
import java.util.*;
public class PreOrder {

    static List<Integer> traverse(Node last, List<Integer> list){
        if(last==null) return list;
        list.add(last.val);
        traverse(last.left,list);
        traverse(last.right,list);
        return list;
    }

    static void traverse2(Node root){
        if(root==null){
            return;
        }
        Stack<Node> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node temp=stack.pop();
            System.out.print(temp.val+" ");
            if(temp.right!=null) stack.push(temp.right);
            if(temp.left!=null) stack.push(temp.left);
        }
    }
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.right=new Node(5);
        root.left.left=new Node(4);
        root.right.left=new Node(6);
        root.right.left.right=new Node(8);
        root.right.right=new Node(7);
        List<Integer> l=traverse(root,new ArrayList<>());
        System.out.println(l);
        traverse2(root);
    }

}
class Node{
    int val;
    Node left=null;
    Node right=null;
    public Node(int val){
        this.val=val;
    }
}
