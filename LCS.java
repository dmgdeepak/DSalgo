import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	 public static int LCS(String str,String str2,int n,int m)
	 {
		 int dp[][]=new int[n+1][m+1];
		 for(int i=1;i<=n;++i)
		 {
			 for(int j=1;j<=m;++j)
			 {
				 if(str.charAt(i-1)==str2.charAt(j-1))
					 dp[i][j]=dp[i-1][j-1]+1;
				 else
					  dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
			 }
		 }
		 return dp[n][m];
	 }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int m=ab.nextInt();
		int lcs=LCS(ab.next(),ab.next(),n,m);
		// number of insertion and deletion needed to change str1 to 2
		int ans=Math.abs(n-m);
		ans+=(Math.min(m,n)-lcs)*2;
	    System.out.println(ans);
	}
	 }
}
