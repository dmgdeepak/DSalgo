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
	    StringBuffer str=new StringBuffer(ab.next());
	    int len=str.length();
	    int i=len-1;
	    while(i>=0)
	    {
	        if(str.charAt(i)=='1')
	        {
	            str.setCharAt(i,'0');
	            break;
	        }
	        str.setCharAt(i,'1');
	        --i;
	    }
	    i=0;
	    while(i<len-1)
	    {
	        if(str.charAt(i)=='1')
	        {len=i;
	            break;
	        }
	        ++i;
	    }
	    System.out.println(str.substring(len));
	}
	 }
}