package btree;

public class BinaryTree {

	
	static Node root=null;
	
	
	static class Node{
		
		Node left;
		Node right;
		int data;
		public Node(int data){
			this.data=data;
			left=right=null;
			
		}
		
	}
	
	void inOrder( Node root){
		if(root!=null){
			inOrder(root.left);
			System.out.println(root.data);
			inOrder(root.right);
		}
		
	}
	void preOrder( Node root){
		if(root!=null){
			System.out.println(root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
		
	}
	void postOrder( Node root){
		if(root!=null){
			postOrder(root.left);
			postOrder(root.right);
			System.out.println(root.data);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree btree= new BinaryTree();
		
		root= new Node(23);

		root.left=new Node(33);
		root.right=new Node(44);
		root.right.left=new Node(55);
		
		btree.preOrder(root);
	btree.inOrder(root);
		btree.postOrder(root);

	}
	
	

}
