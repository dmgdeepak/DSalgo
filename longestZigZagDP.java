import java.util.*;
import java.lang.*;
import java.io.*;
class longestZigZagDp
 {
	 public static int longestZigZag(int arr[][],int n)
	 {
		 int dp[][]=new int[n][n];
		 for(int i=0;i<n;++i)
			 dp[n-1][i]=arr[n-1][i];
		 for(int i=n-2;i>=0;--i)
			 for(int j=0;j<n;++j)
			 {
				 for(int k=0;k<n;++k)
					 if(k!=j)
				 dp[i][j]=Math.max(dp[i][j],dp[i+1][k]);
			 
			 dp[i][j]+=arr[i][j];
			 }
			 int mx=Integer.MIN_VALUE;
			 for(int i=0;i<n;++i)
			 {
				 mx=Math.max(mx,dp[0][i]);
			 }
			 return mx;
	 }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int arr[][]=new int[n][n];
	    for(int i=0;i<n;++i)
	    for(int j=0;j<n;++j)
	    arr[i][j]=ab.nextInt();
	    System.out.println(longestZigZag(arr,n));
	}
	 }
}