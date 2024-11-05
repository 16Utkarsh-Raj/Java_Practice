/* Write a java program to Calculate Size of a tree | Recursion
Size of a tree is the number of elements present in the tree. Size of the below tree is 5. 
  
Size() function recursively calculates the size of a tree. It works as follows:Size of a tree = Size of left subtree + 1 + Size of right 
subtree.
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
public class Exp32 {

	public static int getSize(TreeNode root) {
		if (root == null) {
			return 0;
		}
		
		return 1 + getSize(root.left) + getSize(root.right);
	}

	public static void main(String[] args) {
		System.out.println("Utkarsh Raj \t2310987126");
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		int size = getSize(root);
		System.out.println("Size of the tree: " + size);
	}

}
