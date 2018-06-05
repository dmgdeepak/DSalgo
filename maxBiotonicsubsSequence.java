import java.util.*;
import java.lang.*;
import java.io.*;
class maxBiotonicsubsSequence
 {
 	public static int maxBiotonic(int arr[],int n)
 	{
    int dp[]=new int[n];
    for(int i=0;i<n;++i)
    dp[i]=arr[i];
   for(int i=0;i<n;++i)
    {
      int max=Integer.MIN_VALUE;
      for(int j=0;j<i;++j)
      {
        if(arr[i]>arr[j])
        max=Math.max(max,dp[j]);
      }
      if(max>0)
      dp[i]+=max;
    }
    int dp2[]=new int[n];
    for(int i=0;i<n;++i)
    dp2[i]=arr[i];
    for(int i=n-1;i>=0;--i)
     {
       int max=Integer.MIN_VALUE;
       for(int j=n-1;j>i;--j)
       {
         if(arr[i]>arr[j])
         max=Math.max(max,dp2[j]);
       }
       if(max>0)
       dp2[i]+=max;
     }
     int max=0;
     for(int i=0;i<n;++i)
     {
       int val=dp[i]+dp2[i]-arr[i];
       max=Math.max(max,val);
     }
    return max;
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
	    System.out.println(maxBiotonic(arr,n));
	}
	 }
}
