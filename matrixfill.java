import java.util.*;
import java.lang.*;
import java.io.*;
class matrixfill
 {
	 public static int start=1;
	 public static void fillmatrix(int i,int j,int n,int mat[][])
	 {
		 //fill first row
		 for(int k=j;k<n;++k)
		 {
			 mat[i][k]=start++;
		 }
		 //fill last colmn
		 for(int k=i+1;k<n;++k)
		 {
			 if(n>0)
			 mat[k][n-1]=start++;
		 }
		 // fill last row
		 for(int k=n-2;k>=j;--k)
			 mat[n-1][k]=start++;
		 //fill 1st colmn
		 for(int k=n-2;k>i;--k)
			 mat[k][j]=start++;
	 }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
		int i=0,j=0;
		int mat[][]=new int[n][n];
		start=1;
		int in=n;
		while(i<n && j<n)
		{
			fillmatrix(i,j,n,mat);
			++i;
			++j;
			--n;
		}
		for(i=0;i<in;++i)
		{for(j=0;j<in;++j)
				System.out.print(mat[i][j]+" ");
	System.out.println();}
	    System.out.println();
	}
	 }
}