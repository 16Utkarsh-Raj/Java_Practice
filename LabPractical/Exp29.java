/* write java program to build binary Tree Traversals (Inorder, Preorder and Postorder)
Following are the generally used ways for traversing trees.
	 

Depth First Traversals: 
(a) Inorder (Left, Root, Right) : 4 2 5 1 3  			(Recursive)
(b) Preorder (Root, Left, Right) : 1 2 4 5 3 
(c) Postorder (Left, Right, Root) : 4 5 2 3 1
*/

//package LabPractical;

//class TreeNode {
//	int val;
//	TreeNode left;
//	TreeNode right;
//	
//	public TreeNode(int val) {
//		this.val = val;
//		this.left = null;
//		this.right = null;
//	}
//}


package LabPractical;
public class Exp29 {
	
	public static void inorder(TreeNode root) {
		if (root == null) {
			return;
		}
		
		inorder(root.left);
		System.out.print(root.val + " ");
		inorder(root.right);
	}

	public static void preorder(TreeNode root) {
		if (root == null) {
			return;
		}
		
		System.out.print(root.val + " ");
		preorder(root.left);
		preorder(root.right);
	}

	public static void postorder(TreeNode root) {
		if (root == null) {
			return;
		}
		
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.val + " ");
	}
	
	public static void main(String[] args) {
		System.out.println("Utkarsh Raj \t2310987126");
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		System.out.print("Inorder: ");
		inorder(root);
		System.out.println();

		System.out.print("Preorder: ");
		preorder(root);
		System.out.println();

		System.out.print("Postorder: ");
		postorder(root);
		System.out.println();
	}

}
