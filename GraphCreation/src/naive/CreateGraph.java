package naive;


import java.util.LinkedList;
import java.util.List;

public class CreateGraph {

	int V;
	 class Edge{
	
		int v;
		int w;
	
		public  Edge(int v, int w){
			this.v=v;
			this.w=w;
		}
		@Override
		public String toString() {
			return "Edge [v=" + v + ", w=" + w + "]";
		}

	}
	 
	 
	static List<Edge>[] arrofLL;
	static LinkedList<Integer> [] adj;
	public CreateGraph(int vertices){
		this.V=vertices;
		arrofLL= new LinkedList[vertices];
		for( int i=0;i<vertices;i++){
			
			arrofLL[i]=new LinkedList<Edge>();
			
		}
		
	}
	
	void addEdge(int source, int destination , int weight){
		arrofLL[source].add(0,new Edge(destination, weight));
	}
	
	void createEdge(int source, int destination , int weight){
		adj[source].add(0,destination);
	}
	
	@Override
	public String toString() {
		String result="";
		for( int i=0;i<V;i++){
			result=result+i+"->"+arrofLL[i]+"\n";
			
		}
		return result;
	}

	String isConnected(int testSource, int testDestination){
		if(arrofLL[testSource]==null){
			 return "Not vertice like this";
		}
		if(testSource== testDestination){
			return "Connected";
		}
		for(Edge edge:arrofLL[testSource]){
			if(edge.v==testDestination){
				return "Connected";
			}
			
		}
		 return "Not Connected";
	}
	
	private static void dfs(int startingpoint, int numberofNodes) {
		
		
		boolean visted[]= new boolean[numberofNodes];
		
		dfsUtil(startingpoint, visted);
		
	}

	
	private static void dfsUtil(int node, boolean visited[]) {
		
		visited[node]=true;
		
		System.out.println(node);
		List<Integer> neighbours= adj[node];
		for(int singleneighbour: neighbours){
			if(!visited[singleneighbour]){
				dfsUtil(singleneighbour,visited);	
			}
		}
	}

	public static void main(String[] args) {

		CreateGraph graph= new CreateGraph(10);
	
//		graph.addEdge(0,1,166);
//		graph.addEdge(0,2,256);
//		graph.addEdge(3,6,256);
//		graph.addEdge(6,1,256);
//		System.out.println(graph);
//		System.out.println(graph.isConnected(8, 6));
		
		graph.createEdge(0,1,166);
		graph.createEdge(0,2,256);
		graph.createEdge(3,6,256);
		graph.createEdge(2,3,256);
		dfs(0,12);
		
	}


}
