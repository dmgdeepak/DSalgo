import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	 public static int getelement(int arr[],int pos,boolean flag,int n)
	 {
		 if(flag)
		 {
			 while(pos<n && (arr[pos]&1)==1)
			 {
				 ++pos;
			 }
		 }
		 else{
			  while(pos<n && (arr[pos]&1)==0)
			 {
				 ++pos;
			 }
		 }
		 return pos;
	 }
     public static void evenOddpos(int arr[],int n)
	 {
		 int epos=0,opos=0;//even odd position pointer
		 boolean i=true;
		 while(epos<n && opos<n)
		 {
			if(i)
			{
				epos=getelement(arr,epos,true,n);
				if(epos<n)
					System.out.print(arr[epos++]+" "); 
			}
			else
			{
				opos=getelement(arr,opos,false,n);
				if(opos<n)
					System.out.print(arr[opos++]+" "); 
			}
			i=!i;
		 }
		// System.out.println("\n odd pos : "+opos+" even pos "+epos);
		 while(epos<n)
		    if((arr[epos++]&1)==0)
			 {System.out.print(arr[--epos]+" ");
			     ++epos;
			 } 
		 while(opos<n)
		 if((arr[opos++]&1)==1)
			 {System.out.print(arr[--opos]+" ");
			     ++opos;
			 }
	 }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;++i)
	    arr[i]=ab.nextInt();
	evenOddpos(arr,n);
	    System.out.println();
	}
	 }
}