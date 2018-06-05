import java.util.*;
import java.lang.*;
import java.io.*;
class missingRange
 {
   public static void printMissingRange(int arr[],int n)
   {
     int prev=-1;
     HashSet<Integer> set=new HashSet<Integer>();
     for(int x:arr)
     set.add(x);
     System.out.print("[ ");
     for(int i=0;i<1000;++i)
     {
       if(set.contains(i) && prev!=-1)
      {
        //if difference is >=2
          if(i-prev>1)
          System.out.print(prev+"-"+(i-1)+" ");
          else
          System.out.print(prev+" ");
          prev=-1;
       }
       else if(!set.contains(i) && prev==-1)
       {
         prev=i;
       }
     }
     if(prev!=-1 && prev!=999)
       System.out.print(prev+"-"+999+" ");

     if(prev!=-1 && prev==999)
       System.out.print(999+" ");
       System.out.print("]");
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
      printMissingRange(arr,n);
	    System.out.println();
	}
	 }
}
