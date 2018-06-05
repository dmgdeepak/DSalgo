import java.util.*;
import java.lang.*;
import java.io.*;
class max1byflipk0bits
 {
     public static int max1(int arr[],int n,int k)
     {
         int i=0;
         int max=0;
         int startindex=0;
         while(i<n)
         {
             if(arr[i]==0){
//decrement count of bits that can be changed
             if(k>0)
             {
                 --k;
             }
    else
    {
     while(startindex<=i && arr[startindex++]!=0);
     
    }
    }
    ++i;
    max=Math.max(max,i-startindex);
         }
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
	    System.out.println(max1(arr,n,ab.nextInt());
	}
	 }
}