import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     public static void print(List<Integer> arr,int n,boolean flag)
     {
         if(flag)
         {
             for(int i=0;i<n;++i)
             {
                 System.out.print(arr.get(i)+" ");
             }
         }
         else
         {
           for(int i=n-1;i>=0;++i)
             {
                 System.out.print(arr.get(i)+" ");
             }  
         }
     }
    public static void checksort(List<Integer> arr,int n)
     {
         PriorityQueue<Integer> q=new PriorityQueue<Integer>(Collections.reverseOrder());
         q.offer(arr.get(n-1));
         for(int i=n-2;i>=0;--i)
         {
             if(arr.get(i)<q.peek())
             {
                 print(arr,i,true);
                  System.out.print(" got "+arr.get(i)+" "+q.poll()+" ");
                 q.offer(arr.get(i));
                 Stack<Integer> s=new Stack<Integer>();
                 while(!q.isEmpty())
                 {
                     s.push(q.poll());
                 }
                 while(!s.isEmpty())
                 System.out.print(s.pop()+" ");
                 break;}
             else
             {q.offer(arr.get(i));}
         }
         
     }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    List<Integer> arr=new ArrayList<Integer>();
	    boolean c=false;
	    arr.add(ab.nextInt());
	    for(int i=1;i<n;i++)
	    {
	        arr.add(ab.nextInt());
	        
	        if(arr.get(i-1)<arr.get(i))
	        c=true;
	    }
	    if(!c)
	    print(arr,n,false);
	    else
	    checksort(arr,n);
	}
	 }
}