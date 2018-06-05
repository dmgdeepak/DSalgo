import java.util.*;
import java.lang.*;
import java.io.*;
class maxAdjacentSumbyMaking1dp
 {
     public static int maxAdjacentSumbyMaking1(int arr[],int n)
     {
         int dp[][]=new int[n][2];
         for(int i=0;i<n-1;++i)
         {
			 // take value as 1 so dp[i][0] has value 1 : 1-1 =0 and 1-current element
             dp[i+1][0]=Math.max(dp[i][0],dp[i][1]+Math.abs(1-arr[i]));
			 //taken value as orignal value : dp[i][0] has value 1 so subtract array's next value and dp[i][1] represents orignal value so subtarct value from array's next value
              dp[i+1][1]=Math.max(dp[i][0]+Math.abs(1-arr[i+1]),dp[i][1]+Math.abs(arr[i+1]-arr[i]));
         }
         return Math.max(dp[n-1][0],dp[n-1][1]);
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
	    System.out.println(maxAdjacentSumbyMaking1(arr,n));
	}
	 }
}