import java.util.*;
import java.lang.*;
import java.io.*;
class rangeofnumber
 {
	 public static int getIndex(int arr[],int n,int k,boolean flag)
	 {
		 int l=0,h=n-1;
		 int index=-1;
		 while(l<=h)
		 {
			 int mid=(l+h)>>1;
			 if(arr[mid]==k)
			 {
				 index=mid;
			 if(flag)
				 h=mid-1;
			 else
				 l=mid+1;
			 }
			 else if(arr[mid]<k)
				 l=mid+1;
			 else
				 h=mid-1;
		 }
		 return index;
	 }
	 public static void range(int arr[],int n,int target)
	 {
		int a=getIndex(arr,n,target,true);
		int b=getIndex(arr,n,target,false);
		System.out.println(a+" "+b);
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
	range(arr,n,ab.nextInt());
	    System.out.println();
	}
	 }
}