package Graph.graph;
import java.util.ArrayList;
import java.util.*;
public class cycleinundirection {
    static class Edge{
        int src;
        int dest;
        //int wt;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
           // this.wt=w;
        }
    }
      public static void creategraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1 ));
        graph[0].add(new Edge(0,4));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1,2 ));
        graph[1].add(new Edge(1, 4));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 2));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 5));
    }
    public static boolean isCycle( ArrayList<Edge>graph[],boolean vis[],int curr,int par){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(vis[e.dest]==true&&e.dest!=par){
                return true;    
            }
            else if(!vis[e.dest]){
                if(isCycle(graph, vis, e.dest, curr)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int V=6;
        ArrayList<Edge>graph[]=new ArrayList[V];
        creategraph(graph);
        System.out.println(isCycle(graph, new boolean[V], 0, -1));
         
        
    }
}
