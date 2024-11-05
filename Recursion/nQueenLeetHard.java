//package Recursion;
//
//public class nQueenLeetHard {
//  public static void main(String[] args) {
//    int n = 4;
//    int arr[][] = new int[n][n];
//    sol(arr, 0, arr.length - 1, 0, arr[0].length - 1, n, 0, " ");
//  }
//
//  public static void sol(int arr[][], int cr, int er, int cc, int ec, int tq, int qp, String ans) 
//  {
//    if (qp == tq) //
//    {
//      System.out.println(ans);
//      return;
//    }
//    if (er - cr + 1 < qp)
//    {
//      return;
//    }
//    if (er - cr + 1 < tq - qp) {//
//      return;
//    }
//    if (cc > ec) {//
//    	sol(arr, cr + 1, er, 0, ec, tq, qp, ans);
//    	return;
//    }
//    {
//      if (cr > er)
//      return;
//    }
//
//    if (isItSafe(cr, cc, er, ec) == true) 
//    {
//      arr[cr][cc] = 1;
//      sol(arr, cr+1, er, 0, ec, tq, qp + 1, ans + cr + " " + cc);
//    }
//    sol(arr, cr, er, cc + 1, ec, tq, qp, ans);
//  }
//
//  public static boolean isItSafe(int arr[][], int cr, int er, int cc, int ec) // int tq, int qp, String ans
//  {
//    for (int row = 0; row < cr; row++) {
//      if (arr[row][cc] != 0) 
//      {
//        return false;
//      }
//    }
//    int row = cr;
//    int col = cc;
//    while (row >= 0 && col >= 0) {
//      if (arr[row][col] != 0) 
//        { 
//        	return false; 
//        }
//        row--;
//        col--;
//      }
//      row = cr;
//      col = cc;
//      while (row >= 0 && col >= 0) 
//      {
//        if(arr[row][col]!=0)
//        {
//          return false;
//		}
//		row--;
//		col--;
//      }
//      row = cr;
//      col = cc;
//      while (row >= 0 && col <= ec) {
//        if (arr[row][col] != 0) 
//        {
//          return false;
//        }
//        row--;
//        col++;
//      }
//      return true;
//    }
//}



package Recursion;

public class nQueenLeetHard {
    public static void main(String[] args) {
        int n = 4;
        int arr[][] = new int[n][n];
        sol(arr, 0, n, "");
    }

    public static void sol(int arr[][], int cr, int n, String ans) {
        if (cr == n) {
            System.out.println(ans);
            return;
        }

        for (int cc = 0; cc < n; cc++) {
            if (isItSafe(arr, cr, cc, n)) {
                arr[cr][cc] = 1;
                sol(arr, cr + 1, n, ans + cr + " " + cc + ", ");
                arr[cr][cc] = 0; // Backtrack
            }
        }
    }

    public static boolean isItSafe(int arr[][], int cr, int cc, int n) {
        // Check for column conflicts
        for (int row = 0; row < cr; row++) {
            if (arr[row][cc] != 0) {
                return false;
            }
        }

        // Check for upper diagonal conflicts
        for (int row = cr, col = cc; row >= 0 && col >= 0; row--, col--) {
            if (arr[row][col] != 0) {
                return false;
            }
        }

        // Check for lower diagonal conflicts
        for (int row = cr, col = cc; row >= 0 && col < n; row--, col++) {
            if (arr[row][col] != 0) {
                return false;
            }
        }

        return true;
    }
}
