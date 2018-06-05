import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	 public static int equalSumProduct(int arr[],int n)
	 {
		 int c=0;
		 int product,sum;
		 for(int i=0;i<n;++i)
		 {
			 product=arr[i];
			 sum=arr[i];
			for(int j=i+1;j<n;++j)
			{
				if(product==sum)
					++c;
				product*=arr[j];
				sum+=arr[j];
			}
			if(product==sum)
					++c;
		 }
		 return c;
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
	    System.out.println(equalSumProduct(arr,n));
	}
	 }
}