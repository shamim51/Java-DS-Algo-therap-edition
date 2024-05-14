package data_structure.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph {
    protected final int v;
    protected List<List<Integer>> adjList;

    Graph(int v){
        this.v = v;
        adjList = new ArrayList<>(v);
        for(int i = 0; i < v; i++){
            adjList.add(new ArrayList<>());
        }
    }

    void addEdge(int v, int w){
        adjList.get(v).add(w);
        adjList.get(w).add(v);
    }

    void printGraph(){
        for(int i = 0; i < v; i++){
            System.out.print(+i+"->");
            for(int j = 0; j < adjList.get(i).size(); j++){
                System.out.print(" "+ adjList.get(i).get(j)+" ");
            }
            System.out.println("\n");

        }
    }

    void bfs(int startNode)
    {
        // Create a queue for BFS
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[v];

        // Mark the current node as visited and enqueue it
        visited[startNode] = true;
        queue.add(startNode);

        // Iterate over the queue
        while (!queue.isEmpty()) {
            // Dequeue a vertex from queue and print it
            int currentNode = queue.poll();
            System.out.print(currentNode + " ");

            // Get all adjacent vertices of the dequeued
            // vertex currentNode If an adjacent has not
            // been visited, then mark it visited and
            // enqueue it
            for (int neighbor : adjList.get(currentNode)) { //adjList[currentNode]
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }


    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        g.printGraph();

        g.bfs(0);


    }
}
