package naive;


import java.util.LinkedList;

import java.util.Queue;


public class CreateNewGraph {

	
	static LinkedList<Integer> adj[];
	static int V;

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
	

	static boolean checkifRouteAvailbleUsingBFS(int source, int destination){
		
		boolean visited[]= new boolean[V];
		visited[source]=true;
		
		Queue<Integer> queue= new LinkedList<>();
		queue.add(source);
		
		while(queue.size()!=0){
			int node= queue.poll();
		    if(node==destination){
		    	return true;
		    }
			for(int singleneighbour: adj[node]){
				if(!visited[singleneighbour]==true){
					visited[singleneighbour]=true;
					queue.add(singleneighbour);
				}
			}
		
		}
		
		return false;
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
		
		
		CreateNewGraph graph= new CreateNewGraph(7);
		
		
/** for bfs serach **/	
		graph.createAnEdge(0,1,225);
		graph.createAnEdge(0,2,300);
		graph.createAnEdge(2,4,225);
		graph.createAnEdge(4,5,300);
		graph.createAnEdge(3,4,300);
		graph.createAnEdge(2,0,300);
		
	
		
		
//		/** for dfs serach 	**/	
//		graph.createAnEdge(0,1,225);
//		graph.createAnEdge(0,2,225);
//		graph.createAnEdge(0,3,225);
//		graph.createAnEdge(1,4,300);
//		graph.createAnEdge(2,4,300);
	//	System.out.println(checkifRouteAvailbleUsingDFS(0, 4));
	
//		System.out.println(graph);
//		System.out.println(checkifRouteAvailbleUsingBFS(0,3));
	}
	
	
	
	
}
