import java.util.Scanner;

class treesturcture{
    Node root;
    class Node{
        int data;
        Node right;
        Node left;
        Node(int val){
            data=val;
            right=null;
            left=null;

        }
    }

    treesturcture(int val){
        root = new Node(val);
    }

    public void insertLeft(Node node , int val){
        Node newnode = new Node(val);
        node.left=newnode;
    } 
    public void insertRight(Node node , int val){
        Node newnode = new Node(val);
        node.right=newnode;
    } 

    public void preorder(Node root){
        Node temp = root;
        if(temp==null){
            return;
        }
        System.out.print(temp.data+" ");
        preorder(temp.left);
        preorder(temp.right);
    }
    public void inorder(Node root){
        Node temp = root;
        if(temp==null){
            return;
        }
        inorder(temp.left);
        System.out.print(temp.data+" ");
        inorder(temp.right);
    }
    public void postorder(Node root){
        Node temp = root;
        if(temp==null){
            return;
        }
        postorder(temp.left);
        postorder(temp.right);
        System.out.print(temp.data+" ");
    }    
}

class Tree{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println(" ");
        treesturcture tree = new treesturcture(12);
        tree.insertLeft(tree.root, 18);
        tree.insertRight(tree.root, 24);
        tree.insertLeft(tree.root.left, 30);
        tree.insertRight(tree.root.left, 36);
        tree.insertLeft(tree.root.right, 42);
        tree.insertRight(tree.root.right, 48);
        tree.preorder(tree.root);
        System.out.println(" ");
        tree.inorder(tree.root);
        System.out.println(" ");
        tree.postorder(tree.root);
    }
}