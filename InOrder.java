import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrder {
    static List<Integer> Inorder(Node last){
        if(last==null) return new ArrayList<>();
        List<Integer> inord=new ArrayList<>();
        inord.addAll(Inorder(last.left));
        inord.add(last.val);
        inord.addAll(Inorder(last.right));
        return inord;
    }

    static void InorderIterate(Node root){
        Stack<Node> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            if(stack.peek()!=null){
                stack.push(stack.peek().left);
            }
            else{
                stack.pop();
               if(!stack.isEmpty()){
                   Node temp=stack.pop();
                   System.out.print(temp.val+" ");
                   stack.push(temp.right);
               }
            }
        }
    }

    static void  Ksmallest(Node root){
        if(root==null) return;
        Ksmallest(root.left);
        System.out.println(root.val);
        Ksmallest(root.right);
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
        Ksmallest(root);
    }
}
