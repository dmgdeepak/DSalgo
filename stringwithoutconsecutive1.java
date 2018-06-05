Idea is to save occurence of string ending with 0 and 1

in 0 we can add 0 , 1 but in 1 only 0

Another approach is to find fibonacci of n+2 and by formula of fibonacci it can be done in logn time and space

import java.util.*;
import java.lang.*;
import java.io.*;
class stringwithoutconsecutive1
 {
     public static int consecutive1(int n)
     {
      int with1[]=new int[n]   ;
      int without1[]=new int[n]   ;
      with1[0]=without1[0]=1;
	  for(int i=1;i<n;++i)
	  {
		  with1[i]=with1[i-1]+without1[i-1];
		  without1[i]=with1[i-1];
	  }
	  return with1[n-1]+without1[n-1];
     }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    System.out.println(consecutive1(n));
	}
	 }
}