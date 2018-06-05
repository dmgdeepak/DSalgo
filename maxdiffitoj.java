import java.util.*;
import java.lang.*;
import java.io.*;
class maxdiffitoj
 {
	 public static int maxDiff(int arr[],int n)
	 {
		 int min=arr[0],res=0;
		 for(int i=1;i<n;++i)
		 {
			 if(arr[i]<min)
				 min=arr[i];
			 else
				 res=Math.max(res,arr[i]-min);
		 }
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
	    System.out.println(maxDiff(arr,n));
	}
	 }
}