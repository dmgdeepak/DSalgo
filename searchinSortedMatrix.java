import java.util.*;
import java.lang.*;
import java.io.*;
class searchinSortedMatrix
 {
 	public static boolean fn(int a[][],int n,int m,int k)
 	{
      int i=n-1,j=0;
      while(i>=0 && j<m)
      {
        if(a[i][j]==k)
        return true;
        if(a[i][j]<k)
        ++j;
        else
        --i;
      }
      return false;
 	}
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int m=ab.nextInt();
	    int arr[][]=new int[n][m];
	    for(int i=0;i<n;++i)
	    for(int j=0;j<m;++j)
	    arr[i][j]=ab.nextInt();
    	    int k=ab.nextInt();
	    System.out.println(fn(arr,n,m,k));
	}
	 }
}
