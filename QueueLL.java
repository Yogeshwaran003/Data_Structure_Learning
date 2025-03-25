class queueusinglinkedlist{
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        }

        public void enqueue(int val){
            Node newnode = new Node(val);
            if(head==null){
                head=newnode;
                tail=newnode;
            }else{
                tail.next=newnode;
                tail=newnode;
            }
        }

        public void Display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
            }
            System.out.println(" ");
        }

        public boolean isEmpty(){
            return head==null;
        }

        public int dequeue(){
            int temp = head.data;
            head=head.next;
            return temp;
        }
    }
}
public class QueueLL {
    public static void main(String[] args) {
        System.out.println(" ");
        queueusingarray list = new queueusingarray();
        list.enqueue(0);
        list.enqueue(1);
        list.enqueue(2);
        list.enqueue(3);
        list.enqueue(4);
        list.display();
        System.out.println(list.dequeue());
        System.out.println(list.dequeue());
        list.display();
        
    }    
}
