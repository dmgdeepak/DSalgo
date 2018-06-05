import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	 public static int letterwriter(int n)
	 {
		 if(n<10 || n==11)
			 return -1;
		 if(n==10)
			 return 1;
		 int dp[]=new int[n+1];
		 dp[10]=1;
		 dp[12]=1;
		 for(int i=20;i<=n;++i)
		 {
			 if(dp[i-10]>0)
				 dp[i]=dp[i-10]+1;
			 if(dp[i-12]>0 )
			 {
				 if(dp[i]<1)
				 dp[i]=dp[i-12]+1;
			 else
				 dp[i]=Math.min(dp[i],dp[i-12]+1);
			 }
		 }
		 return (dp[n]>0)?dp[n]:-1;
	 }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    System.out.println(letterwriter(n));
	}
	 }
}