import java.util.*;
import java.lang.*;
import java.io.*;
class geekandCoin
 {
 	public static boolean fn(int n,int x,int y)
 	{
    if(n<0) return false;
    if(n==1 || n==x || n==y ) return true;
    boolean flag=fn(n-1-1,x,y)&&fn(n-x-1,x,y)&&fn(n-y-1,x,y);
    flag|=fn(n-1-x,x,y)&&fn(n-x-x,x,y)&&fn(n-y-x,x,y);
    flag|=fn(n-1-y,x,y)&&fn(n-x-y,x,y)&&fn(n-y-y,x,y);
    return flag;
 	}
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int x=ab.nextInt();
	    int y=ab.nextInt();
	    System.out.println(fn(n,x,y));
	}
	 }
}
