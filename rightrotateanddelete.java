import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     public static void rightRotateDelete(int arr[],int n)
     {
         int size=n,i=n-1,k=1,count=0;
         while(size!=1)
         {
             int pos=i;
             if(k<=size){
                  count=0;
             while(count<k)
             {
                 pos=(pos-->0)?pos:n-1;
                 if(arr[pos]>0)
                 ++count;
             }}
             arr[pos]=-1;
             --size;
             ++k;
             i=(i-->0)?i:n-1;
             while(arr[i]<=0)
            i=(i-->0)?i:n-1;
         }
         for(int f:arr)
         if(f>0)
        { System.out.print(f);
            break;
        }
         //return count;
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
	    rightRotateDelete(arr,n);
	    System.out.println();
	}
	 }
}