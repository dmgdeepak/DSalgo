idea is to save sum x from possible n dices 
See recursion in reference

import java.util.*;
import java.lang.*;
import java.io.*;
class possibleSumDiceDP
 {
	 public static long possibleSumDice(int m,int n,int x)
	 {
		 long dp[][]=new long[n+1][x+1];//sum x possible from nth dice
		 //for dice 1
		 for(int i=0;i<=x && i<=m;++i)
			 dp[1][i]=1;
		 for(int i=2;i<=n;++i)
		 {
			 for(int j=1;j<=x;++j)
			 {
				 for(int k=1;k<=m && k<j;++k)
					 dp[i][j]+=dp[i-1][j-k]; // possible sum from n-1 dice and k value is taken for nth dice so remaining sum needed is j-k
			 }
		 }
		 return dp[n][x];
	 }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int m=ab.nextInt();
	    int n=ab.nextInt();
	    int x=ab.nextInt();
	    System.out.println(possibleSumDice(m,n,x));
	}
	 }
}

reference :
practice.geeksforgeeks.org/problems/dice-throw