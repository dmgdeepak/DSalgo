import java.util.*;
import java.lang.*;
import java.io.*;
class countzero
 {
	public static int countZero(int arr[],int n)
	{
		int l=0,r=n-1;
		int mid=0;
		while(l<=r)
		{
		    
			 mid=(l+r)>>1;
		    if(l==r)
		   {//System.out.println(l+" r"+r);
		    if(arr[mid]!=1)
		       return n-mid;
		       else
		       return n-mid-1;
		   }
			if(arr[mid]==1)
				l=mid+1;
			else if(arr[mid]==0)
			{
				if(mid==0 || arr[mid-1]==1)
					return n-mid;
					
					r=mid-1;
			}
				
		}
		return n-mid;
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
	    System.out.println(countZero(arr,n));
	}
	 }
}