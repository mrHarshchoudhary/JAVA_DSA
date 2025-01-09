package Graph.graph;

import java.util.ArrayList;

public class cycleindirected {
    public class basicgraph {
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
            graph[0].add(new Edge(0,2 ));
            graph[1].add(new Edge(1,0 ));
            graph[2].add(new Edge(2, 3));
            graph[3].add(new Edge(3,0 ));
           
        }
        public static boolean cycleindirected(ArrayList<Edge> graph[],boolean vis[],int curr,boolean rec[]){
            vis[curr]=true;
            rec[curr]=true;
            for(int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                if(rec[e.dest]==true){
                    return true;
                }
                else if(!vis[e.dest]){
                    if(cycleindirected(graph, vis, e.dest, rec)){
                        return true;
                    }
                }
            }
            rec[curr]=false;
            return false;
        }
    public static void main(String[] args) {
          int V=4;
        ArrayList<Edge> graph[]=new ArrayList[V];//array of arraylist   
       creategraph(graph);
        boolean vis[]=new boolean[V];
        boolean rec[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
              boolean iscycle=  cycleindirected(graph, vis, 0, rec);
               if(iscycle){
                System.out.println(iscycle);
                break;
               }
            }
        }
    }
}
}