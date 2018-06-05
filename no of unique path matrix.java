import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     
	public static int check(int x,int y)
	{
	    if(x==1 || y==1)
	    return 1;
	    return check(x-1,y)+check(x,y-1);
	}
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t>0)
	{
	    int x=ab.nextInt();
	    int y=ab.nextInt();
	    System.out.println(check(x,y));
	    t--;
	}
	 }
}