import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
   public static void subarray(int arr[],int n)
   {
     int s,e;
     s=e=-1;
     //find index when next element is smaller
     for(int i=1;i<n;++i)
     {
       if(arr[i]<arr[i-1])
       {
         s=i-1;
         break;
       }
     }
     //find index when previous element is greater
     for(int i=n-2;i>=0;--i)
     {
       if(arr[i]>arr[i+1])
       {
         e=i+1;
         break;
       }
     }


     //check whether if this is not answer and we need to add more elements
     //check max and min elements in s...e and if any min or max than that present outside s...e
     //it means if 0.. s subarray has value greater than its min and same for max
     //System.o
     if(s!=-1 && e!=-1)
    { int min=arr[s];
     int max=arr[s];
     for(int i=s+1;i<=e;++i)
     {
       min=Math.min(min,arr[i]);
       max=Math.max(max,arr[i]);
     }
     for(int i=0;i<s;++i)
     {
       if(arr[i]>min){
       s=i;
       break;}
     }

     for(int i=n-1;i>e;--i)
     {
       if(arr[i]<max){
       e=i;
       break;}
     }}
     System.out.println(s+" "+e);
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
	  System.out.println("0 0");
	}
	 }
}
