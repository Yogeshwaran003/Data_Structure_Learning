import java.util.Scanner;

class twoconlist{
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int val){
            data=val;
            next=null;
            prev=null;
        }
    }

    public void insetAtStart(int val){
        Node newnode = new Node(val);
        if(head==null){
            head=newnode;
            tail=newnode;
        }else{
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
        }
    }

    public void display(){
        Node temp=head;
        System.out.println("");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    
    public void displayR(){
        Node temp = tail;
        System.out.println("");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
    }

    public void insert(int val,int pos){
        Node newnode = new Node(val);
        if(pos==0){
            insetAtStart(val);
            return;
        }
        Node temp=head;
        for(int i=0;i<pos-1;i++){
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next.prev=newnode;
        newnode.prev=temp;
        temp.next=newnode;
    }
    public void Delete(int pos){
        if(pos==0){
            head=head.next;
            head.prev=null;
            return;
        }
        Node temp=head;
        for(int i=0;i<pos-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        temp.next.prev=temp;
    }
    public void addinend(int val){
        Node newnode = new Node(val);
        tail.next=newnode;
        newnode.prev=tail;
        tail=newnode;
    }

    public void replace(int val,int pos){
        Node temp=head;
        for(int i=0;i<pos;i++){
            temp=temp.next;
        }
        temp.data=val;
    }
}

class DoublyLinkedlist{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        twoconlist list = new twoconlist();
        list.insetAtStart(11);
        list.insetAtStart(12);
        list.insetAtStart(13);
        list.insetAtStart(14);
        list.insetAtStart(15);
        list.insetAtStart(16);
        list.insert(100, 4);
        list.Delete(4);
        list.addinend(100);
        list.replace(101, 3);
        list.display();
        list.displayR();
    } 
}