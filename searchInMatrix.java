import java.util.*;
import java.lang.*;
import java.io.*;
class searchInMatrix
 {
   public static int getRow(int arr[][],int x,int m,int n)
   {
     int lo=0,  high=m-1;
     int res=-1;
     while(lo<=high)
     {
       int mid=(lo+high)>>1;
       if(arr[mid][n-1]==x)
       {
         return Integer.MAX_VALUE;
       }
       if(arr[mid][n-1]>x)
       {
         res=mid;
         high=mid-1;
       }
       else
       {
         lo=mid+1;
       }
     }
     return res;
   }
   public static boolean checkCol(int arr[],int x,int n)
   {
     int lo=0,high=n-1;
     while(lo<=high)
     {
       int mid=(lo+high)>>1;
       if(arr[mid]==x)
       return true;
       if(arr[mid]>x)
       high=mid-1;
       else
       lo=mid+1;
     }
     return false;
   }
   public static boolean isElement(int[][] arr,int x,int m,int n)
   {
     int row=getRow(arr,x,m,n);
     if(row==Integer.MAX_VALUE)
     return true;
     if(row==-1)
     return false;
     System.out.println("row"+row);
     return checkCol(arr[row],x,n);
     //return false;
   }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int m=ab.nextInt();
	    int n=ab.nextInt();
	    int arr[][]=new int[m][n];
	    for(int i=0;i<m;++i)
	    for(int j=0;j<n;++j)
	    arr[i][j]=ab.nextInt();
	    System.out.println(isElement(arr,ab.nextInt(),m,n));
	}
	 }
}
