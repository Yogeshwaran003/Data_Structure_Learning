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
        display(temp.left);
        System.out.print(temp.key+" "); // yogi you have to print it inOrder to check if the tree is right NOTE => return if(tree is right) = return increase order else random order
        display(temp.right);
    }

    public boolean search(Node tree,int val){
        if(tree==null){
            return false;
        }
        if(tree.key==val){
            return true;
        }
        if(tree.key>val){
            return search(tree.left, val);
        }else{
            return search(tree.right, val);
        }
    }

    public Node delete(Node tree,int val){
        if(tree==null){
            return tree;
        }

        if(tree.key < val){
            tree.right = delete(tree.right, val);
        }else if(tree.key > val){
            tree.left = delete(tree.left, val);
        }else{
            if(tree.right==null){
                return tree.left;
            }else if(tree.left==null){
                return tree.right;
            }
            tree.key=min(tree.right);
            tree.right=delete(tree.right,tree.key);
        }
        return tree;
    }

    public int min(Node tree){
        int temp=tree.key;
        while(tree.left!=null){
            temp = tree.key;
            tree=tree.left;
        }
        return temp;
    }
   
}

public class BinarSeacrhTree {
    public static void main(String[] args){
        System.out.println(" ");
        binarytreesearch tree = new binarytreesearch(0);
        tree.insert(3);
        tree.insert(1);
        tree.insert(12);
        tree.insert(25);
        tree.insert(76);
        tree.insert(87);
        tree.insert(16);
        tree.insert(91);
        tree.display();
        System.out.println(tree.search(tree.root, 100));
        tree.delete(tree.root, 87);
        tree.display();
    }    
}
