import java.util.*;
import java.lang.*;
import java.io.*;
class pathinMatrix
 {
 	public static int fn(int arr[],int n)
 	{
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
	    System.out.println(fn(arr,n));
	}
	 }
}
