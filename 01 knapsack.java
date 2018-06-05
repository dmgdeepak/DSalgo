//Idea is to use array with max capacity upto weight

//loop to all items and fill knapsack weight

import java.util.*;
import java.lang.*;
import java.io.*;
class 01 knapsack
 {
	public static int knapsack(int n,int k,int val[],int wt[])
	{
		int dp[]=new int[k+1];
		for(int i=0;i<n;++i)
		{
			for(int j=k;j>0;--j)// reverse loop because it won't use already allocated resource
      //if i move forward eg: dp[10]=20 for weight i have value 20 ,then for weight 20 it will take 10 weight for 20 value and look for dp[10]
      //which will use value again
				if(wt[i]<=j)
					dp[j]=Math.max(dp[j],val[i]+dp[j-wt[i]]);
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
