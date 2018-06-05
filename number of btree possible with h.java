import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt(); //height
	    int dp[]=new int[n+1];
	    dp[0]=dp[1]=1;
	    for(int i=2;i<=n;i++)
	    {
	         dp[i] =(dp[i - 1] * (((2 *dp [i - 2] + dp[i - 1])%1000000007)%1000000007) % 1000000007);}
	    System.out.println(dp[n]);
	}
	 }
}