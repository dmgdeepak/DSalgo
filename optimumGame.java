import java.util.*;
import java.lang.*;
import java.io.*;
class optimumGame
 {
	 public static int optimumGame(int arr[],int n)
	 {
		 int dp[][]=new int[n][n];
		 for(int gap=0;gap<n;++gap)
		 {
			 for(int i=0,j=gap;j<n;++i,++j)
			 {
				 int x=(i+2<=j)?dp[i+2][j]:0;
				 int y=(i+1<=j-1)?dp[i+1][j-1]:0;
				 int z=(i<=j-2)?dp[i][j-2]:0;
				 dp[i][j]=Math.max(arr[i]+Math.min(y,x),arr[j]+Math.min(y,z));
			 }
		 }
		 return dp[0][n-1];
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
	    System.out.println(optimumGame(arr,n));
	}
	 }
}