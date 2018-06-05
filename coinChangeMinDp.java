import java.util.*;
import java.lang.*;
import java.io.*;
class coinChangeMinDp
 {
	 public static int coinChangeMin(int deno[],int n,int k)
	 {
		 int dp[]=new int[k+1];
		 Arrays.fill(dp,Integer.MAX_VALUE-1);
		 for(int x:deno)
		 {
			 if(x<=k)
				 dp[x]=1;
		 }
		 for(int i=1;i<=k;++i)
		 {
			 for(int x:deno)
			 {
				 if(i>=x)
					 dp[i]=Math.min(dp[i],dp[i-x]+1);
			 }
		 }
		 return (dp[k]<Integer.MAX_VALUE-1)?dp[k]:-1;
	 }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int v=ab.nextInt();
	    int n=ab.nextInt();
	    int deno[]=new int[n];
	    for(int i=0;i<n;++i)
	    deno[i]=ab.nextInt();
	    System.out.println(coinChangeMin(deno,n,v));
	}
	 }
}