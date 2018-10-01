Idea is to find sum of all column from i to j 
Apply kadane on that sum

import java.util.*;
import java.lang.*;
import java.io.*;
class maximumSubMatrixAreasumdp
 {
	  public static int kadane(int arr[],int n)
	  {
		  int res=0;
		  int temp=0,min=Integer.MIN_VALUE;
		  boolean flag=false;
		  for(int i=0;i<n;++i)
		  {
			  temp+=arr[i];
			  min=Math.max(min,arr[i]);
			  if(temp<0)
				  temp=0;
			  if(temp>res)
			  {
				  res=temp;
				  flag=true;
			  }
		  }
		  if(!flag) // if all values are negative then return minimum value
		  {
			  return min;
		  }
		  return res;
	  }
	 public static int maximumSubMatrixAreasum(int arr[][],int row,int n)
	 {
		 int max=Integer.MIN_VALUE;
		 for(int c=0;c<n;++c) //staring col index
		 {
			 int dp[]=new int[row];
			 for(int fromcol=c;fromcol<n;++fromcol)// from start to end col
			 {
				 for(int i=0;i<row;++i)
				 dp[i]+=arr[i][fromcol]; // sum of col from start to end
				int res=kadane(dp,row); //kadane algo for maximum sum
				if(res>max)
				{
					max=res;
				}
			 }
		 }
		 return max;
	 }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int m=ab.nextInt();
	    int n=ab.nextInt();
	    int arr[][]=new int[m][n];
	    for(int i=0;i<m;++i)
	    for(int j=0;j<n;++j)
	    arr[i][j]=ab.nextInt();
	    System.out.println(maximumSubMatrixAreasum(arr,m,n));
	}
	 }
}