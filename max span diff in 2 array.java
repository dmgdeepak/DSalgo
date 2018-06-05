http://practice.geeksforgeeks.org/problems/longest-span-with-same-sum-in-two-binary-arrays/0
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     public static int longestSpan(int arr[],int n,int arr2[])
     {
         int diff[]=new int[2*n+1];
         int maxLen=0,pre1=0,pre2=0;
         Arrays.fill(diff,-1);
         for(int i=0;i<n;++i)
         {
             pre1+=arr[i];
             pre2+=arr2[i];
             int cdiff=pre1-pre2;
             int diffindex=n+cdiff;
             if(cdiff==0)
             {
                 maxLen=i+1;
             }
             else if(diff[diffindex]==-1)
             {
              diff[diffindex]=i;   
             }
             else
             {
                 maxLen=Math.max(maxLen,i-diff[diffindex]);
             }
         }
         return maxLen;
     }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int arr[]=new int[n];
	    int arr2[]=new int[n];
	    for(int i=0;i<n;i++)
	    arr[i]=ab.nextInt();
	    for(int i=0;i<n;i++)
	    arr2[i]=ab.nextInt();
	    System.out.println(longestSpan(arr,n,arr2));
	}
	 }
}