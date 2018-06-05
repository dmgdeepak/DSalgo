import java.util.*;
import java.lang.*;
import java.io.*;
class summofallsubset
//2357
 {
	 public static double summofallsubset(int arr[],int n)
	 {
		 int dp[][]=new int[n+1][n+1];
		 double res=arr[0];
		 for(int gap=1;gap<n;++gap)
		 {
		     res+=arr[gap];
			 int i=0,j=gap;
			 double sum=0;
			 while(j<n)
			 {
				 if(j<i)
				 {
					 res+=sum/(gap+1);
					  System.out.println(sum+"  "+sum/(gap+1));
					 sum=0;
					 ++j;
					 i-=gap;
				 } 
				 else
				 {
					 sum+=arr[i];
					 ++i;
				 }
			 }
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
	    System.out.println(summofallsubset(arr,n));
	}
	 }
}