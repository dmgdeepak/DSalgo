//https://practice.geeksforgeeks.org/problems/smallest-positive-missing-number/0
// Idea is to first bring -ve at first then mark all positive number's occurence to -ve
import java.util.*;
import java.lang.*;
import java.io.*;
class smallestPosMissingNumber
 {
   public static int getMissing(int arr[],int n)
   {
     int start=0;
     for(int i=0;i<n;++i)
     {
       if(arr[i]<1)
       {
        // while(start<n && start!=i && arr[start]<1);
         int temp=arr[i];
        // System.out.println("swapping "+arr[i]+" to "+arr[start]+" i "+i+" j "+start);
         arr[i]=arr[start];
         arr[start]=temp;
         start++;
       }
     }
     int i=0;
     //get index of 1st positive number
     for(i=0;i<n;++i)
     if(arr[i]>0)
     break;
     int posindex=i;
    // System.out.println(start);
     for(;i<n;++i)
     {
       if(Math.abs(arr[i])-1>0 &&Math.abs(arr[i])<=n-posindex)
       {
         arr[posindex+Math.abs(arr[i])-1]=-arr[posindex+Math.abs(arr[i])-1];
       }
     }
     for(i=posindex;i<n;++i)
     {
       if(arr[i]>0)
       {
         return i-posindex+1;
       }
     }

     return n-posindex+1;
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
	    System.out.println(getMissing(arr,n));
	}
	 }
}
