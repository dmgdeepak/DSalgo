import java.util.*;
import java.lang.*;
import java.io.*;
class longestcommonBinary
 {
   public static String LCS(String a,String b)
   {
     int n=a.length();
     int m=b.length();
     int dp[][]=new int[n+1][m+1];
     int max=0,row=0,col=0;
     String res="";
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
             row=i;
             col=j;
           }
         }
       }
     }
     while(row>=0 && col>=0 && dp[row][col]!=0)
     {
       res=a.charAt(row-1)+res;
       --row;
       --col;
     }
     return res;
   }
   public static int generateNumber(String c)
   {
     return Integer.parseInt(c,2);
   }
 	public static int fn(int a,int b)
 	{
    String s=Integer.toBinaryString(b);
    String s2=Integer.toBinaryString(a);
    String res=new String();
    String common=LCS(s,s2);
    //System.out.println(common);
    return generateNumber(common);
 	}
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
    int m=ab.nextInt();
    int n=ab.nextInt();
	    System.out.println(fn(Math.max(m,n),Math.min(m,n)));
	}
	 }
}
