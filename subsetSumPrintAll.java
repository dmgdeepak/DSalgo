import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	 static boolean dp[][];
	 static int count=0; // count no. of subsets
	 public static void printSubSequence(int arr[],int sum,int i,ArrayList<Integer> res)
	 {
		 if(i==0 && sum!=0 && dp[sum][i])
		 {
			 res.add(arr[i]);
			 //print res
			 res.clear();
			 ++count;
			 return;
		 }
		 if(sum==0 && i==0)
		 {
			 //print res
			 res.clear();
			 ++count;
			 return ;
		 }
		 // subset can be get by ignoring this element
		 if(dp[sum][i-1])
		 {
			 ArrayList<Integer> t=new ArrayList<Integer>();
			 t.addAll(res);
			  printSubSequence(arr,sum,i-1,t);
		 }
		 //subset can be get by including this element i-1 as to include value of this element and remaining sum can be obtained from 0 - j-1 subset
		 if(sum>=arr[i] && dp[sum-arr[i]][i-1])
		 {
			 res.add(arr[i]);
			 printSubSequence(arr,sum-arr[i],i-1,res);
		 }
	 }
	 public static void subSetSum(int arr[],int sum,int n)
	 {
		 dp=new boolean[sum+1][n+1];
		 for(int i=0;i<n;++i)
		 {
			 //sum 0 can be acheived by excluding all elements
			 dp[0][i]=true;
		 }
		 for(int i=1;i<=sum;++i)
			 for(int j=1;j<=n;++j)
			 {
				 dp[i][j]=dp[i][j-1];
				 if(i>=arr[j-1])
				 dp[i][j]=dp[i][j]|dp[i-arr[j-1]][j-1];
			 }
			 if(dp[sum][n])
				 printSubSequence(arr,sum,n-1,new ArrayList<Integer>());
	 }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
		count=0;
	    int n=ab.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;++i)
	    arr[i]=ab.nextInt();
	    int sum=ab.nextInt();
		subSetSum(arr,sum,n);
		//System.out.println(dp[sum][n]);
		System.out.println(count);
	}
	 }
}