package Graphs;

import java.util.ArrayList;

class graf{
    int V;
    ArrayList<ArrayList<Integer>> adjList;
    graf(int V){
        this.V = V;
        adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
    }
void addEdge(int src, int dest)
        {
            adjList.get(src).add(dest);
            adjList.get(dest).add(src);
        }
        void printGraph(){
            for (int i = 0; i < V; i++) {
                System.out.print(i + "->");
                for (Integer neigbour : adjList.get(i)) {
                    System.out.print(neigbour+" ");
                }
                System.out.println();
            }
        }
}
public class new_Graph {
}
