import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     public static int inversion(int []arr,int n,int k)
     {
         int c=0;
         for(int i=0;i<n-k+1;++i)
         {
             c+=count_inversion(arr,i,i+k);
         }
         return c;
     }
     public static int count_inversion(int []arr,int start,int end)
     {
         if(end-start<2)
         return 0;
         int mid=(start+end)>>1;
         int left[]=Arrays.copyOfRange(arr,start,mid);
         int right[]=Arrays.copyOfRange(arr,mid+1,end);
         return count_inversion(arr,start,mid)+count_inversion(arr,mid+1,end)+merge(arr,left,right);
     }
     public static int merge(int []arr,int left[],int right[])
     {
         int c=0;
         int i=0,j=0,k=0;
         while(i<left.length && j<right.length)
         {
             if(left[i]<=right[j])
             arr[k++]=left[i++];
             else
            { arr[k++]=right[j++];
                c+=left.length-i;
            }
         }
         while(i<left.length)
         {
             arr[k++]=left[i++];
         }
         
         while(j<right.length)
         {
             arr[k++]=right[j++];
         }
         return c;
     }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int k=ab.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    arr[i]=ab.nextInt();
	    System.out.println(inversion(arr,n,k));
	}
	 }
}