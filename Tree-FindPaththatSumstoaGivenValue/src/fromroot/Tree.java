package fromroot;

import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;

public class Tree {

	Node root = null;
	static int count=0;
	static class Node {
		Node left, right;
		int data;

		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	static void indOrder(Node root, int positon) {
		if (root == null) {
			return;
		}
		if(count<=positon){
			
		}
		indOrder(root.left, positon);
		count++;
		System.out.println("cnt"+count);
		if (count == positon) {
			System.out.println(root.data);
		}
		indOrder(root.right, positon);
	}

	public static void main(String[] arr) {

		Tree tree = new Tree();
		tree.root = new Node(10);
		tree.root.left = new Node(28);
		tree.root.right = new Node(13);
		tree.root.right.left = new Node(14);
		tree.root.right.right = new Node(15);
		tree.root.right.right.left = new Node(25);
		tree.root.right.left.left = new Node(21);
		 tree.getpath(tree.root, 38);
		
		indOrder(tree.root, 4);
		
	}

	void getpath(Node root, int sum) {

		ArrayList<Integer> path = new ArrayList<>();

		getPathUtil(root, path, sum, 0);

	}

	void getPathUtil(Node root, ArrayList<Integer> pathnodes, int sum, int pathsum) {

		if (root == null) {
			return;
		}
		pathnodes.add(root.data);
		pathsum = pathsum + root.data;

		if (pathsum == sum) {
			for (int nodes : pathnodes) {
				System.out.print(nodes + " ");
			}
			pathnodes.clear();
			System.out.println();
			return;
		}

		if (root.left != null) {
			ArrayList<Integer> dedicatedpathnodes = (ArrayList<Integer>) pathnodes.clone();
			getPathUtil(root.left, dedicatedpathnodes, sum, pathsum);
		}

		if (root.right != null) {
			ArrayList<Integer> dedicatedpathnodes = (ArrayList<Integer>) pathnodes.clone();
			getPathUtil(root.right, dedicatedpathnodes, sum, pathsum);
		}

	}

}
