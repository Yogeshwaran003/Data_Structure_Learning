import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class graphinarraylist{
    static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

    graphinarraylist(int val){
        for(int i=0;i<val;i++){
            arr.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int v,int u){
        arr.get(u).add(v);
        arr.get(v).add(u);
    }

    public void display(){
        for(int i=0;i<arr.size();i++){
            System.out.print(i+"=>");
            for(int j=0;j<arr.get(i).size();j++){
                System.out.print(" "+arr.get(i).get(j)+" ");
            }
            System.out.println(" ");
        }
    }

    public static void BFS(int v){

        int n = arr.size();

        boolean[] visited = new boolean[n];

        Queue<Integer> q = new LinkedList<>();

        q.add(v);
        
        visited[v]=true;

        while(!q.isEmpty()){
            int value = q.remove();
            System.out.print(value+" ");
            for(int i=0;i<arr.get(value).size();i++){
                int check = arr.get(value).get(i);
                if(!visited[check]){
                    q.add(check);
                    visited[check]=true;
                }
            }
        }

    }
}

class Graph{
    public static void main(String[] args){
        
    System.out.println(" ");
    graphinarraylist graph = new graphinarraylist(5);

    graph.addEdge ( 0,  1);
    graph.addEdge ( 2,  3);
    graph.addEdge ( 1,  2);
    graph.addEdge ( 3,  4);
    graph.addEdge ( 0,  4);
    graph.addEdge ( 1,  4);
    graph.display();
    graph.BFS(0);
    }
}