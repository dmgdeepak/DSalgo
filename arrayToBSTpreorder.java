import java.util.*;
import java.lang.*;
import java.io.*;
class arrayToBSTpreorder
 {
   public static void arrayToBST(int arr[],int h,int l)
   {
       if(l>h)
       return;
     if(l==h)
     {System.out.print(arr[l]+" ");
      return;
      }
      int mid=(l+h)>>1;
      System.out.print(arr[mid]+" ");
    //  if(mid-1>=0)
      arrayToBST(arr,mid-1,l);
      arrayToBST(arr,h,mid+1);
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
      arrayToBST(arr,n-1,0);
	    System.out.println();
	}
	 }
}
