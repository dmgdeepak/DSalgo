	import java.util.*;
import java.lang.*;
import java.io.*;
class matrixmaxsumdp
 {
	 public static long gmaxsum(int arr[][],int n)
	 {
		 long dp[][]=new long[n][n];
		 long sum=-1;
		 for(int i=1;i<n;++i)
		 Arrays.fill(dp[i],-1);
		 for(int i=0;i<n;++i)
			 dp[0][i]=arr[0][i];
		 for(int i=1;i<n;++i)
		 {
			 for(int j=0;j<n;++j)
				 for(int k=0;k<n;++k)
				 {
					 if(arr[i-1][k]<arr[i][j])
						 dp[i][j]=Math.max(dp[i][j],arr[i][j]+dp[i-1][k]);
				 }
		 }
		 for(int i=0;i<n;++i)
			 sum=Math.max(sum,dp[n-1][i]);
		 return sum;
			 
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
	    System.out.println(gmaxsum(arr,n));
	}
	 }}