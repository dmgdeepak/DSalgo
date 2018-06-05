import java.util.*;
import java.lang.*;
import java.io.*;
class PalindromePartitiondp
 {
   public static  int minPalindromePartition(String str)
   {
     int n=str.length();
     boolean dp[][]=new boolean[n][n];
     for(int i=0;i<n;++i)
     dp[i][i]=true;
     for(int gap=2;gap<=n;++gap)
     {
       for(int i=0,j=i+gap-1;j<n;++j,++i)
       {
         if(str.charAt(i)==str.charAt(j))
         {
           if(gap==2)
           dp[i][j]=true;
           else
           dp[i][j]=dp[i+1][j-1];
         }

       }
     }
  /*   for(int i=0;i<n;++i)
     for(int j=0;j<n;++j)
     {
       if(dp[i][j])
       System.out.println(i+" "+j);
     } */
     int res=0;
     int cut[]=new int[n];
     for(int i=0;i<n;++i)
     {
       if(dp[0][i])
       cut[i]=0;
       else
       {
         cut[i]=Integer.MAX_VALUE;
         for(int j=0;j<i;++j)
         {
           if(dp[j+1][i])
           cut[i]=Math.min(cut[i],1+cut[j]);
         }
       }
     }
     return cut[n-1];
   }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    System.out.println(minPalindromePartition(ab.next()));
	}
	 }
}
