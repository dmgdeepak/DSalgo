Idea is to use Binary Search and check which first element is less than 1st element of array


import java.util.*;
import java.lang.*;
import java.io.*;
class minimumNumber
 {
 public static int minimumNumber(int arr[],int n)
 {
	 int m=arr[0];
	 int l=0,r=n-1;
	 
	 while(l<=r)
	 {
	    int mid=(l+r)>>1;
		 if(arr[mid]<m && (mid==0 || arr[mid-1]>m))
		 return arr[mid];
		 if(arr[mid]>m)
		 l=mid+1;
		 else
		 r=mid-1;
	 }
	 return m;
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
	    System.out.println(minimumNumber(arr,n));
	}
	 }
}