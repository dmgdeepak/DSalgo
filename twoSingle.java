import java.util.*;
import java.lang.*;
import java.io.*;
class twoSingle
 {
   public static int getComplement(int n)
   {
     int bits=((int)Math.floor(Math.log(n)/Math.log(2)))+1;
  //System.out.println(Integer.toBinaryString((1<<bits)-1)); all 1's
  n=((1<<bits)-1)^n;
  return n;
  }
   public static void findNumbers(int arr[],int n)
   {
     int res=arr[0];
     for(int i=1;i<n;++i)
     res^=arr[i];
     int compl= getComplement(res-1);
     int lastbit=compl&res;
     System.out.println(compl);
     int x,y;
     x=y=0;
     for(int i=0;i<n;++i)
     {
       if((lastbit&arr[i])>0)
       {
         x^=arr[i];
       }
       else
       y^=arr[i];
     }
     System.out.println(x+" "+y);
   }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
    n=2*n+2;
	    int arr[]=new int[n];
	    for(int i=0;i<n;++i)
	    arr[i]=ab.nextInt();
      findNumbers(arr,n);
	    System.out.println();
	}
	 }
}
