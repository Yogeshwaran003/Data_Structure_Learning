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

    public void display(Node root){
        Node temp = root;
        if(temp==null){
            return;
        }
        System.out.print(temp.data+" ");
        display(temp.left);
        display(temp.right);
        // System.out.println("");
    }

}

class Tree{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        treesturcture tree = new treesturcture(12);
        tree.insertLeft(tree.root, 18);
        tree.insertRight(tree.root, 24);
        tree.insertLeft(tree.root.left, 30);
        tree.insertRight(tree.root.left, 36);
        tree.insertLeft(tree.root.right, 42);
        tree.insertRight(tree.root.right, 48);
        tree.display(tree.root);
    }
}