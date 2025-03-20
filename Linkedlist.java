import java.util.Scanner;
class connectedlist{
    int size;
    Node head;
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
            size++;
        }else{
            newnode.next=head;
            head=newnode;
            size++;
        }
    }

    public void show(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public void insert(int val,int pos){
        Node newnode = new Node(val);
        if(pos==0){
            newnode.next=head;
            head=newnode;
            size++;
            return;
        }
        if(size==pos){
            addinend(val);
        }
        Node temp = head;
        for(int i = 0 ; i<pos-1;i++){
            temp=temp.next;
        }
        if(temp.next==null || temp.next.next == null){
            temp.next=newnode;
            size++;
            return;
        }
        newnode.next=temp.next.next;
        temp.next=newnode;
        size++;

    }

    public void addinend(int val){
        Node newNode = new Node(val);
        if(head==null){
            head=newNode;
            size++;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        size++;
    }

    public void Delete(int pos){
        if(pos==0){
            head=head.next;
            return;
        }
        Node temp = head;
        if(pos==size){
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
            size--;
            return;
        }

        for(int i=0;i<pos-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;

    }
    public void replace(int val,int pos){
        Node temp = head;
        for(int i = 0 ; i<pos;i++){
            temp=temp.next;
        }
        temp.data=val;
    }
}
class Linkedlist {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("");
        connectedlist list = new connectedlist();
        list.insetAtStart(10);
        list.insetAtStart(11);
        list.insetAtStart(13);
        list.addinend(14);
        list.addinend(15);
        list.addinend(16);
        list.insert(100, 6);
        list.Delete(6);
        list.insert(101, 6);
        list.replace(99, 3);
        list.show();
      } 
}
