import java.util.*;
import java.lang.*;
import java.io.*;
class removeAdjacentpairs
 {
 	public static void fn(char a[])
 	{
    //System.out.print(a);
 	    int n=a.length;
 	    int j=0,i=1;
 	    while(i<n)
 	    {
 	        if(j>=0 && a[i]==a[j] )
 	        {
 	            ++i;
              --j;
 	            continue;
 	        }
 	        a[++j]=a[i++];
 	    }
 	    for(i=0;i<=j;++i)
 	    System.out.print(a[i]);
 	}
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    fn(ab.next().toCharArray());
	    System.out.println();
	}
	 }
}
