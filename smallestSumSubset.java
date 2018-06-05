Idea is to start from 1 and check until sum is less than array element.
If not then add current element to sum

import java.util.*;
import java.lang.*;
import java.io.*;
class smallestSumSubset
 {
	 public static int smallestSumSubset(int arr[],int n)
	 {
		 int res=1;
		 for(int i=0;i<n && res>=arr[i];++i)
			 res+=arr[i];
		 return res;
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
	    System.out.println(smallestSumSubset(arr,n));
	}
	 }
}