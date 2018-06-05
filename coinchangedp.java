import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     public static int coinchange(int arr[],int n,int k)
     {
         int mat[]=new int[k+1];
         mat[0]=1;
         for(int i=0;i<n;++i)
         {
             for(int j=arr[i];j<=k;++j)
             {
                 mat[j]+=mat[j-arr[i]];
             }
         }
         return mat[k];
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
	    int k=ab.nextInt();
	    System.out.println(coinchange(arr,n,k));
	}
	 }
}