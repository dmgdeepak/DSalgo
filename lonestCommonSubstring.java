import java.util.*;
import java.lang.*;
import java.io.*;
class lonestCommonSubstring
 {
   public static String LCS(String a,String b)
   {
     int n=a.length();
     int m=b.length();
     int dp[][]=new int[n+1][m+1];
     int max=0,start=0;
     for(int i=1;i<=n;++i)
     {
       for(int j=1;j<=m;++j)
       {
         if(a.charAt(i-1)==b.charAt(j-1))
         {
           dp[i][j]=1+dp[i-1][j-1];
           if(max<dp[i][j])
           {
             max=dp[i][j];
             start=i-max;
           }
         }
       }
     }
     return a.substring(start,max+1);
   }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    System.out.println(LCS(ab.next(),ab.next()));
	}
	 }
}
