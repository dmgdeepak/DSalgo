Idea is to use dynamic programming using gap from 1 to length of string s.t. length of subsequence from i to j will be saved in dp[i][j]

It will fill upper diagonal matrix

import java.util.*;
import java.lang.*;
import java.io.*;
class LongestPalindromeSubsequenceDP
 {
	 public static int LongestPalindromeSubsequence(String str)
	 {
		 int len=str.length();
		 int dp[][]=new int[len][len]; // dp start with len(i) till len(j)
		 for(int i=0;i<len;++i)
			 dp[i][i]=1;
		 for(int gap=2;gap<=len;++gap)
		 for(int i=0;i<len-gap+1;++i)
		 {
			 int j=i+gap-1;
			if(str.charAt(i)==str.charAt(j))
			{
				if(gap==2)
					dp[i][j]=2;
				else
					dp[i][j]=Math.max(dp[i][j],2+dp[i+1][j-1]);
			}
			else
				dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
		 }
			 return dp[0][len-1];
	 }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    System.out.println(LongestPalindromeSubsequence(ab.next()));
	}
	 }
}