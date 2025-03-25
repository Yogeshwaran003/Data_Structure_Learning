class queueusingarray{
    int size=0;
    int capacity=8;
    int[] arr = new int[capacity];
    
    public void enqueue(int val){
        arr[size++]=val;   
    }

    public int dequeue(){
        int return_val=arr[0];
        for(int i = 0 ; i<size-1;i++){
            arr[i]=arr[i+1];
        }
        return return_val;
    }

    public void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    
}

public class Queue {
    public static void main(String[] args){
        System.out.println(" ");
        queueusingarray list = new queueusingarray();
        list.enqueue(0);
        list.enqueue(1);
        list.enqueue(2);
        list.enqueue(3);
        list.enqueue(4);
        list.enqueue(5);
        list.enqueue(6);
        list.display();
        System.out.println(list.dequeue());
        System.out.println(list.dequeue());
    }    
}
