//it is same like unbounded knapsack problem
// here the thing is we are minimizing the cost
//as we know arr[i] represents cost for weight i
//many of us fails to get minimum value as array contains value as MAX_VALUE

/* Observation says that when we look for cost for weight i and array has cost for that value
then cost[w]=arr[w]+dp[w-w=0]
By this we will be having our ans*/

import java.util.*;
import java.lang.*;
import java.io.*;
class fillBag
 {
 	public static int minCost(int arr[],int n,int k)
 	{
    int dp[]=new int[k+1];
    Arrays.fill(dp,Integer.MAX_VALUE);
    dp[0]=0;
    for(int i=1;i<=k;++i)
    {
      for(int j=1;j<=n && j<=i;++j)
      {
        if(arr[j-1]!=-1 && dp[i-j]!=Integer.MAX_VALUE)
        dp[i]=Math.min(dp[i],arr[j-1]+dp[i-j]);
      }
    }
  /*  for(int x:dp)
    System.out.print(x+" ");*/
    return (dp[k]!=Integer.MAX_VALUE)?dp[k]:-1;
 	}
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int k=ab.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;++i)
	    arr[i]=ab.nextInt();
	    System.out.println(minCost(arr,n,k));
	}
	 }
}
