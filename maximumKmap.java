http://practice.geeksforgeeks.org/problems/maximum-value-k/0
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	 public static int maximumK(int arr[],int n)
	 {
		int hash[]=new int[n+1];
		for(int i=0;i<n;++i)
		{
			if(arr[i]<n)
				++hash[arr[i]];
			else
				++hash[n];
		}
		int res=0;
		for(int i=n;i>=0;--i)
		{
			res+=hash[i];
			if(res>=i)
				return i;
		}
		return 0;
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
	    System.out.println(maximumK(arr,n));
	}
	 }
}

13
67 34 0 69 24 78 58 62 64 5 45 81 27 