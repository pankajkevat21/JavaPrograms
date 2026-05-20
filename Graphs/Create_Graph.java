package Graphs;
import java.util.ArrayList;
class Graphs{
    int V;
    ArrayList<ArrayList<Integer>> adjList;
    Graphs(int V){
        this.V =V;
        adjList = new ArrayList<>();
        for (int i = 0; i <V ; i++) {
            {
                adjList.add(new ArrayList<>());
            }

        }
    }
    // Edge add karne ka method
    void addEdge(char src, char dest) {
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
        System.out.println("I am creating a new branch and working in together");
        Graphs g = new Graphs(8);
        g.addEdge('A', 'B');
        g.addEdge('A', 'C');
        g.addEdge('B', 'D');
        g.addEdge('B', 'E');
        g.addEdge('C', 'F');
        g.addEdge('C', 'E');
        g.addEdge('D', 'G');
        g.addEdge('I', 'G');
        g.addEdge('I', 'H');
        g.addEdge('H', 'F');
        g.addEdge('G', 'E');
        g.addEdge('E', 'H');




       
        g.printGraph();
    }
}