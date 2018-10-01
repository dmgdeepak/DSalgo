	import java.util.*;
import java.lang.*;
import java.io.*;
class arrayntime
 {
	 public static long getsum(int arr[],int n)
	 {
		  long sum=arr[0];
		for(int i=1;i<n;++i)
			sum+=arr[i];
		return sum;
	 }
	  public static void kadane(int arr[],int n,int k)
	  {
		  long sum=0,prevsum=0;
		  long temp=0,i=0;
		  ntime:
		  while(i++<k)
		  {
			  for(int x:arr)
			  {
				  temp+=x;
				  if(temp>sum)
					  sum=temp;
				  if(temp<0)
					  temp=0;
			  }
			  if(i==1 && sum==getsum(arr,n))
			  {
				 sum= k*getsum(arr,n);
				 break ntime;
			  }
			  if(sum==prevsum)
				break ntime;
		/*	if(sum%(i-1)==0 && prevsum%(i-2)==0)
			{
				if(prevsum/(i-2)*(i-1)==sum)
					sum=prevsum/(i-2)*k;
				break ntime;
			}*/
				
prevsum=sum;			
		  }
		  System.out.println(sum);
	  }
 public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0)
	{
	    int n=ab.nextInt();
	    int k=ab.nextInt();
		long sum=0;
		boolean pos=false,neg=false;
	    int arr[]=new int[n];
	    for(int i=0;i<n;++i)
		{
	    arr[i]=ab.nextInt();
		if(arr[i]>=0)
			pos=true;
		else
			neg=true;
	}
	if(pos && neg)
		kadane(arr,n,k);
	else {if(pos)
	{
		sum=getsum(arr,n)*k;
		
	}
	if(neg)
	{
		sum=Integer.MIN_VALUE;
		for(int x:arr)
			if(x>sum)
				sum=x;
	}
	
	    System.out.println(sum);
	}
	}
	 }}