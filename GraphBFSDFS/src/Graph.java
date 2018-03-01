import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Graph {

	LinkedList<Integer> arrAdjLinkedList [];
	int V;
	public Graph(int V){
		this.V=V;
		arrAdjLinkedList= new LinkedList[V];
		for (int i=0;i<V;i++){
			arrAdjLinkedList[i]= new LinkedList<Integer>();
		}
	}
	
	void addinfront(int src, int node){
		arrAdjLinkedList[src].add(node);
	}
	
	List<Integer> BFS(int source){
		List<Integer> resultBFSsequence=new ArrayList<>();
		boolean visited[]=new boolean[V];
		Queue<Integer> queue= new LinkedList<Integer>();
		queue.add(source);
		while(!queue.isEmpty()){
			int currNode=queue.remove();
			resultBFSsequence.add(currNode);
			visited[currNode]=true;	
			LinkedList<Integer> edges=arrAdjLinkedList[currNode];
			for(int i=0;i<edges.size();i++){
				int node=edges.get(i);
				if(!visited[node]){
					visited[node]=true;
					queue.add(node);
				}
			}
		}
		return resultBFSsequence;
	}
	
	List<Integer> dfsUsingStack(int source){
		Stack<Integer> stack= new Stack<Integer>();
		List<Integer> list = new LinkedList<>();
		list.add(source);
		stack.push(source);
		dfsUsingStackUtil(stack,source,list);
		return list;
	}
	
	void dfsUsingStackUtil(Stack<Integer> stack,int node,List<Integer> list){
		for(int singlenode:arrAdjLinkedList[node]){
			list.add(singlenode);
			stack.push(singlenode);
			dfsUsingStackUtil(stack,singlenode,list);
		}
		stack.pop();
	}
	
	
	List<Integer> dfs(int source){
		boolean [] visited=new boolean[V];
		List<Integer> resuldfs= new ArrayList<>();
		resuldfs.add(source);
		visited[source]=true;
		DFS(source, resuldfs,visited);
		return resuldfs;
	}
	void DFS(int node,List<Integer> defsequence,boolean[] visited){
		List<Integer> adjlist= arrAdjLinkedList[node];
		for(int adjnode: adjlist){
			if(!visited[adjnode]){
				visited[adjnode]=true;
				defsequence.add(adjnode);
				DFS(adjnode,defsequence,visited);
			}
		}
		 
		 
		 
		 
	}
	void printGraph(){
		for(int i=0;i<arrAdjLinkedList.length;i++){
			System.out.println("node: "+i+" adjacencylist"+arrAdjLinkedList[i]);
		}
	}
	public static void main(String args[]){
		Graph graph= new Graph(10);
		graph.addinfront(0, 2);
		graph.addinfront(2, 5);
		graph.addinfront(2, 4);
		graph.addinfront(4, 7);
		graph.addinfront(5,1);
		graph.addinfront(1,3);
		graph.printGraph();
		List<Integer> result= graph.BFS(0);
		for(int i:result){
			System.out.print(i);
		}
		System.out.println();
		
		List<Integer> resuldfs=graph.dfs(0);
		for(int i:resuldfs){
			System.out.print(i);
		}
		System.out.println();
		List<Integer> resuldfsusingstack=graph.dfsUsingStack(0);
		for(int i:resuldfsusingstack){
			System.out.print(i);
		}
	}
	
	
}
