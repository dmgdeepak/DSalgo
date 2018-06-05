import java.util.*;
import java.lang.*;
import java.io.*;
class subsequenceDivisibleK
 {
 	public static int fn(char []str,int n,int k)
 	{
 	    int dp[][]=new int[n][k];
 	    dp[0][(str[0]-'0')%k]++;
 	    for(int i=1;i<n;++i)
 	    {
 	        dp[i][(str[i]-'0')%k]++;
 	        for(int j=0;j<k;++j)
 	        {
 	            //exclude current element
 	            dp[i][j]=(dp[i][j]+dp[i-1][j])%1000000007;
 	            //include
 	            dp[i][(j*10+(str[i]-'0'))%k]=(dp[i][(j*10+(str[i]-'0'))%k]+dp[i-1][j])%1000000007;
 	            //dp[i-1][j] is added coz we have dp[i-1][j] subsequences from which
 	            //(j*10+str[i]-'0') can be formed
 	        }
 	    }
 	    return dp[n-1][0];
 	}
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int k=ab.nextInt();
	    System.out.println(fn(ab.next().toCharArray(),n,k));
	}
	 }
}
