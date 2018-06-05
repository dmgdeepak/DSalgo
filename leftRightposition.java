https://practice.geeksforgeeks.org/problems/left-or-right-positioned-array/0

idea to use a temp array to check whether we have used all elements to make positioned array.
Here there is only 2 possibilities that either i=index or n-index-1;
Hence look at both condiotions.


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	 public static boolean leftRightposition(int arr[],int n)
	 {
		 boolean visited[]=new boolean[n];
		 for(int i=0;i<n;++i)
		 {
			 if(arr[i]<n)
			 {
				 if(!visited[arr[i]])
					 visited[arr[i]]=true;
				 else
					 visited[n-1-arr[i]]=true;
			 }
		 }
		 for(int i=0;i<n;++i)
			 if(!visited[i])
				 return false;
			 return true;
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
	    System.out.println(leftRightposition(arr,n)?"1":"0");
	}
	 }
}