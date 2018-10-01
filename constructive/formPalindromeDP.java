import java.util.*;
import java.lang.*;
import java.io.*;
class formPalindromeDP
 {
	public static int formPalindrome(String str)
	{
		int len=str.length();
		int dp[][]=new int[len+1][len+1];
		for(int gap=1;gap<len;++gap)
		{
			for(int i=0,j=gap;j<len;++i,++j)
			{
				if(str.charAt(i)==str.charAt(j))
					dp[i][j]=dp[i+1][j-1];
				else
					dp[i][j]=Math.min(dp[i+1][j],dp[i][j-1])+1;
			}
		}
		return dp[0][len-1];
	}
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    System.out.println(formPalindrome(ab.next()));
	}
	 }
}