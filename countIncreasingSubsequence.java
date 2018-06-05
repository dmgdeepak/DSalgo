import java.util.*;
import java.lang.*;
import java.io.*;
class countIncreasingSubsequence
 {
 	public static int increasingSubsequence(int arr[],int n)
 	{
 	    int dp[][]=new int [n][n];
      for(int i=0;i<n;++i)
      dp[i][i]=1;
      for(int gap=2;gap<=n;++gap)
      {
        for(int i=0,j=i+gap-1;j<n;++j)
        {
          if(arr[i]<arr[j])
          dp[i][j]=1+dp[i+1][j-1];
          else
          dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
        }
      }
      for(int i=0;i<n;++i){
      for(int j=0;j<n;++j)
      System.out.print(dp[i][j]+" ");
        System.out.println();
    }
      return dp[0][n-1];
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
	    System.out.println(increasingSubsequence(arr,n));
	}
	 }
}
