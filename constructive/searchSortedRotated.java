import java.util.*;
import java.lang.*;
import java.io.*;
class searchSortedRotated
 {
   public static int bSearch(int a[],int x,int n)
   {
      int l=0,r=n-1;
      while(l<=r)
      {
        int mid=(l+r)>>1;
        if(a[mid]==x)
        return mid;
      //atlest one of the subarray will be sorted so check if number ranges in sorted or not
      if(a[l]<=a[mid])
      {
        if(x>=a[l] && x<a[mid])
        r=mid-1;
        else
        l=mid+1;
      }
      else //if(a[mid]>=a[r])
      {
        if(x>a[mid] && x<=a[r])
        l=mid+1;
        else
        r=mid-1;
      }
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
	    int k=ab.nextInt();
	    System.out.println(bSearch(arr,k,n));
	}
	 }
}
