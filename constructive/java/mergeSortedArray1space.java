//it will make a[] elements smaller than b[0]
import java.util.*;
import java.lang.*;
import java.io.*;
class mergeSortedArray1space
 {
     public static int nextGap(int gap)
     {
         if(gap<=1)
         return 0;
         return (gap/2)+(gap%2);
     }
 	public static void merge(int a[],int n,int b[],int m)
 	{
 	    for(int gap=nextGap(m+n);gap>=1;gap=nextGap(gap))
 	    {
 	        int i=0;
 	        //maintain 1st array sorted as after few interation it changes
 	        for(;i+gap<n;++i)
 	        {
 	            if(a[i]>a[i+gap])
 	            {
 	                int temp=a[i];
 	                a[i]=a[i+gap];
 	                a[i+gap]=temp;
 	            }
 	        }
 	        //now we have reached to boundry of first array so proceed to next index
 	        //i.e. between two arrays (start,end)
 	        int j=gap>n?gap-n:0;
 	        for(;j<m && i<n;++j,++i)
 	        {
 	            if(a[i]>b[j])
 	            {
 	                int temp=a[i];
 	                a[i]=b[j];
 	                b[j]=temp;
 	            }
 	        }
 	        if(j<m)
 	        for(j=0;j+gap<m;++j)
 	        {
 	            if(b[j]>b[j+gap])
 	            {
 	                int temp=b[j];
 	                b[j]=b[j+gap];
 	                b[j+gap]=temp;
 	            }
 	        }
 	    }
 	    for(int x:a)
 	    System.out.print(x+" ");
 	    for(int x:b)
 	    System.out.print(x+" ");
 	}
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int m=ab.nextInt();
	    int arr[]=new int[n];
	    int arr2[]=new int[m];
	    for(int i=0;i<n;++i)
	    arr[i]=ab.nextInt();
	    for(int i=0;i<m;++i)
	    arr2[i]=ab.nextInt();
	    merge(arr,n,arr2,m);
	    System.out.println();
	}
	 }
}
