package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Graph {

    int V;

    ArrayList<ArrayList<Integer>> adjList;

    Graph(int V)
    {
        this.V = V;

        adjList = new ArrayList<>();

        for(int i = 0; i < V; i++)
        {
            adjList.add(new ArrayList<>());
        }
    }

    void addEdge(int src, int dest)
    {
        adjList.get(src).add(dest);

        adjList.get(dest).add(src);
    }

    void BFS(int start)
    {
        boolean[] visited = new boolean[V];

        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;

        q.add(start);

        while(!q.isEmpty())
        {
            int curr = q.poll();

            System.out.print(curr + " ");

            for(Integer neighbour : adjList.get(curr))
            {
                if(!visited[neighbour])
                {
                    visited[neighbour] = true;

                    q.add(neighbour);
                }
            }
        }
    }

    void DFS(int curr, boolean[] visited)
    {
        visited[curr] = true;

        System.out.print(curr + " ");

        for(Integer neighbour : adjList.get(curr))
        {
            if(!visited[neighbour])
            {
                DFS(neighbour, visited);
            }
        }
    }
}

public class BFS_DFS_Traversal {

    public static void main(String[] args)
    {
        Graph g = new Graph(8);

        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(1,4);
        g.addEdge(2,5);

        System.out.println("BFS Traversal:");

        g.BFS(0);

        System.out.println();

        System.out.println("DFS Traversal:");

        boolean[] visited = new boolean[g.V];

        g.DFS(0, visited);
    }
}