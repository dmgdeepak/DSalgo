import java.util.*;
import java.lang.*;
import java.io.*;
class SubArrayPair
 {
	public static int SubArrayPair(int arr[],int n)
	{
		boolean visited[]=new boolean[11];
		int l=0,r=0,c=0;
		while(r<n)
		{
			while(r<n && !visited[arr[r]])
			{
				visited[arr[r]]=true;
				c+=r++-l;
			}
				while(l<r && r<n && visited[arr[r]])
				{
				    
					visited[arr[l]]=false;
					++l;
				}
			
		}
		return c;
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
	    System.out.println(SubArrayPair(arr,n));
	}
	 }
}