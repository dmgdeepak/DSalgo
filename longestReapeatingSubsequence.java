import java.util.*;
import java.lang.*;
import java.io.*;
class longestReapeatingSubsequence
 {
 	public static int longestSubsequence(String str,int n)
 	{
    int dp[][]=new int[n+1][n+1];
    int max=0;
    for(int i=1;i<=n;++i)
    {
      for(int j=1;j<=n;++j)
      {
        if(i==j)
        continue;
        if(str.charAt(i-1)==str.charAt(j-1))
        dp[i][j]=Math.max(dp[i][j],dp[i-1][j-1]+1);
        else
        dp[i][j]=Math.max(dp[i][j],Math.max(dp[i-1][j],dp[i][j-1]));

        max=Math.max(max,dp[i][j]);
      }
    }
    return max;
 	}
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    System.out.println(longestSubsequence(ab.next(),n));
	}
	 }
}
