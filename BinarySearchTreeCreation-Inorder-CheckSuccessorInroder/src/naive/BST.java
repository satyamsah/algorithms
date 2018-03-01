package naive;


import java.util.ArrayList;
import java.util.List;

public class BST {

	
	static Node root; 
	static class Node{
		Node right=null;
		Node left=null;
		int data;
		public Node(int data){
			this.data=data;
		}
	}
	
	static Integer inOrder(Node root,int number){
		List<Integer> arrayofInorderTraversal= new ArrayList<>();
		ArrayList<Integer> ans=(ArrayList<Integer>) inOrderUtil(root,arrayofInorderTraversal);
		System.out.println(ans.size());
		
		for(int i=0;i<ans.size()-1;i++){
			if(number==ans.get(i)){
				return ans.get(i+1);
			}
		}
		
			return  Integer.MAX_VALUE;
		
		
	}
	
	static  List<Integer>  inOrderUtil(Node root,List<Integer> arrayofInorderTraversal){
		if(root==null){
			return null;
		}
		inOrderUtil(root.left, arrayofInorderTraversal);
		//System.out.println(root.data);
		arrayofInorderTraversal.add(root.data);
		inOrderUtil(root.right, arrayofInorderTraversal);
		
		return arrayofInorderTraversal;
		
	}
	
	static int isBST(Node root){
		if(root==null){
			return 0;
		}
		if(root.left!=null){
			if(root.left.data>root.data){
				return -1;
			}	
		
		}
		if(root.right!=null){
			 if(root.right.data<root.data){
					return -1;
			 }
		}
		
		return Math.min(isBST(root.left),isBST(root.right));
		
		
		
	
	}
	
	
	 public boolean hasPathSum( Node root, int sum) {
	        
	        if(root==null){
	            return false;
	        }
	        else if(root.data==sum){
	            if(root.left==null && root.right==null){
	                return true;
	            }
	        }
	        else{
	     
	             return hasPathSum( root.left, sum- root.data)|| hasPathSum( root.right,  sum-root.data);
	                 
	        }
			return false;
	       
	    }
	public static void main(String [] arr){
		root= new Node(1);  
		root.left= new Node(-2);
		root.right= new Node(3);
		
		root.left.right= new Node(-1);
		root.right.left= new Node(2);
		root.right.right= new Node(6);
		
		System.out.println(isBST(root));
		
		System.out.println(inOrder(root,3));
	}
}
