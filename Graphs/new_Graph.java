package Graphs;

import java.util.ArrayList;

public class new_Graph {
    int V;
    ArrayList<ArrayList<Integer>> adjList;

    new_Graph(int V) {
        this.V = V;
        adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }

    void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print(i + "->");
            for (Integer neigbour : adjList.get(i)) {
                System.out.print(neigbour + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        new_Graph g = new new_Graph(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);

        g.printGraph();
    }
}
