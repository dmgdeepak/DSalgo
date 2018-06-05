// we can purchase n stocks and can sell them at a time
import java.util.*;
import java.lang.*;
import java.io.*;
class stockdphacker
 {
	 public static int stock(int arr[],int i,int n,int store,int c)
	 {
		 if(i>=n)
			 return 0;
		 return Math.max(stock(arr,i+1,n,store,c),Math.max(stock(arr,i+1,n,store+arr[i],c+1),(arr[i]*c)-store+stock(arr,i+1,n,0,0)));
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
	    System.out.println(stock(arr,0,n,0,0));
	}
	 }
}