import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    long n=ab.nextLong();
	    long o=Long.valueOf(n);
	   // System.out.println(o); 
	    //String str= "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	    char map[]= "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
				.toCharArray();
	   Deque<Character> q=new ArrayDeque<Character>();
	    while(n>0)
	    {
	        q.addFirst(map[(int)n%62]);
	        n/=62;
	    }
	   /* while(!q.isEmpty())
	    System.out.print(q.removeFirst()+" ") */
	    System.out.println(o);
	}
	 }
}