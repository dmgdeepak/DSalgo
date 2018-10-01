Max LIS of length k
idea is to use dynamic programming.
Q: When will length k LIS formed
Ans : array having LIS of length k-1 at index j and curr index (>j) having higher element.

import java.util.*;
import java.lang.*;
import java.io.*;
class lisLenK
 {
 	public static int fn(int a[],int n,int k)
 	{
 	    int lis[][]=new int[n][k+1];
 	    int res=-1;
 	    for(int i=0;i<n;++i)
 	    {
 	        lis[i][1]=a[i];
 	        for(int j=0;j<i;++j)
 	        {
 	            if(a[j]<a[i])
 	            {
 	                for(int t=k;t>1;--t)
 	                {
 	                    if(lis[j][t-1]!=0)
 	                    {
 	                        lis[i][t]=Math.max(lis[i][t],lis[j][t-1]+a[i]);
 	                    }
 	                }
 	            }
 	        }
 	        res=Math.max(res,lis[i][k]);
 	    }
 	     /*for(int i=0;i<n;++i)
 	    {
 	        for(int j=0;j<=k;++j)
 	        System.out.print(lis[i][j]+" ");
 	        System.out.println();}*/
 	    return (res>0)?res:-1;
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
	    System.out.println(fn(arr,n,k));
	}
	 }
}
