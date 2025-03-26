import java.util.*;

class Graph {
    private final int numVertices;
    private final List<List<Integer>> adjLists;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        this.adjLists = new ArrayList<>(numVertices);
        for (int i = 0; i < numVertices; i++) {
            adjLists.add(new LinkedList<>());
        }
    }

    public void addEdge(int src, int dest) {
        adjLists.get(src).add(dest);
    }

    public void dfs(int startVertex) {
        boolean[] visited = new boolean[numVertices];
        dfsHelper(startVertex, visited);
    }

    private void dfsHelper(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");
        
        for (int neighbor : adjLists.get(vertex)) {
            if (!visited[neighbor]) {
                dfsHelper(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);

        System.out.println("DFS Traversal:");
        graph.dfs(0);
    }
}