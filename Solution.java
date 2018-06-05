import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int DFS(int[][] matrix,int i,int j,int n,int m)
    {
        int temp=0;
        if(i<0 || j<0 || i>=n || j>=m|| matrix[i][j]==0)
            return 0;
                temp=1;
                matrix[i][j]=0;
        return Math.max(DFS(matrix,i+1,j,n,m),Math.max(DFS(matrix,i-1,j,n,m),Math.max(DFS(matrix,i,j+1,n,m),DFS(matrix,i,j-1,n,m))))+temp;
    }
    static int connectedCell(int[][] matrix,int n,int m) {
       int max=Integer.MIN_VALUE;
        for(int i=0;i<n;++i)
            for(int j=0;j<m;++j)
            {
                if(matrix[i][j]==1)
                max=Math.max(max,DFS(matrix,i,j,n,m));
            }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] matrix = new int[n][m];
        for(int matrix_i = 0; matrix_i < n; matrix_i++){
            for(int matrix_j = 0; matrix_j < m; matrix_j++){
                matrix[matrix_i][matrix_j] = in.nextInt();
            }
        }
        int result = connectedCell(matrix,n,m);
        System.out.println(result);
        in.close();
    }
}
