package naive;



public class Btree {


	static Node root; 
	
	static class Node{
		Node right=null;
		Node left=null;
		int data;
		public Node(int data){
			this.data=data;
		}
	}
	
	void checkForAncestor(int a, int b){
		
		checkAncestorUtil(root, a ,b,root.data);
		
		
	}
	
	private int checkAncestorUtil(Node node, int a, int b, int ancestor) {
		if(node==null){
			return Integer.MAX_VALUE;
		}
		if(node.data==a || node.data==b){
			
		}
		if(node.data==a || node.data==b){
			
		}
		
	}

	public static void main(String arr[]){
		root= new Node(1);
		root.left= new Node(-2);
		root.right= new Node(3);
		
		root.left.right= new Node(-1);
		root.right.left= new Node(2);
		root.right.right= new Node(6);
	}
}
