import java.util;
class Graph{
private final int numvertices;
private final List<List<integer>>adjLists;
public Graph (int numvertices){
this.numvertices=numvertices;
this.adjLists=new
ArrayList<>(numvertices);
  for (int i=0; i<numvertices;i++){
     adjLists.add(new Linkedlist<>()); 
  }
}
public void addEdge(int src,int dest){
  adjLists.get (src).add(dest);
}
public void dff(int starvertex){
 boolean[]visited=new
boolean [numvertices];
         dfsHelper(startvertex,visited);
 }
 private void dfsHelper (intvertexboolean[]visited){
    visited[vertex]=true;
    System.out.print(vertex+"");
 for(int neighbor : adjklists.get(vertex)){
     if(! visited [neighbor]){
dfsHelper (neighbor,visited);
           }
        }
}
public static void main (String[]args){
  Graph graph = new
Graph(6);
        graph.addEdge(0,1);
	graph.addEdge(0,2);
	graph.addEdge(1,3);
	graph.addEdge(1,4);
	graph.addEdge(2,4);
	graph.addEdge(3,5);
	graph.addEdge(4,5);
	System.out.println("DFS Traversal;");
	graph.dfs(0);
      }
}