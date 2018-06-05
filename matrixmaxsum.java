	import java.util.*;
import java.lang.*;
import java.io.*;
class matrixmaxsum
 {
	 static long maxsum=-1;
	 static boolean flag=false;
	 public static void gmaxsum(int arr[][],int n,int i,int sum,int last,boolean possible)
	 {
		 boolean f=false;
		 
		 if(sum>maxsum && possible)
			 maxsum=sum;
		 if(i==n)
			 return;
		 for(int j=0;j<n;++j)
		 {
			 if(arr[i][j]>last)
			 {
				 if(i==n-1)
				 gmaxsum(arr,n,i+1,sum+arr[i][j],arr[i][j],true);
			 else
				 gmaxsum(arr,n,i+1,sum+arr[i][j],arr[i][j],false);
				//f=true;
		 }
		 }
		 //if(!f)
			 
	 }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
		maxsum=-1;
		flag=false;
	    int n=ab.nextInt();
	    int arr[][]=new int[n][n];
	    for(int i=0;i<n;++i)
	    for(int j=0;j<n;++j)
	    arr[i][j]=ab.nextInt();
	gmaxsum(arr,n,0,0,-1,false);
	    System.out.println(maxsum);
	}
	 }}