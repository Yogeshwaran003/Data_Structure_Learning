import java.util.Scanner;
class dynamicArray{
    int capacity = 10;
    int[] arr = new int[capacity];
    int size=0;

    public void append(int val){
        if(size==capacity){
            capacity*=2;
            int[] temp = new int[capacity];
            System.arraycopy(arr, 0, temp, 0, size);
            arr=temp;
        }
        arr[size++]=val;
    }
    public void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public void insert(int val,int pos){
        if(size==capacity){
            capacity*=2;
            int[] temp = new int[capacity];
            System.arraycopy(arr, 0, temp, 0, size);
            arr=temp;
        }
        for(int i=arr.length-1;i>=pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos]=val;
        size++;
    }
    public void delete(int pos){
        for(int i = pos ;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        size--;
    }
}
class Array{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int val;
        int pos;
        dynamicArray list = new dynamicArray();
        while (true) { 
            System.err.println();
            System.err.println("------------------------------------Menu-------------------------------------");
            System.out.println("1. add");
            System.out.println("2. Insert");
            System.out.println("3. Delete");
            System.out.println("4. display");
            System.out.println("5. exit");
            System.out.println("=============================================================================");
            int order = in.nextInt();
            switch (order) {
                case 1 -> {
                    System.out.println("Enter the value to be added");
                    val=in.nextInt();
                    list.append(val);
                }
                case 2->{
                    val=in.nextInt();
                    pos = in.nextInt();
                    list.insert(val,pos);
                }
                case 3->{
                    pos = in.nextInt();
                    list.delete(pos);
                }
                case 4 -> list.display();
                case 5 -> System.exit(0);
                default -> throw new AssertionError();
            }
        }
    }
}