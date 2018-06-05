Idea is to check if number&1 is 1
and number -1 is power of 2

import java.util.*;
import java.lang.*;
import java.io.*;
class firstLastSetBit
 {
     public static boolean firstLastBit(int n)
     {
         if(n==1)
         return true;
         if(((n&1)==1) && (((n-1)&(n-2))==0))
         return true;
         return false;
     }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    System.out.println(firstLastBit(n)?"1":"0");
	}
	 }
}