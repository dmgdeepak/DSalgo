import java.util.*;
import java.lang.*;
import java.io.*;
class longestAP
 {
 	public static int fn(int a[],int n)
 	{
    if(n<=2) return n;
    int dp[][]=new int[n][n];
    int res=2;
    for (int i = 0; i < n; i++)
           dp[i][n - 1] = 2;
    //fixing jth pointer and looking both side for AP pair having a[i]+a[k]==2*a[j]
    for(int j=n-2;j>=1;--j)
    {
      int i=j-1,k=j+1;
      while(i>=0 && k<n)
      {
        if(a[i]+a[k]==2*a[j])
        {
          dp[i][j]=dp[j][k]+1;
          res=Math.max(res,dp[i][j]);
          --i;
          ++k;
        }
        else
        {
          dp[i][j]=Math.max(dp[i][j],2);
          if(a[i]+a[k]<2*a[j])
          ++k;
          else
          --i;
        }
      }
      while (i >= 0)
           {
               dp[i][j] = 2;
               i--;
           }
    }
    return res;
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
	    System.out.println(fn(arr,n));
	}
	 }
}
