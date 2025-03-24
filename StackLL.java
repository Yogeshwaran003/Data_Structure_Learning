class StackinLinkedlist{
    Node head;
    Node tail;
    int size;
    class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
            size++;
        }
    }

    public void push(int val){
        Node newnode = new Node(val);
        if(head==null){
            head=newnode;
            tail=newnode;
        }else{
            tail.next=newnode;
            tail=newnode;
        }
    }

    public void peek(){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        System.out.println(temp.data);
    }

    public void pop(){
        Node temp = head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        tail=temp;
        tail.next=null;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("");
    }

    public int size(){
        return size;
    }

}

public class StackLL {
    public static void main(String[] args) {
        System.out.println(" ");
        StackinLinkedlist list = new StackinLinkedlist();
        list.push(0);
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.display();
        System.out.println(list.size());
        list.peek();
        list.pop();
        list.peek();
        System.out.println(list.isEmpty());
    }    
}
