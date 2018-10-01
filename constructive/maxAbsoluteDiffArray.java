//https://practice.geeksforgeeks.org/problems/max-absolute-difference/0
/* Solution will be minimum of left/right -max of right/left */
import java.util.*;
import java.lang.*;
import java.io.*;
class maxAbsoluteDiffArray
 {
   public static void ComputeLMax(int res[],int a[],int n)
   {
     int cur=a[0],max=a[0];
     res[0]=a[0];
     for(int i=1;i<n;++i)
     {
       cur=Math.max(cur+a[i],a[i]);
       if(cur>max)
       max=cur;
       res[i]=max;
     }
   }
   public static void ComputeRMax(int res[],int a[],int n)
   {
     int cur=a[n-1],max=a[n-1];
     res[n-1]=a[n-1];
     for(int i=n-2;i>=0;--i)
     {
      cur=Math.max(cur+a[i],a[i]);
       if(cur>max)
       max=cur;
       res[i]=max;
     }
   }
 	public static int fn(int a[],int n)
 	{
    int lmin[]=new int[n];
    int rmin[]=new int[n];
    int rmax[]=new int[n];
    int lmax[]=new int[n];
    int invert[]=new int[n];
    for(int i=0;i<n;++i)
    invert[i]=-a[i];
    ComputeLMax(lmin,invert,n);
    ComputeRMax(rmin,invert,n);
    ComputeRMax(rmax,a,n);
    ComputeLMax(lmax,a,n);
    for(int i=0;i<n;++i)
    lmin[i]=-lmin[i];
    for(int i=0;i<n;++i)
    rmin[i]=-rmin[i];
    int max=Integer.MIN_VALUE;
    for(int i=0;i<n-1;++i)
    {
        max=Math.max(max,Math.abs(lmin[i]-rmax[i+1]));
        max=Math.max(max,Math.abs(lmax[i]-rmin[i+1]));
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
	    System.out.println(fn(arr,n));
	}
	 }
}
