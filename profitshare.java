import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	 public static void profit(int arr[],int n)
	 {
		 int i=0;
		 boolean flag=true;
		 while(i<n-1)
		 {
			 int start=200,end=200;
			 while(i<n-1 && arr[i+1]<arr[i++]);
			 start=--i;
			 ++i;
			 if(i==n-1)
			 break;
			 while(i<n && arr[i]>arr[i-1])
			 {
			     ++i;
			 }
			end=--i;
			 if(start!=200 && end!=200)
				 {System.out.print("("+start+" "+end+") ");
				     flag=false;
				 }
				 
		 }
		 if(flag)
		 
				 System.out.print("No Profit");
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
		profit(arr,n);
	    System.out.println();
	}
	 }
}