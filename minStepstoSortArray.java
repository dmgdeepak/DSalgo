// Idea is to find LIS and return n-LIS 
//as Longest Increasing subsequence shows that these elements are sorted ,rest needed to shift

import java.util.*;
import java.lang.*;
import java.io.*;
class minStepstoSortArray
 {
     	public static int inversion(int arr[],int n)
     	{
     	    int dp[]=new int[n];
			Arrays.fill(dp,1);
			int max=1;
			for(int i=0;i<n-1;++i)
			{
				for(int j=i+1;j<n;++j)
				{
					if(arr[i]<=arr[j])
					{
						dp[j]=Math.max(dp[j],1+dp[i]);
						max=Math.max(max,dp[j]);
					}
				}
			}
			return n-max;
     	}
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;++i)
	    arr[i]=ab.nextInt();
	    System.out.println(inversion(arr,n));
	}
	 }
}