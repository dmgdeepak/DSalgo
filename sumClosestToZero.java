import java.util.*;
import java.lang.*;
import java.io.*;
class sumClosestToZero
 {
   public static void closestNumber(int arr[],int n)
   {
     Arrays.sort(arr);
     int a=arr[0],b=arr[n-1];
     int min=Integer.MAX_VALUE;
     int l=0,r=n-1;
     while(l<r)
     {
       int sum=arr[l]+arr[r];
       if(Math.abs(sum)<min)
       {
         min=Math.abs(sum);
         a=arr[l];
         b=arr[r];
       }
       if(sum<0)
       ++l;
       else
       --r;
     }
     System.out.print(a+" "+b);
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
      closestNumber(arr,n);
	    System.out.println();
	}
	 }
}
