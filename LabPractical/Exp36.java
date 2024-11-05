/* Write a java program to implement BST and show its height of tree the maximum path to the deepest leaf */

package LabPractical;
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	public TreeNode(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
}

public class Exp36 {

	private TreeNode root;

	public void insert(int val) {
		root = insertRec(root, val);
	}

	private TreeNode insertRec(TreeNode root, int val) {
		if (root == null) {
			return new TreeNode(val);
		}

		if (val < root.val) {
			root.left = insertRec(root.left, val);
		} else if (val > root.val) {
			root.right = insertRec(root.right, val);
		}

		return root;
	}

	public int getHeight() {
		return getHeightRec(root);
	}

	private int getHeightRec(TreeNode root) {
		if (root == null) {
			return 0;
		}

		int leftHeight = getHeightRec(root.left);
		int rightHeight = getHeightRec(root.right);

		return Math.max(leftHeight, rightHeight) + 1;
	}

	public void findMaxPathToDeepestLeaf() {
		findMaxPathRec(root, "");
	}

	private void findMaxPathRec(TreeNode root, String path) {
		if (root == null) {
			return;
		}

		path += root.val + " ";

		if (root.left == null && root.right == null) {
			System.out.println("Max Path to Deepest Leaf: " + path);
		}

		findMaxPathRec(root.left, path + "-> ");
		findMaxPathRec(root.right, path + "-> ");
	}

	public static void main(String[] args) {
		System.out.println("Utkarsh Raj \t2310987126");
		Exp36 bst = new Exp36();

		bst.insert(10);
		bst.insert(5);
		bst.insert(15);
		bst.insert(3);
		bst.insert(7);
		bst.insert(12);
		bst.insert(20);

		System.out.println("Height of the BST: " + bst.getHeight());
		bst.findMaxPathToDeepestLeaf();
	}

}
