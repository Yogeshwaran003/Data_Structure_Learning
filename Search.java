import java.util.*;
class Searcharray{

    public static int find(int[] arr,int val){

        for(int i = 0;i<arr.length;i++){

            if(arr[i]==val){

                return i;
            
            }

        }

        return -1;
    
    }

    public static int[] find(int[][] arr , int val){
        for(int i=0 ; i<arr.length;i++){

            for(int j=0;j<arr[i].length;j++){

                if(arr[i][j]==val){

                    return new int[] {i,j};
                
                }
            
            }
        
        }
        
        return new int[] {-1,-1};
    
    }

    public static boolean contains(int[][] arr , int val){
    
        for(int i=0 ; i<arr.length;i++){
    
            for(int j=0;j<arr[i].length;j++){
    
                if(arr[i][j]==val){
    
                    return true;
    
                }
    
            }
    
        }
    
        return false;
    
    }

    public static boolean  contains(int[] arr,int val){

        for(int i = 0;i<arr.length;i++){

            if(arr[i]==val){

                return true;

            }

        }

        return false;

    }

    public static int find(String s,int val){

        for(int i = 0;i<s.length();i++){

            if(s.charAt(i)==val){

                return i;

            }

        }

        return -1;

    }

    public static boolean contains(String s,int val){

        for(int i = 0;i<s.length();i++){

            if(s.charAt(i)==val){

                return true;

            }

        }

        return false;

    }
    
    public static int findB(int[] arr , int val){
        int start=0;
        int end = arr.length-1;
        boolean asc = false;
        if(arr[start] < arr[end]){
            asc = true;
        }
        while(start<=end){
            int mid = (start+end)/2;
            if(asc){
                if(val>arr[mid]){
                    start=mid+1;
                }else if (val<arr[mid]){
                    end=mid-1;
                }else{
                    return mid;
                }
            }else{
                if(val>arr[mid]){
                    end=mid-1;
                }else if(val<arr[mid]){
                    start = mid+1;
                }else{
                    return mid;
                }
            }
        }
        return -1;
    }
}

class Search{
    public static void main(String[] args){
        int[] arr = {9,8,7,6,5,4,3,2,1};
        int[][] arr1 = {{1,2},{3,4},{5,6},{7,8,9}};
        System.out.println(" ");
        System.out.println(Searcharray.find(arr, 6));
        System.out.println(Searcharray.contains(arr, 6));
        System.out.println(Searcharray.find("Hello", 'l'));
        System.out.println(Searcharray.contains("Hello", 'l'));
        System.out.println(Arrays.toString(Searcharray.find(arr1,6)));
        System.out.println(Searcharray.findB(arr, 7));
    }
}