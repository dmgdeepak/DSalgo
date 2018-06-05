import java.util.*;
import java.lang.*;
import java.io.*;
class minCoinChange
 {
   public static int minchange(int a[],int n,int k)
   {
     int dp[]=new int[k+1];
     Arrays.fill(dp,Integer.MAX_VALUE);
     dp[0]=0;
     for(int i=1;i<=k;++i)
     {
       for(int j=0;j<n;++j)
       {
         if(a[j]<=i && dp[i-a[j]]!=Integer.MAX_VALUE)
         dp[i]=Math.min(dp[i],dp[i-a[j]]+1);
       }
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
	    int arr[]=new int[n];
	    for(int i=0;i<n;++i)
	    arr[i]=ab.nextInt();
	    System.out.println(minchange(arr,n,ab.nextInt()));
	}
	 }
}
