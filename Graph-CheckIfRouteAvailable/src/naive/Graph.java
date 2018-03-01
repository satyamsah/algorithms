package naive;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Graph {
	
	static int V;
	static List<Integer> arrofAdjList[];
	
	public Graph(int V){
		this.V=V;
		arrofAdjList= new LinkedList[V];
		for( int i=0;i< V;i++){
			arrofAdjList[i]= new LinkedList<>();
		}
		
	}
	
	void addEdge(int source, int destination){
		arrofAdjList[source].add(0,destination);
	}
	

	@Override
	public String toString() {
		String result = "";
		for(int i=0;i<V;i++){
			result=result+i+arrofAdjList[i]+"\n";
		}
		return result;
	}

	static boolean verifyPathExists(int testSource,int testDestination){
		
		if(testSource>=V || testDestination >=V){
			return false;
		}
		if(arrofAdjList[testSource].contains(testDestination)){
			return true;
		}
		else 
			return false;
	}

	public static void main(String[] args) {
		
		Graph graph =new Graph(5);
		graph.addEdge(0, 2);
		graph.addEdge(1, 3);
		graph.addEdge(2, 3);
		graph.addEdge(0, 4);
		
		System.out.println(graph);
		System.out.println(verifyPathExists(0,7));

	}

}
