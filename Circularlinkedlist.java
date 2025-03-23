import java.util.Scanner;

class roundlinkedlist{
    Node head;
    Node tail;
    int size;
    class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        }
    }

    public void insetAtStart(int val){
        Node newnode = new Node(val);
        if(head==null){
            head=newnode;
            tail=newnode;
        }else{
            newnode.next=head;
            head=newnode;
            tail.next=head;
        }
        size++;
    }

    public void addinend(int val){
        if(head==null){
            insetAtStart(val);
            size++;
            return;
        }
        Node newnode = new Node(val);
        newnode.next=head;
        tail.next=newnode;
        tail=newnode;
        size++;
    }

    public void display(){
        Node temp=head;
        Node temp2=tail;
        System.out.println(" ");
        while(temp!=temp2){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println(temp.data+" ");
    }

    public void insert(int val,int pos){
        Node newnode = new Node(val);
        Node temp=head;
        if(pos==0){
            insetAtStart(val);
            size++;
            return;
        }
        if(pos==size){
            addinend(val);
            size++;
            return;
        }
        for(int i=0;i<pos-1;i++){
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        size++;
    }

    public void delete(int pos){
        if(pos==0){
            head=head.next;
            tail.next=head;
            size--;
            return;
        }
        if(pos==size-1){
            Node temp = head;
            while (temp.next!=tail) { 
                temp=temp.next;
            }
            tail=temp;
            tail.next=head;
            size--;
            return;
        }
        Node temp=head;
        for(int i=0;i<pos-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
    }
}

public class Circularlinkedlist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        roundlinkedlist list = new roundlinkedlist();
        list.insetAtStart(1);
        list.insetAtStart(2);
        list.insetAtStart(3);
        list.insetAtStart(4);
        list.addinend(100);
        list.insert(30, 3);
        list.delete(5);
        list.display();
        // list.reverse();
        list.display();
        System.out.println(" ");
        System.out.println(list.head==list.tail.next);
    }    
}
