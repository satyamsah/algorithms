import java.awt.geom.QuadCurve2D;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class Graph {

	LinkedList<Integer>[] adjList;
	int V;

	public Graph(int V) {
		adjList = new LinkedList[V];
		for (int i = 0; i < adjList.length; i++) {
			adjList[i] = new LinkedList<>();
		}
	}

	void addEdge(int source, int dest) {
		adjList[source].add(source);
	}

	public static void main(String args[]) {
		Graph graph = new Graph(4);
	}

	public boolean DFS_checkIfExists(int source, int destination) {
		boolean visited[] = new boolean[V];
		return checkIfExistsUtil(source, destination, visited);
	}

	boolean checkIfExistsUtil(int source, int dest, boolean[] visited) {

		ListIterator<Integer> neightbours = adjList[source].listIterator();
		while (neightbours.hasNext()) {
			int neighbour = neightbours.next();
			if (!visited[neighbour]) {
				visited[neighbour] = true;
				if (neighbour == dest) {
					return true;
				} else {
					return checkIfExistsUtil(source, dest, visited);
				}
			}
		}
		return false;
	}
	
	void BFS(int source){
		boolean visited[] = new boolean[V];
		visited[source]=true;
		
		Queue<Integer> queue= new LinkedList<>();
		queue.add(source);
		
		while(queue.isEmpty()){
			int node= queue.remove();
			visited[node]=true;
			ListIterator<Integer> arrlist=adjList[node].listIterator();
			while (arrlist.hasNext()){
				int neighbour=arrlist.next();
				queue.add(neighbour);
				
			}
		}
		
	}

}
