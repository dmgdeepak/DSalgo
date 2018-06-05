//count a+b==c
import java.util.*;
import java.lang.*;
import java.io.*;
class countTriplet
 {
   public static int countTriplet(int arr[],int n)
   {
     Arrays.sort(arr);
     int count=0;
     for(int i=n-1;i>1;--i)
     {
       int l=0,h=i-1;
       while(l<h)
       {
         if(arr[l]+arr[h]==arr[i])
      {   ++count;
      ++l;}
         else if(arr[l]+arr[h]<arr[i])
         ++l;
         else
         --h;
       }
     }
     return (count>0)?count:-1;
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
	    System.out.println(countTriplet(arr,n));
	}
	 }
}
