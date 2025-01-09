package Graph.graph;

import java.util.ArrayList;

public class BFS {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void creategraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2,10));
        graph[1].add(new Edge(1, 2,5));
        graph[1].add(new Edge(1, 3,7));
        graph[2].add(new Edge(2, 0,7));
        graph[2].add(new Edge(2, 1,-1));
        graph[2].add(new Edge(2, 3,7));
        graph[3].add(new Edge(3, 1,6));
        graph[3].add(new Edge(3, 2,9));
    }
    public static void main(String[] args) {
        ArrayList<Edge>graph[]=new Arraylist[];
    }
}
