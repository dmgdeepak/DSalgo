10
5 1079 950 901 899 801 750 650 10 1 

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	 public static int BiotonicMaxSearch(int arr[].int n)
	 {
		 int l=0,r=n-1;
		 while(l<r)
		 {
			 int mid=(l+r)>>1;
			 if((mid>0 && arr[mid-1]>arr[mid]) || (mid<n-1 && arr[mid]>arr[mid+1]))
				 r=mid-1;
			 else
				 l=mid+1;
				 
		 }
		 return arr[mid];
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
	    System.out.println(BiotonicMaxSearch(arr,n));
	}
	 }
}