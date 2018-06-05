import java.util.*;
import java.lang.*;
import java.io.*;
class maxIndex
 {
	 public static int maxIndex(int arr[],int n)
	 {
		 int minindex=0,ans=-1;
		 int minEle=arr[0];
		 for(int i=1;i<n;++i)
		 {
			 if(arr[i]<minEle)
			 {
				 minEle=arr[i];
				minindex=i;
			 }
			 else
			 {
				 ans=Math.max(ans,i-minindex);
			 }
			 
		 }
		 return ans;
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
	    System.out.println(maxIndex(arr,n));
	}
	 }
}