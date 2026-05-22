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
}
public class new_Graph {
}
