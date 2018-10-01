Idea is to Find Max with position j(sell index) and check from 0 to j-1 (buy) 
Store it in dp array
Everytime when we find max we add maximum profit founded by k-1 steps and jth index sell ,
This will take O(n^2k)

If we can find 0 to j-1 then we can reduce complexity.
https://www.geeksforgeeks.org/maximum-profit-by-buying-and-selling-a-share-at-most-k-times/

Code:

import java.util.*;
import java.lang.*;
import java.io.*;
class maxProfitDp
 {
	 public static int maxProfitDp(int arr[],int k,int n)
	 {
		 int profit[][]=new int[k+1][n+1];
		 for(int i=1;i<=k;++i)
		 {
			 int max=Integer.MIN_VALUE;
			 for(int j=1;j<n;++j)
			 {
				 max=Math.max(max,profit[i-1][j-1]-arr[j-1]);
				 profit[i][j]=Math.max(profit[i][j-1],max+arr[j]);
			 }
		 }
		 return profit[k][n-1];
	 }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int k=ab.nextInt();
	    int n=ab.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;++i)
	    arr[i]=ab.nextInt();
	    System.out.println(maxProfitDp(arr,k,n));
	}
	 }
}