First Element having position same as its sorted array

i.e. 

The position of first element such that all left elements are less and right elements are greater.



Approach 1:

Sort array and check if sorted array and given array have same element value then return that

This will take O(nlogn)



Approach 2:

 Store min element from right hand side and max from left hand side and check when element is greater than left hand max ans right hand min value.





import java.util.*;
import java.lang.*;
import java.io.*;
class starElement
 {
	 public static int starElement(int arr[],int n)
	 {
		 int res=-1;
		 // hold minimum value from right to current element
		 int Rmax[]=new int[n];
		 Rmax[n-1]=arr[n-1];
		 for(int i=n-2;i>0;--i)
		 {
			 Rmax[i]=Math.min(Rmax[i+1],arr[i]);
		 }
		 //lmax will hold max from 0 to i-1th element
		 int lmax=arr[0];
		 for(int i=1;i<n-1;++i)
		 {
			 if(arr[i]>=lmax && arr[i]<=Rmax[i+1])
				 return arr[i];
				// System.out.println("Element is "+arr[i]+" left max "+lmax+" rmax "+Rmax[i]);
			 lmax=Math.max(lmax,arr[i]);
		 }
		 return -1;
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
	    System.out.println(starElement(arr,n));
	}
	 }
}