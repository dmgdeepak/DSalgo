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
	    int n=ab.nextInt()%100000007;
	    int r=ab.nextInt()%100000007;
	    int res=1;
	    while(r>0)
	    {
	        if((r&1)==1)
	        res=(res*n)%100000007;
	        r=r>>1;
	        n=(n*n)%100000007;
	        if(res==0)
	        res=1;
	        if(n==0)
	        n=1;
	    }
	    System.out.println(res);
	}
	 }
}