import java.util.*;
import java.lang.*;
import java.io.*;
class deletionToGetPalindrome
 {
	 public static int maxPalindrome(String str,int len)
	 {
		 int dp[][]=new int[len][len];
		 for(int i=0;i<len;++i)
			 dp[i][i]=1;
		 for(int gap=2;gap<=len;++gap)
			 for(int i=0;i<n-gap+1;++i)
			 {
				 int j=i+gap-1;
				 if(str.charAt(i)==str.charAt(j) && gap==2)
					 dp[i][j]=2;
				 else if(str.charAt(i)==str.charAt(j))
					 dp[i][j]=dp[i+1][j-1]+2;
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
	    int len=ab.nextInt();
	    String str=ab.next();
	    System.out.println(len-maxPalindrome(str,len));
	}
	 }
}