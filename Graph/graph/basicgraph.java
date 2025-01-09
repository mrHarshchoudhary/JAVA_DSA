package Graph.graph;

import java.util.*;
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
        graph[0].add(new Edge(0,1 ));
        graph[0].add(new Edge(0,2 ));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1,3 ));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3,4 ));
        graph[3].add(new Edge(3, 5));
        graph[4].add(new Edge(4,2 ));
        graph[4].add(new Edge(4,3 ));
        graph[4].add(new Edge(4,5 ));
        graph[5].add(new Edge(5,3 ));
        graph[5].add(new Edge(5,4 ));
        graph[5].add(new Edge(5,6 ));
        graph[6].add(new Edge(6,5 ));
    }
    public static void BFS(ArrayList<Edge> graph[],int V){//int strt
        Queue<Integer>q=new LinkedList<>();
        boolean vis[]=new boolean[V];//agar graph tukdo me hoto ye main me likhna 
        q.add(0);//q.add(start)
        while(q.size()>0){
            int curr=q.remove();
            if(vis[curr]==false){
                System.out.print(curr+ " ");
                vis[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);

            }
        }
    }
}
public static void DFS(ArrayList<Edge> graph[],int curr,boolean vis[]){
    System.out.print(curr+" ");
    vis[curr]=true;
    for(int i=0;i<graph[curr].size();i++){
        Edge e=graph[curr].get(i);
        if(vis[e.dest]==false){
        DFS(graph, e.dest, vis);
        }
    }
}
public static void allpath(ArrayList<Edge> graph[],boolean vis[],int curr,String path,int tar){
    if(curr==tar){
        System.out.println(path);
        return ;
    }
    for(int i=0;i<graph[curr].size();i++){
        Edge e=graph[curr].get(i);
        if(vis[e.dest]==false){
            vis[curr]=true;
            allpath(graph, vis, e.dest, path+e.dest, tar);
            vis[curr]=false;
        }
    }

}
    public static void main(String[] args) {
        int V=7;
        ArrayList<Edge> graph[]=new ArrayList[V];//array of arraylist   
        creategraph(graph);
        boolean vis[]=new boolean[V];
        //for(int i=0;i<V;i++){
        //if(vis[i]==false){
        //BFS(graph,V,vis,i)
        //}
       // }
      // DFS(graph, 0, vis);
  // BFS(graph, V);
  int src=0,tar=5;
  allpath(graph, vis, src, "0", tar);
   System.out.println();
       
    
        
           
        }
    
}
