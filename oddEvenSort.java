import java.util.*;
import java.lang.*;
import java.io.*;
class oddEvenSort
 {
   public static void sortMe(int arr[],int n)
   {
     int start=0;
     for(int i=0;i<n;++i)
     {
       if(arr[i]%2!=0)
       {
         int temp=arr[i];
         arr[i]=arr[start];
         arr[start]=temp;
         start++;
       }
     }
     Arrays.sort(arr,Collections.reverseOrder(),0,start);
     Arrays.sort(arr,start+1,n);
     for(int x:arr)
     System.out.print(x+" ");
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
      sortMe(arr,n);
	    System.out.println();
	}
	 }
}
