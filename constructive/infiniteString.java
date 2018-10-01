import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
 	public static char fn(int n)
 	{
 	    if(n==0) return ' ';
 	    char res[]={'1','2','3','4','5','$','5','4','3','2','1'};
 	    long len=11;
 	    int k=1;
 	    while(len<n)
 	    {
 	        len=2*len+(++k);
 	    }
 	    while(n>11)
 	    {
 	        long prevlen=(len-k)/2;
 	        if(n>prevlen)
 	       { n-=prevlen;
 	        if(n<=k) return '$';
 	        n-=k;}
 	        --k;
 	        len=prevlen;
 	    }
 	    return res[n-1];
 	}
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    System.out.println(fn(n));
	}
	 }
}
