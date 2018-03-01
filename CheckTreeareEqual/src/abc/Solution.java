package abc;


public class Solution {
	
	  static class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	  
	 
		public static void main(String [] arr){
			
			TreeNode tree1= new TreeNode(0);
			tree1.left = new TreeNode(3);
			tree1.left.left = new TreeNode(2);
			tree1.left.right = new TreeNode(1);
			tree1.left.right.left = new TreeNode(1);
			TreeNode tree2= new TreeNode(0);
			tree2.left = new TreeNode(3);
			tree2.left.left = new TreeNode(2);
			tree2.left.right = new TreeNode(1);
			tree2.left.right.left = new TreeNode(1);
			System.out.println(isSameTree(tree1,tree2));
			
		}
    public static boolean isSameTree(TreeNode root1, TreeNode root2) {
        
        if(root1==null && root2==null){
            return true;
        }else if((root1==null && root2!=null) || (root1!=null && root2==null)){
            return false;
        }else if(root1.val==root2.val){
            return (isSameTree(root1.left, root2.left) && isSameTree(root1.right,root2.right));
        }else{
            return false;
        }
        
    }
}