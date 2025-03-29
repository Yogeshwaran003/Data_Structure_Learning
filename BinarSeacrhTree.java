// import java.util.*;
class binarytreesearch{
    Node root; 
    class Node{
        int key;
        Node right;
        Node left;
        Node(int val){
            key=val;
            right=null;
            left=null;
        }
    }

    binarytreesearch(int val){
        root=new Node(val);
    }

    public void insert(int val){
        insert(root,val);
    }

    public Node insert(Node tree,int val){
        if(tree==null){
            return new Node(val);
        }
        if(tree.key<val){
            tree.right=insert(tree.right, val);
        }else if(tree.key>val){
            tree.left=insert(tree.left,val);
        }

        return tree;
    }

    public void display(){
        display(root);
    }

    public void display(Node tree){
        Node temp=tree;
        if(temp==null){
            return;
        }
        System.out.print(temp.key+" ");
        display(temp.left);
        display(temp.right);
    }
   
}

public class BinarSeacrhTree {
    public static void main(String[] args){
        System.out.println(" ");
        binarytreesearch tree = new binarytreesearch(0);
        tree.insert(3);
        tree.insert(1);
        tree.insert(2);
        tree.display();
    }    
}
