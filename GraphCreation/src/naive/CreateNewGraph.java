package naive;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CreateNewGraph {

	
	static LinkedList<Integer> adj[];
	static int V;
	List<Integer> visitedList;
	public CreateNewGraph(int V){
		this.V=V;
		 adj= new LinkedList[V];
		 for(int i=0;i<V;i++){
			 adj[i]= new LinkedList<Integer>();
		 }
		
	}
	@Override
	public String toString() {
		String result="";
		for( int i=0;i<V;i++){
			result=result+i+"->"+adj[i]+"\n";
			
		}
		return result;
	}
	
	void createAnEdge(int source, int destination,int weight){
		
		adj[source].add(0,destination);
	}
	
	static void dfs(int source){
		
		boolean []visited= new boolean[V];
		dfsUtil(source, visited);
	}

	private static void dfsUtil(int source, boolean[] visited) {
		
		visited[source]=true;
		//visitedList.add(source);
		System.out.println((source));
		
		for(int i: adj[source]){
			if(!visited[i]){
				dfsUtil(i, visited);
			}
		}
		
	}
	public static void main(String arr[]){
		
		
		CreateNewGraph graph= new CreateNewGraph(5);
		graph.createAnEdge(0,1,225);
		graph.createAnEdge(0,2,300);
		graph.createAnEdge(2,4,225);
		graph.createAnEdge(4,2,300);
		
		System.out.println(graph);
		dfs(0);
	}
	
	
	
	
}
