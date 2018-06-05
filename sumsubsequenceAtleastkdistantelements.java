import java.util.*;
import java.lang.*;
import java.io.*;
class sumsubsequenceAtleastkdistantelements
 {
   public static int maxSum(int arr[],int n,int k)
   {
     int dp[]=new int[n];
     int i=0;
     for(;i<=k;++i)
     dp[i]=arr[i];
     for(;i<n;++i)
     {
       int max=0;
       for(int j=i-k-1;j>=0;--j)
       max=Math.max(max,dp[j]);
       dp[i]=max+arr[i];
     }
     int max=0;
     for(int x:dp)
     max=Math.max(max,x);
     //System.out.print(x+" ");
     return max;
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
	    System.out.println(maxSum(arr,n,k));
	}
	 }
}
