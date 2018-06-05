import java.util.*;
import java.lang.*;
import java.io.*;
class goldmineProblem
 {
 	public static int fn(int arr[][],int m,int n)
 	{
    int dp[][]=new int[m+1][n+1];
    for(int i=1;i<=n;++i)
    {
      for(int j=1;j<=m;++j)
      {
        dp[j][i]=Math.max(dp[j][i-1],Math.max(dp[j][i],dp[j-1][i-1]));
        if(j+1<=m)
        dp[j][i]=Math.max(dp[j][i],dp[j+1][i-1]);
        dp[j][i]+=arr[j-1][i-1];
      }
    }

  /*  for(int i=0;i<=m;++i)
    {
      for(int j=0;j<=n;++j)
      {
        System.out.print(dp[i][j]+" ");
      }
      System.out.println();}*/
      int res=0;
      for(int j=0;j<=m;++j)
      {
        res=Math.max(res,dp[j][n]);
      }
    return res;
 	}
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int m=ab.nextInt();
	    int n=ab.nextInt();
	    int arr[][]=new int[m][n];
	    for(int i=0;i<m;++i)
	    for(int j=0;j<n;++j)
	    arr[i][j]=ab.nextInt();
	    System.out.println(fn(arr,m,n));
	}
	 }
}
