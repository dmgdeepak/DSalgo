import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     public static void evenOddpos(int arr[],int n)
	 {
		 List<Integer> even=new ArrayList<Integer>();
		 List<Integer> odd=new ArrayList<Integer>();
		 for(int x:arr)
		 {
			 if((x&1)==1)
			 {
				 odd.add(x);
			 }
			 else
				 even.add(x);
		 }
		 int i=0,j=0;
		 int s=even.size(),s2=odd.size();
		 while(i<s && j<s2)
		 {
			 System.out.print(even.get(i++)+" ");
			 System.out.print(odd.get(j++)+" ");
		 }
		 while(i<s)
			 System.out.print(even.get(i++)+" "); 
		 while(j<s2)
			 System.out.print(odd.get(j++)+" ");
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
	evenOddpos(arr,n);
	    System.out.println();
	}
	 }
}