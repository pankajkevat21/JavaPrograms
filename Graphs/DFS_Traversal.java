package Graphs;

public class DFS_Traversal extends BFS_Traversal {
    public void DFS(int curr, boolean[] visited) {
          visited[curr] = true;
           System.out.print(curr+ " ");
           for(Integer neighbour: adjList.get(curr))
           {
                if(!visited[neighbour])
                {
                     DFS(neighbour,visited);
                }
           }
    }
}
