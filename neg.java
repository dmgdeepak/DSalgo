class neg
{
public static void main(String args[])
{
int i=-1001;
System.out.print(i);
}
}
1
10 10
1 12 13 14 41 49 51 57 60 82 89 101 102 110 113 120 122 140 141 143
11 13 15 17 34 36 45 87 22 44


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t>0)
	{
	    String str=ab.next();
	    int len=str.length();
	    int i=0,count=0,count1=0,gv=0;
	    while(i<len)
	    {
	        if(str.charAt(i)=='(')
	        {
	            count++;
	             //System.out.println(str.charAt(i)+"count "+count+" count1 "+count1);
	        }
	        else if(str.charAt(i)==')')
	        {
	            if(count1<count)
	            count1++;
	           //System.out.println(str.charAt(i)+"count "+count+" count1 "+count1);
	        else
	        {
	            gv+=count1;
	            count1=0;
	            count=0;
	        }
	        }
	        i++;
	    }
	    System.out.println(2*(gv+count1));
	    t--;
	}
	 }
}