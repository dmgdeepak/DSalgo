import java.io.*;
 
class findSubsequenceCount
{
    static int findSubsequenceCount(String S, String T)
    {
        int m=S.length();
        int n=T.length();
		int dp[][]=new int[m+1][n+1];
		for(int i=0;i<=m;++i)
			dp[i][0]=1;
		for(int i=1;i<=m;++i)
			for(int j=1;j<=n;++j)
			{
				if(S.charAt(i-1)==T.charAt(j-1) )
				{if(i>=2)
					dp[i][j]=dp[i-1][j-1]+dp[i-2][j-1];
				else
					dp[i][j]=dp[i-1][j-1];
				}
				else
					dp[i][j]=dp[i-1][j];
			}
        /* uncomment this to print matrix mat
        for (int i = 1; i <= m; i++, cout << endl)
            for (int j = 1; j <= n; j++)
                System.out.println ( mat[i][j] +" "); */
        return dp[m][n] ;
    }
     
    // Driver code to check above method
    public static void main (String[] args) 
    {
        String T = "ge";
        String S = "geeksforgeeks";
        System.out.println ( findSubsequenceCount(S, T));
         
    }
}