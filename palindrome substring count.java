import java.util.*;
import java.lang.*;
import java.io.*;
class hackerranksolutionc
 {
     public static int palindrome_count(String str,int n)
     {
         if(n==1)
         return 0;
         boolean dp[][]=new boolean[n][n];
         int count[][]=new int[n][n];
         //length 1
         for(int i=0;i<n;++i)
         dp[i][i]=true;
         //length 2
         for(int i=0;i<n-1;++i)
         {
             if(str.charAt(i)==str.charAt(i+1))
             {dp[i][i+1]=true;
                 count[i][i+1]=1;
             }
         }
         //for length >2
         for(int gap=2;gap<n;++gap)
         {
             for(int i=0;i<n-gap;++i)
             {
                 int j=gap+i;
                 if(str.charAt(i)==str.charAt(j) && dp[i+1][j-1])
                 {dp[i][j]=true;
                 count[i][j]=1+count[i][j-1]+count[i+1][j]-count[i+1][j-1];
                } else
                 count[i][j]=count[i][j-1]+count[i+1][j]-count[i+1][j-1];
             }
         }
         return count[0][n-1];
     }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    System.out.println(palindrome_count(ab.next(),n));
	}
	 }
}
