import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	 public static int minJumps(int arr[],int n)
	 {
		 int dp[]=new int[n];
		 Arrays.fill(dp,Integer.MAX_VALUE);
		 if(arr[0]>0)
			 dp[0]=0;
		 for(int i=0;i<n;++i)
		 {
			 if(dp[i]!=Integer.MAX_VALUE)
			 for(int j=i+1;j<n && j<=(i+arr[i]);++j)
			 {
			     // System.out.println("loop");
				 dp[j]=Math.min(dp[j],1+dp[i]);
			 }
		 }
		/* for(int x:dp)
		 System.out.print(x+" ");*/
		 return dp[n-1];
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
	    System.out.println(minJumps(arr,n));
	}
	 }
}