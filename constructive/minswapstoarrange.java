//together elements less than or equal to k
//together elements less than or equal to k

//idea is to use sliding window concept
// here we have window with size = elements less than or equal to k
//look for greater elements in that window size
//move window one by one and check which element was removed or added
//find minimum elements > k in that window as they are elements needs to swap
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
   public static int minSwap(int arr[],int n,int k)
   {
     int c=0,gk=0; // gk = greather than k,c= less than k
     for(int i=0;i<n;++i)
     {
       if(arr[i]<=k)
       ++c;
     }
     for(int i=0;i<c;++i)
     {
         if(arr[i]>k)
         ++gk;
     }
     int res=gk;
     // System.out.println(gk+" "+c);
     for(int i=0,j=c;j<n;++i,++j)
     {
       if(arr[i]>k)
       --gk;
       if(arr[j]>k)
       ++gk;
       res=Math.min(gk,res);
     }
     return res;
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
	    System.out.println(minSwap(arr,n,ab.nextInt()));
	}
	 }
}
