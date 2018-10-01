import java.util.*;
import java.lang.*;
import java.io.*;
class maxofMinForEverywindow
 {
   public static void prevSmallerIndex(int a[],int j[],int n)
   {
     Stack<Integer> s=new Stack<Integer>();
     s.push(n-1);
     for(int i=n-2;i>=0;--i)
     {
       while(!s.isEmpty() && a[s.peek()]>a[i])
       {
         int k=s.pop();
         j[k]=i;
       }
          s.push(i);
     }
     while(!s.isEmpty())
     {
       int k=s.pop();
       j[k]=-1;
     }
   }
   public static void nextSmallerIndex(int a[],int j[],int n)
   {
     Stack<Integer> s=new Stack<Integer>();
     s.push(0);
     for(int i=1;i<n;i++)
     {
         while(!s.isEmpty() && a[s.peek()]>a[i])
         {
           int k=s.pop();
           j[k]=i;
         }
            s.push(i);
     }
     while(!s.isEmpty())
     {
       int k=s.pop();
       j[k]=n;
     }
   }
 	public static void fn(int a[],int n)
 	{
    int nextSmaller[]=new int[n];
    int prevSmaller[]=new int[n];
    nextSmallerIndex(a,nextSmaller,n);
    prevSmallerIndex(a,prevSmaller,n);
    /*
    for(int x:prevSmaller)
    System.out.print(x+" "); */
    //Now we know that a[i] is minimum in window from prevSmaller to nextSmaller
    //find max for the same size of window and store them in array
    int res[]=new int[n+1]; // it holds max of min value for window size n
    for(int i=0;i<n;++i)
    {
      int t=nextSmaller[i]-prevSmaller[i]-1;
     res[t]=Math.max(res[t],a[i]);
    }
    // now we will be having result but some values are missing
    //as per observation res[i] will be greater than or equal to res[i+1..n]
    //fill values
    for(int i=n-1;i>=1;--i)
    {
      res[i]=Math.max(res[i],res[i+1]);
    }
    for(int i=1;i<=n;++i)
    System.out.print(res[i]+" ");
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
      fn(arr,n);
	    System.out.println();
	}
	 }
}
