import java.util.*;

class Graph {
    private int V; // Number of vertices
    private LinkedList<Integer>[] adjacencyList; // Adjacency list representation

    // Constructor to initialize the graph with a given number of vertices
    Graph(int vertices) {
        V = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; ++i) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    // Method to add an edge between two vertices
    void addEdge(int v, int w) {
        adjacencyList[v].add(w); // Add w to v's list
        adjacencyList[w].add(v); // Add v to w's list (for undirected graph)
    }

    // Method to perform a depth-first traversal (DFS) starting from a given vertex
    void DFS(int v) {
        boolean[] visited = new boolean[V]; // Mark all vertices as not visited
        DFSUtil(v, visited);
    }

    // Recursive utility function for DFS
    private void DFSUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " "); // Print the current vertex

        // Recur for all the adjacent vertices of the current vertex
        for (Integer neighbor : adjacencyList[v]) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }
}

public class GraphExample {
    public static void main(String[] args) {
        // Create a graph with 5 vertices
        Graph graph = new Graph(5);

        // Add edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        System.out.println("Depth-First Traversal (starting from vertex 0):");
        graph.DFS(0);
    }
}

