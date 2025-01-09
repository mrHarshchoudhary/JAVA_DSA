package Graph.graph;

import java.util.ArrayList;
import java.util.*;

public class topologicalsort {

    static class Edge {
        int src;
        int dest;

        // int wt;
        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
            // this.wt=w;
        }
    }

    public static void creategraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }
public static void topsort( ArrayList<Edge> graph[],int curr,boolean[]vis,Stack<Integer>stack){
    vis[curr]=true;
    for(int i=0;i<graph[curr].size();i++){
        Edge e=graph[curr].get(i);
        if(!vis[e.dest]){
            topsort(graph, e.dest, vis, stack);
        }
    }
    stack.push(curr);
}
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];// array of arraylist
        creategraph(graph);
        boolean vis[] = new boolean[V];
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<V;i++){
        if(!vis[i]){
            topsort(graph, i, vis, stack);
        }
    }
    while (stack.size()>0) {
        System.out.print(stack.pop()+" ");
        
    }

    }

}