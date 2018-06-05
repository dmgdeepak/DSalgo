import java.util.*;
import java.lang.*;
import java.io.*;
class unboundedKnapSackdp
 {
	 public static int unboundedKnapSack(int val[],int wt[],int n,int w)
	 {
		 int dp[]=new int[w+1];
		 for(int i=0;i<=w;++i)
		 {
			 for(int j=0;j<n;++j)
			 { if(wt[j]<=i)
			 dp[i]=Math.max(dp[i],dp[i-wt[j]]+val[j]);
		 }}
		 return dp[w];
	 }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int w=ab.nextInt();
	    int val[]=new int[n];
	    int wt[]=new int[n];
	    for(int i=0;i<n;++i)
	    {
	    val[i]=ab.nextInt();  
	    }
	    
	    for(int i=0;i<n;++i)
	    {
	    wt[i]=ab.nextInt();  
	    }
	    System.out.println(unboundedKnapSack(val,wt,n,w));
	}
	 }
}