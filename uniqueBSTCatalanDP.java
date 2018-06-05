import java.util.*;
import java.lang.*;
import java.io.*;
class uniqueBSTCatalanDP
 {
     public static int catalan(int n)
     {
         if(n<2)
         return n;
         int dp[]=new int[n+1];
         dp[0]=1;
         dp[1]=1;
         for(int i=2;i<=n;++i)
         {
             for(int j=0;j<i;++j)
             dp[i]+=dp[j]*dp[i-j-1];// -1 as we are calculating for Cn not for Cn+1
         }
         return dp[n];
     }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    System.out.println(catalan(n));
	}
	 }
}
