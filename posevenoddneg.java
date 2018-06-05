
import java.util.*;
import java.lang.*;
import java.io.*;
class posevenoddneg
 {
   public static void poschange(int arr[],int n)
   {
     int i=0,j=1;
     while(i<n && j<n)
     {while(i<n && arr[i]>0)
     i+=2;
     while(j<n && arr[j]<0)
     j+=2;
     System.out.println(i+" "+j);
     if(i<n && j<n)
     {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
     }
   }
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
      poschange(arr,n);
      for(int i=0;i<n;++i)
	    System.out.print(arr[i]+" ");
	}
	 }
}
