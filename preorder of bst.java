http://www.geeksforgeeks.org/check-if-a-given-array-can-represent-preorder-traversal-of-binary-search-tree/
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     public static boolean isBst(int arr[],int n)
     {
         Deque<Integer> q=new ArrayDeque<Integer>();
        // q.add(Integer.MIN_VALUE);
         int i=0;
         int root=Integer.MIN_VALUE;
         for(i=0;i<n;++i)
         {
            if(arr[i]<root)
            return false;
            while(!q.isEmpty() && q.peekFirst()<arr[i])
            {
                root=q.removeFirst();
            }
            q.addFirst(arr[i]);
            
         }
         return true;
     }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    arr[i]=ab.nextInt();
	    System.out.println(isBst(arr,n)?1:0);
	}
	 }
}