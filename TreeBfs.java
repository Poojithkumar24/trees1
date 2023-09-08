import java.util.LinkedList;
import java.util.*;
public class TreeBfs {
    static  void bfs(Node root){
        Queue<Node> queue=new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node tempNode= queue.poll();
            System.out.print(tempNode.val+" ");
            if(tempNode.left!=null) queue.add(tempNode.left);
            if(tempNode.right!=null) queue.add(tempNode.right);
        }
    }
    static  List<Double> levelAvg(Node root){
        List<Double> avg=new ArrayList<>();
        Queue<Node> queue=new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size= queue.size();
            double sum=0,count=0;
            for(int i=0;i< size;i++) {
                Node tempNode = queue.poll();
                sum=sum+ tempNode.val;
                count++;
                if (tempNode.left != null) queue.add(tempNode.left);
                if (tempNode.right != null) queue.add(tempNode.right);
            }
            avg.add((double)sum/count);
        }
        return avg;
    }


    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.right=new Node(5);
        root.left.left=new Node(4);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
      /*  Node root=new Node(3);
        root.left=new Node(9);
        root.right=new Node(20);
        root.right.left=new Node(15);
        root.right.right=new Node(7);*/

    }
}
