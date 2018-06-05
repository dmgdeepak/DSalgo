import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static  ArrayList<String> arr=new ArrayList<String>();
    static boolean flag=false;
     static boolean isSafe(boolean board[][], int row, int col,int N)
    {
        int i, j;
 
        /* Check this row on left side */
        for (i = 0; i < col; i++)
            if (board[row][i] == true)
                return false;
 
        /* Check upper diagonal on left side */
        for (i=row, j=col; i>=0 && j>=0; i--, j--)
            if (board[i][j] == true)
                return false;
 
        /* Check lower diagonal on left side */
        for (i=row, j=col; j>=0 && i<N; i++, j--)
            if (board[i][j] == true)
                return false;
 
        return true;
     }
     public static  void  nqueen(boolean mat[][],int col,int n)
     {
         if(col>=n)
         {
             arr.add(print(mat,n));
             flag= true;}
         for(int i=0;i<n;i++)
         {
             if(isSafe(mat,i,col,n))
          {   mat[i][col]=true;
          nqueen(mat,col+1,n);
            mat[i][col]=false;
         }
         }
     }
     public  static String print(boolean mat[][],int n)
     {
         String str=new String("[");
         for(int i=0;i<n;i++)
         for(int j=0;j<n;j++)
         {
             if(mat[i][j])
             {
                 str=str+(j+1)+" ";
                 break;
             }
         }
         str=str+"]";
         return str;
     }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    arr.clear();
	    flag=false;
	    int n=ab.nextInt();
	    boolean mat[][]=new boolean[n][n];
	    nqueen(mat,0,n);
	    if(flag)
	   {
	       Collections.sort(arr);
	       for(String s:arr)
	    System.out.print(s+" ");}
	    else
	    System.out.print("-1");
	    System.out.println();
	}
	 }
}