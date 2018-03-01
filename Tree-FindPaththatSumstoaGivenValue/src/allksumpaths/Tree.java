package allksumpaths;

import java.util.ArrayList;


public class Tree {
	
	 Node root=null;
	
	static class Node{
		Node left,right;
		int data;
		
		public Node(int data){
			this.data=data;
			left = right = null;
		}
	}
	public static void main(String [] arr){
		
		Tree tree= new Tree();
		tree.root= new Node(1);
		tree.root.left = new Node(3);
		tree.root.left.left = new Node(2);
		tree.root.left.right = new Node(1);
		tree.root.left.right.left = new Node(1);
		tree.root.right = new Node(-1);
		tree.root.right.left = new Node(4);
		tree.root.right.left.left = new Node(1);
		tree.root.right.left.right = new Node(2);
		tree.root.right.right = new Node(5);
		tree.root.right.right.right = new Node(2);
		tree.getpath(tree.root, 5);
		
	}
	
	void getpath(Node root,int sum){
		

		ArrayList<Integer> pathnodesvalues= new ArrayList<>();
		getPathUtil(root,pathnodesvalues,sum);
		
	}
	
	void getPathUtil(Node root,ArrayList<Integer> pathNodesValues,int sum){
		
		if(root==null){
			return;
		}
	
		pathNodesValues.add(root.data);
		int intermediatesum=0;
		for(int i=pathNodesValues.size()-1;i>=0;i--){
			intermediatesum=intermediatesum+pathNodesValues.get(i);
			if(intermediatesum==sum){
				printtheArray(pathNodesValues, i,pathNodesValues.size()-1);
			}
		}
	
		 
		
		if(root.left!=null){
			ArrayList<Integer> dedicatedPathNodesValues=(ArrayList<Integer>) pathNodesValues.clone();
			 getPathUtil(root.left, dedicatedPathNodesValues,sum);
		}
		if(root.right!=null){
			ArrayList<Integer> dedicatedPathNodesValues=(ArrayList<Integer>) pathNodesValues.clone();
			 getPathUtil(root.right, dedicatedPathNodesValues,sum);
		}
	}

	private void printtheArray(ArrayList<Integer> pathNodesValues, int start, int end) {
	
		for( int i=start;i<=end;i++){
			System.out.print(pathNodesValues.get(i)+ " ");
		}
		System.out.println();
		
	}
	

	
	

}
