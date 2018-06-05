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
	        if(str.charAt(i)=='0')
	        {
	            str.setCharAt(i,'1');
	           // System.out.print("t");
	            break;
	            
	        }
	        str.setCharAt(i,'0');
	        --i;
	    }
	    if(i==-1)
	    {
	        str=new StringBuffer("1".concat(str.toString()));
	    }
	    //System.out.println(str.length());
	     i=0;
	     len=str.length();
     while(i<=len-1)
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