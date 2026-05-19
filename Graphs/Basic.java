package Graphs;

import java.util.ArrayList;

public class Basic {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
        graph.get(0).add(4);
        graph.get(1).add(0);
        graph.get(1).add(2);
        System.out.println(graph);

    }
}
