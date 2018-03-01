
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Node {
	Node left;
	Node right;
	int val;

	Node(int val) {
		this.val = val;
	}
}

public class BST {

	static Node root;

	static Node createBST(List<Integer> list) {
		if (list.size() == 0) {
			return null;
		}
		root = createBSTUtil(list, 0, root);
		return root;
	}

	private static Node createBSTUtil(List<Integer> list, int i, Node node) {
		if (i < list.size()) {
			if (node == null) {
				node = new Node(list.get(i));
				i++;
				createBSTUtil(list, i, node);
			} else {
				if (list.get(i) < node.val) {
					node.left = new Node(list.get(i));
					i++;
					createBSTUtil(list, i, node.left);
				} else {
					node.right = new Node(list.get(i));
					i++;
					createBSTUtil(list, i, node.right);
				}
			}
		}
		return node;

	}

	static void inorderTraversalUtil(Node node, List<Integer> inorder) {
		if (node != null) {
			
			inorderTraversalUtil(node.left, inorder);
			// inorder.add(root.val);
			System.out.print(node.val+",");
			inorderTraversalUtil(node.right, inorder);
		}
	}

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(-2);
		list.add(3);
		list.add(-1);
		list.add(-5);
		list.add(0);
		createBST(list);
		List<Integer> inorder = new ArrayList<>();
		inorderTraversalUtil(root, inorder);
//		for (int nodeval : inorder) {
//			System.out.print(nodeval + ",");
//		}

	}

}
