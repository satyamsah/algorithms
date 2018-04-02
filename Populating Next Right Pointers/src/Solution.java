import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for binary tree with next pointer.
 *  */
   class TreeLinkNode {
      int val;
      TreeLinkNode left, right, next;
     TreeLinkNode(int x) { val = x; }
  }

public class Solution {
	
    public void connect(TreeLinkNode root) {
        Queue<TreeLinkNode> queue= new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()){
        	TreeLinkNode n=queue.peek();
        	queue.remove();
        	if(n!=null){
        		n.next=queue.peek();
        		if(n.left!=null){
        			queue.add(n.left);
        		}
        		if(n.right!=null){
        			queue.add(n.right);
        		}
        	}else if(!queue.isEmpty()){
        		queue.add(null);
        	}
        	
        }
        
        
    }
}