//Idea is to use array with max capacity upto weight

//loop to all items and fill knapsack weight

import java.util.*;
import java.lang.*;
import java.io.*;
class knapsackTry
 {
	public static int knapsack(int n,int k,int val[],int wt[])
	{
		int dp[]=new int[k+1];
		for(int i=0;i<=k;++i)
		{
			for(int j=0;j<n;++j)
				if(wt[j]<=i)
					dp[i]=Math.max(dp[i],val[j]+dp[i-wt[j]]);
		}
		return dp[k];
	}
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int k=ab.nextInt();
	    int val[]=new int[n];
	    int wt[]=new int[n];
	    for(int i=0;i<n;++i)
	    val[i]=ab.nextInt();
		for(int i=0;i<n;++i)
	    wt[i]=ab.nextInt();
	    System.out.println(knapsack(n,k,val,wt));
	}
	 }
}
