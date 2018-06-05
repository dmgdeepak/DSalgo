import java.util.*;
import java.lang.*;
import java.io.*;
class maxFromSubarrayK
 {
 	public static void fn(int a[],int n,int k)
 	{
 	   Deque<Integer> q=new ArrayDeque<Integer>();
     int i=0;
     for(;i<k;++i)
     {
       while(!q.isEmpty() && a[i]>=a[q.peek()])
       {
         q.removeLast();
       }
       q.addLast(i);
     }
     for(;i<n;++i)
     {
     System.out.print(a[q.peek()]+" ");
       while(!q.isEmpty() && q.peek()<=i-k)
       q.removeFirst();
       while(!q.isEmpty() && a[i]>=a[q.peek()])
       {
         q.removeLast();
       }
       q.addLast(i);
     }
     System.out.print(a[q.peek()]);
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
	    for(int i=0;i<n;++i)
	    arr[i]=ab.nextInt();
	    fn(arr,n,k);
	    System.out.println();
	}
	 }
}
