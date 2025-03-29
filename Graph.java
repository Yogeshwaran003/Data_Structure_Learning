import java.util.ArrayList;

class graphinarraylist{
    ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

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
    
    }
}