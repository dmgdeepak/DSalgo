import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public int greedyFox(int arr[],int n)
	{
		int l=1;
		int max=arr[0];
		int cur=arr[0];
		while(l<n)
		{
			if(arr[l-1]<arr[l])
				cur+=arr[l];
			else
				cur=0;
			max=Math.max(max,cur);
			++l;
		}
		return max;
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
	    System.out.println(greedyFox(arr,n));
	}
	 }
}