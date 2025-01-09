package Graph.graph;
import java.util.ArrayList;
import java.util.List;

class Solution {
    private List<List<Integer>> graph;
    private int[] discoveryTime, low;
    private boolean[] visited;
    private int time;
    private List<List<Integer>> criticalConnections;

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        // Initialize variables
        graph = new ArrayList<>();
        discoveryTime = new int[n];
        low = new int[n];
        visited = new boolean[n];
        criticalConnections = new ArrayList<>();
        time = 0;

        // Build the graph (adjacency list)
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (List<Integer> connection : connections) {
            int u = connection.get(0);
            int v = connection.get(1);
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        // Run DFS to find bridges (critical connections)
        dfs(0, -1);

        return criticalConnections;
    }

    private void dfs(int node, int parent) {
        visited[node] = true;
        discoveryTime[node] = low[node] = time++;
        
        for (int neighbor : graph.get(node)) {
            if (neighbor == parent) continue; // Skip the parent node
            
            if (!visited[neighbor]) {
                dfs(neighbor, node);
                low[node] = Math.min(low[node], low[neighbor]);
                
               
                if (low[neighbor] > discoveryTime[node]) {
                    
                    criticalConnections.add(List.of(node, neighbor));
                }
            } else {
                // Update the low value
                low[node] = Math.min(low[node], discoveryTime[neighbor]);
            }
        }
    }
}
