import java.util.*;
import java.lang.*;
import java.io.*;
class max1bychange0
 {
	 public static int max1(int arr[],int n,int k)
	 {
		 int val[]=new int[n];
		 List<Integer> zero=new ArrayList<Integer>();
		 int size=0,start=-1;
			 val[0]=1;
		 if(arr[0]==0)
		 {
			 zero.add(0);
			 ++start;
		 }
		 for(int i=1;i<n;++i)
		 {
			 if(arr[i]==1)
			 {
				 val[i]=1+val[i-1];
			 }
			 else
			 {
				 if(k>0)
				 {
					 val[i]=1+val[i-1];
					 --k;
					// System.out.print("k > 0 index "+i);
				 }
				 else
				 {
					 val[i]=2+val[i-1]-val[zero.get(++start)];
					// System.out.print("k < 0 index "+i);
				 }
				// System.out.println(" val "+val[i]);
				 zero.add(i);
				 
			 }
		 }
		 int max=0;
		for(int t:val)
			 max=Math.max(max,t);
		 return max;
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
	    System.out.println(max1(arr,n,ab.nextInt()));
	}
	 }
}