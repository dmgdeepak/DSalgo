import java.util.*;
import java.lang.*;
import java.io.*;
class inversionArray
 {
   public static int countInversion(int arr[],int n)
   {
     return mergeSort(arr,0,n-1);
   }
   public static int mergeSort(int arr[],int lo,int hi)
   {
     int inversion=0;
     if(lo<hi){
       int mid=(lo+hi)>>1;
     inversion=mergeSort(arr,lo,mid);
     inversion+=mergeSort(arr,mid+1,hi);
     inversion+=merge(arr,lo,mid+1,hi);
   }
   return inversion;
 }
 public static int merge(int arr[],int lo,int mid,int hi)
 {
   int temp[]=new int[hi-lo+1];
   int i=lo,j=mid;
   int inv=0,k=0;
   while(i<=mid-1 && j<=hi)
   {
     if(arr[i]<=arr[j])
     {
       temp[k++]=arr[i++];
     }
     else
     {
       inv+=mid-i;
       temp[k++]=arr[j++];
     }
   }
   while(i<=mid-1)
   temp[k++]=arr[i++];
   while(j<=hi)
   temp[k++]=arr[j++];
   k=0;
   for(i=lo;i<=hi;++i)
   {
     arr[i]=temp[k++];
   }
   return inv;
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
	    System.out.println(countInversion(arr,n));
	}
	 }
}
