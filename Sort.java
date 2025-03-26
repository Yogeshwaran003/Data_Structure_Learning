import java.util.Arrays;

class sortinarray{
    public static int[] selectionsort(int[] arr){
        int temp;
        for(int i=0;i<arr.length;i++){
            int min = arr[i];
            for(int j=i;j<arr.length;j++){
                if(min>arr[j]){
                    temp=arr[j];
                    arr[j]=min;
                    min=temp;
                }
            }
            arr[i]=min;
        }
        return arr;
    }

    public static int[] bubblesort(int[] arr){
        int temp;
        for(int i=0;i<arr.length;i++){
            boolean swap = false;
            for(int j=0;j<(arr.length-1)-i;j++){
                if(arr[j]>arr[j+1]){
                    swap=true;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(!swap){
                return arr;
            }
        }
        return arr;
    }

    public static int[] insertionsort(int[] arr){
        int temp;
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else{
                    break;
                }
            }
        }
            return arr;

    }
}

public class Sort {
    public static void main(String[] args){
        int[] arr = {9,3,4,5,0,3,1,0,8,1};
        System.out.println(" ");
        System.out.println(Arrays.toString(sortinarray.selectionsort(arr)));
        System.out.println(Arrays.toString(sortinarray.bubblesort(arr)));
        System.out.println(Arrays.toString(sortinarray.insertionsort(arr)));
    }
}