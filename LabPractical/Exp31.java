/* Write a java program for given a binary tree, print all root-to-leaf paths
  
Given a binary tree, print all root-to-leaf paths
For the below example tree, all root-to-leaf paths are: 
10 –> 8 –> 3 
10 –> 8 –> 5 
10 –> 2 –> 2
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
public class Exp31 {

	public static void printRootToLeafPaths(TreeNode root, String path) {
		if (root == null) {
			return;
		}

		path += root.val + " ";

		if (root.left == null && root.right == null) {
			System.out.println(path);
			return;
		}

		printRootToLeafPaths(root.left, path + "-> ");
		printRootToLeafPaths(root.right, path + "-> ");
	}

	public static void main(String[] args) {
		System.out.println("Utkarsh Raj \t2310987126");
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(8);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(2);

		System.out.println("Root-to-leaf paths:");
		printRootToLeafPaths(root, "");
	}
}
