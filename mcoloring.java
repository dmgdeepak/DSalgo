import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     public static boolean isSafe(boolean arr[][],int n,int j,int c)
     {
         for(int v=0;v<n;v++)
         if(arr[j][v] && c==color[i])
         return false;
         return true;
     }
     public static boolean color(boolean arr[][],int v,int c,int clr[])
     {
         for(int i=0;i<c;i++)
         {
             if(isSafe(arr,v,i,)
         }
     }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int v=ab.nextInt();
	    int c=ab.nextInt();
	    int e=ab.nextInt();
	    boolean arr[][]=new boolean[v][v];
	    for(int i=0;i<e;i++)
	    {int p=ab.nextInt();
	     int l=ab.nextInt();   
	        arr[p][l]=true;
	    }
	    int clr[]=new int[c];
	    if(color(arr,v,0,clr))
	    System.out.println("1");
	    else
	    System.out.println("0");
	}
	 }
}