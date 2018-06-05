import java.util.*;
import java.lang.*;
import java.io.*;
class subsetbacktrack
 {
   public  static void subset(ArrayList<Integer> sol,int arr[],int i,int n)
   {
       System.out.print(sol);
     if(i>=n)
     {
       return;
     }
     sol.add(arr[i]);
     subset(sol,arr,i+1,n);
     sol.remove(sol.size()-1);
    // System.out.print(sol);
      subset(sol,arr,i+1,n);
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
      ArrayList<Integer> sol=new ArrayList<Integer>();
    /*  for(int i=0;i<n;++i)
      { */
        subset(sol,arr,0,n);
      //}
	    System.out.println();
	}
	 }
}
