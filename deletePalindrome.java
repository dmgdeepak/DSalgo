// idea is to get minimum steps for the substring from i to j

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	 public static int deletePalindrome(String str,int n)
	 {
		 int dp[][]=new int[n+1][n+1];
		 // length of string to get computed
		 for(int len=1;len<=n;++len)
		 {
			 // start and end index of string
			 for(int i=0, j=len-1;j<n;++i, ++j)
			 {
				 //length is 1 then 1 step needed
				 if(len==1)
					 dp[i][j]=1;
				 else
				 {
					 //delete ith charActer and go with next index to end
					 dp[i][j]=1+dp[i+1][j];
					 // if two continuos chars are same
					 if(str.charAt(i)==str.charAt(i+1))
						 dp[i][j]=Math.min(dp[i][j],1+dp[i+2][j]);
					 //check with palindrome substring
					 for(int k=i+2;k<=j;++k)
					 {
						 if(str.charAt(i)==str.charAt(k))
						 {
							 // steps to delete i to k (1 incase of palindrome) + k+1 to j
							  dp[i][j]=Math.min(dp[i][j],dp[i+1][k-1]+dp[k+1][j]);
						 }
					 }
				 }
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
	   String str=ab.next();
	    System.out.println(deletePalindrome(str,n));
	}
	 }
}