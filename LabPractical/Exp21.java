/* Write a java DSA to implement Array or Linked List representation of Sparse Matrix Upper triangular matrix is a square matrix in which 
 * all the elements below the principle diagonal are zero. To find the upper triangular matrix, a matrix needs to be a square matrix that 
 * is, the number of rows and columns in the matrix needs to be equal. Dimensions of a typical square matrix can be represented by n x n.*/

package LabPractical;
public class Exp21 {
	
	public static void printUpperTriangular(int[][] matrix) {
		int n = matrix.length;
		
		System.out.println("Upper Triangular Matrix:");
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i <= j)
					System.out.print(matrix[i][j] + " ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		System.out.println("Utkarsh Raj \t2310987126");
		int[][] sparseMatrix = {
				{1, 2, 3},
				{8, 6, 4},
				{4, 5, 6}
			};
		printUpperTriangular(sparseMatrix);
	}
}
