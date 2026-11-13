import java.util.*;
public class CompleteBinaryTree {
    public static boolean Complete(Node root){
        if(root==null){
            return true;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        boolean nullfound=false;
        while(!q.isEmpty()){
            Node curr=q.poll();
            if(curr==null){
                nullfound=true;
            }
            else{
                if(nullfound){
                    return false;
                }
                q.add(curr.left);
                q.add(curr.right);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(50);
        root.left.right=new Node(60);
        root.right.left=new Node(70);
        root.right.right=new Node(80);
        System.out.println(Complete(root));
    }
}
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
