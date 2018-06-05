import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	 public static int subSetNoPairDivisibleByK(int arr[],int n,int k)
	 {
		 int hash[]=new int[k];
		 for(int i=0;i<n;++i)
		 {
			 ++hash[arr[i]%k];
		 }
		 hash[0]=Math.min(hash[0],1);
		 //as k/2 + k/2 equal to k and more than 2 elements with remainder 0 hence include only 1
		 if(k%2==0)
			 hash[k/2]=Math.min(hash[k/2],1);
		 int res=Math.min(hash[0],1);
		 for(int i=1;i<=k/2;++i)
		 {
			 res+=Math.max(hash[i],hash[k-i]);
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
	    int k=ab.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;++i)
	    arr[i]=ab.nextInt();
	    System.out.println(subSetNoPairDivisibleByK(arr,n,k));
	}
	 }
}