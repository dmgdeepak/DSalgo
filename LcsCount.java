import java.util.*;
import java.lang.*;
import java.io.*;
class LcsCount
 {
   public static int LCScount(char a[],char b[],int i,int j,int m,int n)
   {
     if(j==n) return 1;
     if(i==m) return 0;
     int sum=0;
     if(a[i]==b[j])
     sum+=LCScount(a,b,i+1,j+1,m,n);
     sum+=LCScount(a,b,i+1,j,m,n);
     return sum;
   }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    System.out.println(LCScount(ab.next().toCharArray(),ab.next().toCharArray(),0,0,ab.nextInt(),ab.nextInt()));
	}
	 }
}
