import java.util.*;
import java.lang.*;
import java.io.*;
class LCSsubstring
 {
     public static int LCSsubstring(String str,String str2,int n,int m)
	 {
		   int dp[][]=new int[n+1][m+1];
		 for(int i=1;i<=n;++i)
		 {
			 for(int j=1;j<=m;++j)
			 {
				 if(str.charAt(i-1)==str2.charAt(j-1))
					 dp[i][j]=dp[i-1][j-1]+1;
				 else
					  dp[i][j]=dp[i-1][j];//as we are taking subsequence of string 1 but substring in str2
			 }
		 }
      
        // Finding the maximum length.
        int ans = 0;
        for (int i = 1; i <= m; i++)
            ans = Math.max(ans, dp[n][i]);
      
        return ans;
	 }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int m=ab.nextInt();
	    System.out.println(LCSsubstring(ab.next(),ab.next(),n,m));
	}
	 }
}