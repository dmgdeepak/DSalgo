import java.util.*;
import java.lang.*;
import java.io.*;
class sumofAllSubSet
 {
	 public static int sumofAllSubSet(int arr[],int n,int sum)
	 {
		 boolean dp[][]=new boolean[n+1][sum+1];
		//if sum is 0
		for(int i=0;i<=n;++i)
			dp[i][0]=true;
		for(int i=1;i<=n;++i)
			for(int j=1;j<=sum;++j)
			{
				//exclude current element and check whether sum is already possible 
				dp[i][j]=dp[i-1][j];
				if(arr[i-1]>=j)
				dp[i][j]||=dp[i-1][j-arr[i-1]];	 //include current element
			}
			// print all possible sum
		 for(int i=0;i<=sum;++i)
		 {
				 if(dp[n][i])
			 System.out.print(i+" ");
		 }
	 }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt(),sum=0;
	    int arr[]=new int[n];
	    for(int i=0;i<n;++i)
	    {arr[i]=ab.nextInt();
	sum+=arr[i];}
	    sumofAllSubSet(arr,n,sum);
	    System.out.println();
	}
	 }
}