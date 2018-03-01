package bbt;



class Node{
	Node left=null;
	Node right= null;
	int data;
	
	public Node(int data){
		this.data=data;
	}
}

public class TreeError {
	
	Node root;

	
	static int getHeight(Node node){
		int leftHeight=0;
		int rightHeight=0;
		if(node.left!=null){
			leftHeight =getHeight(node.left)+1;
		}
		else{
			leftHeight =1;
		}
		if(node.right!=null){
			rightHeight =getHeight(node.right)+1;
		}
		else{
			rightHeight= 1;
		}
		
		
			return (leftHeight>=rightHeight?leftHeight:rightHeight);
	
		
	}
		
	
	static boolean isBalanced(Node root){
		
	
	    if(root==null){
	    	return true;
	    }
	    int heightdiff=getHeight(root.left)-getHeight(root.right);
		if(heightdiff>1 ||heightdiff<-1 ){
			return false;
		}
		else{
			return isBalanced(root.left) && isBalanced(root.right);
		}
		
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(6);
		
		System.out.println(isBalanced(root));
	}

}
