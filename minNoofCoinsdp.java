import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
 	public static int fn(int arr[],int n,int k)
 	{
 	    int dp[]=new int[k+1];
 	    Arrays.fill(dp,Integer.MAX_VALUE);
 	    dp[0]=0;
 	    for(int i=1;i<=k;++i)
 	    {
 	        for(int j=0;j<n;++j)
 	        {
 	            if(i>=arr[j])
 	            {
 	                if(dp[i-arr[j]]!=Integer.MAX_VALUE)
 	                dp[i]=Math.min(dp[i],1+dp[i-arr[j]]);
 	            }
 	        }
 	    }
 	    return (dp[k]!=Integer.MAX_VALUE)?dp[k]:-1;
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
	    System.out.println(fn(arr,n,k));
	}
	 }
}
