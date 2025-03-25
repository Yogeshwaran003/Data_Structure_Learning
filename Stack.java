class stackinarray{
    int size=0;
    int capacity=8;
    int[] arr = new int[capacity];

    public void push(int val){
        if(size==capacity){
            capacity*=2;
            int[] temp = new int[capacity];
            System.arraycopy(arr, 0, temp, 0, size);
            arr=temp;
        }
        arr[size++]=val;
    }

    public void peek(){
        System.out.println(arr[size-1]);
    }

    public int pop(){
        int return_val = arr[size];
        arr[size--]=0;
        return return_val;

    }

    public boolean isEmpty(){
        return size==0;
    }

    public int size(){
        System.out.println(size);
        return size;
    }

    public void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}

class Stack{
    public static void main(String[] args){
        stackinarray list = new stackinarray();
        System.out.println("");
        list.push(0);
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.display();
        list.peek();
        list.pop();
        list.pop();
        list.display();
        list.peek();
        System.out.println(list.isEmpty());
        list.size();
    }
}