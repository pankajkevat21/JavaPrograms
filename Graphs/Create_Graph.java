package Graphs;
import java.util.ArrayList;
class Graphs {
    int V;
    ArrayList<ArrayList<Integer>> adjList;
    Graphs(int V) {
        this.V = V;
        adjList = new ArrayList<>();
        adjList = new ArrayList<>();
        // Empty lists add karo
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
    }
    // Edge add karne ka method
    void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }
    // Graph print
    void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            for (Integer node : adjList.get(i)) {
                System.out.print(node + " ");
            }

            System.out.println();
        }
    }
}
public class Create_Graph {
    public static void main(String[] args) {
        Graphs g = new Graphs(5);
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.printGraph();
    }
}