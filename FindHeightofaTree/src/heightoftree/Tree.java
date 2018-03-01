package heightoftree;



class Node{
	Node left=null;
	Node right= null;
	int data;
	
	public Node(int data){
		this.data=data;
	}
}
public class Tree {

	static Node root;
	
	
	static int findMaximumHeightofTree(Node node){
		
		int leftHeight=0;
		int rightHeight=0;
		if(node.left!=null){
			leftHeight =findMaximumHeightofTree(node.left)+1;
		}
		else{
			leftHeight =1;
		}
		if(node.right!=null){
			rightHeight =findMaximumHeightofTree(node.right)+1;
		}
		else{
			rightHeight= 1;
		}
		return (leftHeight>=rightHeight?leftHeight:rightHeight);
		
		
		
	}
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(6);
		root.left.right.right = new Node(5);
		System.out.println(findMaximumHeightofTree(root));
		

	}

}
