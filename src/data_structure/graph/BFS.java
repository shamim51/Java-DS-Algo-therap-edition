package data_structure.graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFS extends Graph{
    BFS(int v) {
        super(v);
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
            for (int neighbor : adjList.get(currentNode)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new BFS(5);

        g.addEdge(1, 2);
        g.addEdge(1, 4);
        g.addEdge(3, 2);
        g.addEdge(4, 3);
        g.addEdge(0, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        g.printGraph();

        g.bfs(0);
    }
}
