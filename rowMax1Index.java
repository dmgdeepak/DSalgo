import java.util.*;
import java.lang.*;
import java.io.*;
class rowMax1Index
 {
	 public static int bSearch(int arr[],int n)
	 {
		 int l=0,h=n-1;
		 while(l<=h)
		 {
			 int mid=((h-l)/2)+l;
			 if(mid==0 || arr[mid]==1 && arr[mid-1]==0)
				 return mid;
			 if(arr[mid]==1)
				 h=mid-1;
			 else if(arr[mid]==0)
				 l=mid+1;
		 }
		 return n;
	 }
	 public static int rowMaxIndex(int arr[][],int m,int n)
	 {
		 int min=n,index=0;
		 for(int i=0;i<m;++i)
		 {
			 int j=bSearch(arr[i],n);
			 //System.out.println("index for row "+i+" is "+j);
			 if(j<min)
			 {
				 min=j;
				 index=i;
			 }
		 }
		 return index;
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
	    System.out.println(rowMaxIndex(arr,m,n));
	}
	 }
}


/* 
42 18
0 0 1 0 0 0 0 0 1 1 1 1 1 1 1 0 1 0 1 0 0 1 0 0 1 0 0 1 1 0 1 0 1 0 1 1 1 0 1 1 0 1 1 0 1 1 1 0 1 0 0 1 1 1 1 1 1 0 0 1 0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 1 1 0 1 1 0 0 0 0 0 0 1 0 0 1 0 1 1 0 0 0 1 1 1 1 1 0 0 0 1 0 1 0 1 1 0 0 0 1 1 1 1 0 0 0 1 0 1 1 1 0 1 0 0 0 1 0 0 0 1 1 1 1 1 1 1 1 1 1 1 0 1 0 0 0 0 0 1 0 0 1 0 1 0 1 0 1 0 1 1 1 0 0 1 0 0 0 0 1 0 1 0 0 1 0 1 1 0 0 0 0 1 1 0 1 0 1 1 1 0 1 1 0 1 0 1 1 0 1 1 0 0 1 0 0 0 1 1 0 1 1 1 1 1 1 0 1 0 0 0 0 0 0 0 1 1 0 1 1 0 0 0 0 0 1 0 1 0 1 1 0 0 1 0 0 0 1 0 0 0 0 1 1 1 0 0 0 1 0 0 1 1 1 1 0 0 1 1 0 0 0 1 1 1 0 1 1 1 1 0 1 0 1 0 0 1 1 0 0 1 0 1 1 0 1 0 0 1 1 0 1 1 0 1 0 0 1 1 1 1 0 1 1 1 1 0 1 1 1 1 0 0 1 0 0 1 0 0 1 0 1 0 1 1 1 1 1 0 0 0 1 1 0 1 0 0 0 1 0 0 0 1 1 1 0 1 0 0 1 0 1 1 0 0 0 1 1 0 1 0 0 0 0 1 1 0 1 0 1 1 0 0 0 0 0 0 1 1 0 1 1 0 1 1 0 1 0 0 1 0 0 1 1 0 1 1 1 1 0 1 0 1 1 1 0 1 1 1 1 0 0 0 0 0 0 1 0 1 0 0 0 1 1 1 0 0 1 1 0 0 0 1 0 1 1 0 0 0 0 1 0 0 1 1 0 0 0 1 0 0 1 0 0 0 1 0 1 0 1 1 0 0 1 0 0 1 1 1 0 1 1 1 0 1 0 0 0 1 0 1 1 1 1 0 0 0 0 0 0 1 1 1 1 1 0 0 0 0 1 0 1 0 1 0 1 0 0 1 1 1 0 0 1 1 0 1 0 1 0 1 1 1 0 0 0 1 0 1 0 1 0 1 0 0 0 1 1 0 0 0 1 0 1 1 1 1 1 0 0 1 0 1 0 1 1 1 1 1 1 1 0 0 1 1 0 0 0 0 0 1 1 0 1 1 1 1 1 1 0 1 0 1 0 0 1 1 1 1 1 1 0 0 0 1 1 0 0 1 1 1 0 1 0 0 1 0 1 0 0 1 0 1 1 1 1 0 0 1 1 0 0 0 1 0 1 0 1 1 0 0 0 1 0 0 1 1 1 0 0 1 0 1 1 0 1 1 0 1 0 0 0 1 1 0 1 0 1 1 1 1 0 0 1 1 0 1 1 1 1 1 0 1 0 1 1 1 1 1 0 0 1 0 1 0 0 1 0 1 0 0 0 1 1 0 1 1 1 0 1 0 1 1 0 0 0 1 1 1 0 0 0 0 1 1 1 1 0 0 1 0 0 1 0 1 1 1 0 0 0 1 0 1 1 1 0 1 0 1 0 0 0 

Its Correct output is:
17

And Your Code's Output is:
23
*/