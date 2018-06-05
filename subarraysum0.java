import java.util.*;
import java.lang.*;
import java.io.*;
class subarraysum0
 {
   public static int subarraysumzero(int arr[],int n)
   {
     HashSet<Integer> set=new HashSet<Integer>();
     int sum=0,count=0;
     for(int i=0;i<n;++i)
     {
       sum+=arr[i];
       System.out.print(i+" old count "+count);
       if(arr[i]==0)
       ++count;
       if(set.contains(sum))
       ++count;
       else
       set.add(sum);
       System.out.println("  count "+count);
     }
     return count;
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
	    System.out.println(subarraysumzero(arr,n));
	}
	 }
}
