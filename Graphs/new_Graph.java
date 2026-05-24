package  Graphs;
import  java.util.ArrayList;
class Graph1{
    int V;
    ArrayList<ArrayList<Integer>> adjList;
    Graph1(int V){
         this.V = V;
         adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
    }
    void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
      //  adjList.get(dest).add(src); //remove this line if you creating a directed graph
    }
    void printGraph(){
        for (int i = 0; i < V; i++) {

            System.out.print(i + "->");
            for (Integer neighbour : adjList.get(i)) {
                System.out.print(neighbour+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Graph1 g = new Graph1(4);
        g.addEdge(0,1);
//        g.addEdge(0,5);
        g.addEdge(2,1);
        g.addEdge(2,3);
        g.addEdge(3,0);



        g.printGraph();

    }
}