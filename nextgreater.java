import java.util.*;
import java.lang.*;
import java.io.*;
class nextgreater
 {
 	public static void nextgreaterEle(int a[],int n)
 	{
    Stack<Integer> s=new Stack<>();
    s.push(0);
    for(int i=1;i<n;++i)
    {
        while(!s.isEmpty() && a[s.peek()]<a[i])
        { a[s.pop()]=a[i];}

      s.push(i);
    }
    while(!s.isEmpty())
      { a[s.pop()]=-1;}
      for(int x:a)
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
      nextgreaterEle(arr,n);
	    System.out.println();
	}
	 }
}
