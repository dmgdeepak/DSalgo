import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     public static void preorder(int start,int end,int arr[])
     {
         if(start>end)
         return;
         int k=(start+end)/2;
         System.out.print(arr[k]+" ");
         preorder(0,k-1,arr);
         preorder(k+1,end,arr);
     }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    arr[i]=ab.nextInt();
	    preorder(0,n-1,arr);
	    System.out.println();
	}
	 }
}