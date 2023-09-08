public class Tree {
    static Node root;
    class Node{
       int key;
       Node left;
       Node right;
       public Node(int val){
           this.key=val;
           left=null;right=null;
       }
   }
   public void insertLeft(int val){
        Node temp=root;
        Node node=new Node(val);
        if(temp==null){
            temp=node;
            temp.key=val;
            System.out.println(temp.key);
            return;
        }
       temp.left=node;
       System.out.println(temp.key);
   }
}
