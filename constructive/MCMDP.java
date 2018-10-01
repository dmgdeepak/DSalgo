Idea is to break problem into subproblem
Here we will check every possible bracket position 
We will follow diagonal approach of DP
Here cost of multiplication is : cost of multiplying i to k + (k+1 to j) +cost of multiplying these two subproblems.

Here we are multiplying arr[i-1]*arr[k]*arr[j] 
i-1 is used because here first matrix(for every subproblem) has i-1 * i (row * col)



import java.util.*;
import java.lang.*;
import java.io.*;
class MCMDP
 {
	 public static int MCM(int arr[],int n)
	 {
		 int dp[][]=new int[n][n];
		 for(int gap=2;gap<n;++gap)
		 {
			 for(int i=1,j=i+gap-1;j<n;++i,++j)
			 {
				 dp[i][j]=Integer.MAX_VALUE;
				 for(int k=i;k<j;++k)
				 {
					 dp[i][j]=Math.min(dp[i][j],dp[i][k]+dp[k+1][j]+arr[i-1]*arr[k]*arr[j]);
				 }
			 }
		 }
		 return dp[1][n-1];
	 }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;++i)
	    arr[i]=ab.nextInt();
	    System.out.println(MCM(arr,n));
	}
	 }
}