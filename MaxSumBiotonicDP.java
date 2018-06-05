import java.util.*;
import java.lang.*;
import java.io.*;
class MaxSumBiotonicDP
 {
	 public static int MaxSumBiotonic(int arr[],int n)
	 {
		 int ls[]=new int[n];
		 int rs[]=new int[n];
		 ls[0]=arr[0];
		 int temp=arr[0];
		 for(int i=1;i<n;++i)
		 {
			 if(arr[i]>temp)
			 {
				 temp=arr[i];
				 ls[i]=ls[i-1]+arr[i];
			 }
			 else
				 ls[i]=ls[i-1];
		 }
		 rs[n-1]=arr[n-1];
		 temp=arr[n-1];
		 for(int i=n-2;i>=0;--i)
		 {
			 if(arr[i]>temp)
			 {
				 temp=arr[i];
				 rs[i]=rs[i+1]+arr[i];
			 }
			 else
				 rs[i]=rs[i+1];
		 }
		 for(int i=0;i<n;++i)
		 {
			 temp=Math.max(temp,ls[i]+rs[i]-arr[i]);
		 }
		 return temp;
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
	    System.out.println(MaxSumBiotonic(arr,n));
	}
	 }
}