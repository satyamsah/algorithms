package abc;



import java.util.LinkedList;
import java.util.List;

import java.util.Queue;



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
	
	
	static void bfs(int source){
		boolean[] visited= new boolean[V];
		
		bfsUtil(source,visited);
		
	}
	private static void bfsUtil(int source,boolean [] visited) {
		System.out.println("");
		visited[source]=true;
		Queue<Integer> queue= new LinkedList<>();
		queue.add(source);
		while(queue.size()!=0){
			int node=queue.poll();
			System.out.println(node);
			for(Integer i : adj[node]){
				if(!visited[i]==true){
					visited[i]=true;
					queue.add(i);
				}
				
			}
			
			
			
		}
		
	}
	
	
//	private static void levelOrderTraversal(Node root) {
//	Queue<Integer>  queue= new LinkedList();
//	queue.add(root)
//	
//	while(queue.size()!=0){
//		int sizeofLine= queue.size();
//		
//		while(sizeofLine>0){
//			Node n= queue.poll();
//			System.out.println(n.data);
//			if(n.left!=null){
//				queue.add(n.left);
//			}
//			if(n.right!=null){
//				queue.add(n.right);
//			}
//		}
//		
//		
//	}
//		while(queue.size()!=0){
//			
//			int node=queue.poll();
//			
//			System.out.println(node);
//			
//			for(Integer i : adj[node]){
//				if(!visited[i]==true){
//					visited[i]=true;
//					queue.add(i);
//				}
//				
//			}
//			
//			
//			
//		}
//		
//	}
	
	
	
	public static void main(String arr[]){
		
		
		CreateNewGraph graph= new CreateNewGraph(5);
//		graph.createAnEdge(0,1,225);
//		graph.createAnEdge(0,2,300);
//		graph.createAnEdge(2,4,225);
//		graph.createAnEdge(4,2,300);
		
		graph.createAnEdge(0,1,225);
		graph.createAnEdge(0,2,225);
		graph.createAnEdge(0,3,300);
		graph.createAnEdge(1,4,225);	
		
		System.out.println(graph);
		dfs(0);
		//bfs(0);
	}
	
	
	
	
}
