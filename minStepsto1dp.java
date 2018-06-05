import java.util.*;
import java.lang.*;
import java.io.*;
class minStepsto1
 {
     public static int minStepsto1(int n)
     {
         int dp[]=new int[n+1];
         if(n<=1)
         return 0;
         else if(n<4)
         return 1;
		 dp[1]=0;
		 dp[2]=1;
		 dp[3]=1;
		 for(int i=4;i<=n;++i)
		 {
			 if(i%3==0 && i%2==0)
			 dp[i]=Math.min(dp[i-1],Math.min(dp[i/2],dp[i/3]))+1;
		 else if(i%3==0)
			 dp[i]=Math.min(dp[i-1],dp[i/3])+1;
		 else if(i%2==0)
			 dp[i]=Math.min(dp[i-1],dp[i/2])+1;
			 else
			 dp[i]=dp[i-1]+1;
		 }
		 return dp[n];
     }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    System.out.println(minStepsto1(ab.nextInt()));
	}
	 }
}