import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     public static int count;
     public static void track(int i,int j)
     {
         if(i==1 || j==1)
         return ;
         count++;
         track(i-1,j);
         track(i,j-1);
     }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    count=0;
	    int x=ab.nextInt();
	    int y=ab.nextInt();
	    track(x,y);
	    System.out.println(count+1);
	}
	 }
}