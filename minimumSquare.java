Idea is to check with all the possible square and remaining non squaring number(0-4)
If we go with greedy approach , it may not give proper solution hence DP is used.

import java.util.*;
import java.lang.*;
import java.io.*;
class minimumSquare
 {
	 public static int minimumSquare(int n)
	 {
		 int dp[]=new int[n+1];
		 for(int i=0;i<=3;++i)
			 dp[i]=i;
		 for(int i=4;i<=n;++i)
		 {
			 dp[i]=i;
			 for(int x=1;x*x<=i;++x)
			 {
				dp[i]=Math.min(dp[i],1+dp[i-(x*x)]);
			 }
		 }
		 return dp[n];
	 }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    System.out.println(minimumSquare(ab.nextInt()));
	}
	 }
}